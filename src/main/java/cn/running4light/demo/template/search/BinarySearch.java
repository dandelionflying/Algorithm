package cn.running4light.demo.template.search;

/**
 * @author running4light
 * @description 二分查找
 *      1.时间复杂度：O(logn) 不算上排序时间
 * @createTime 2021/5/28 9:52
 */
public class BinarySearch {
    /**
     * @Description 二分查找--递归方式
     * @Author running4light朱泽雄
     * @CreateTime 10:34 2021/5/28
     */
    public static <E extends Comparable<E>> Integer search(E[] arr, E value){
        int length = arr.length;
        if(length < 1){
            return -1;
        }
        return search4Asc(arr, 0, length - 1, value);
    }
    /**
     * @Description 二分查找--递归（递增数组）
     * @Author running4light朱泽雄
     * @CreateTime 10:23 2021/5/28
     */
    private static <E extends Comparable<E>> Integer search4Asc(E[] arr, int l, int r, E value) {
        if(l > r){
            return -1;
        }
        int mid =  l+ (r - l)/2;
        if(arr[mid].compareTo(value) == 0){
            return mid;
        } else if(arr[mid].compareTo(value) < 0){
            return search4Asc(arr, mid + 1 , r, value);
        } else{
            return search4Asc(arr, l , mid - 1, value);
        }
    }
    /**
     * @Description 二分查找--递归（递减数组）
     * @Author running4light朱泽雄
     * @CreateTime 10:28 2021/5/28
     */
    private static <E extends Comparable<E>> Integer search4Desc(E[] arr, int l, int r, E value) {
        if(l > r){
            return -1;
        }
        int mid =  l+ (r - l)/2;
        if(arr[mid].compareTo(value) == 0){
            return mid;
        } else if(arr[mid].compareTo(value) < 0){
            return search4Desc(arr, l , mid - 1, value);
        } else{
            return search4Desc(arr, mid + 1 , r, value);
        }
    }
    /**
     * @Description 二分查找-- 非递归方式
     * @Author running4light朱泽雄
     * @CreateTime 10:35 2021/5/28
     */
    public static <E extends Comparable<E>> Integer searchWithoutRecursion(E[] arr, E value){
        int length = arr.length;
        if(length < 1){
            return -1;
        }
        int r = length - 1;
        for (int i = 0; i <= r; ) {
            int mid =  i+ (r - i)/2;
            if (arr[mid].compareTo(value) == 0)
                return mid;
            if(arr[mid].compareTo(value) < 0){
                i = mid + 1;
                continue;
            }
            if(arr[mid].compareTo(value) > 0){
                r = mid - 1;
                continue;
            }
        }
        return -1;
    }
    /**
     * @Description 二分查找--查找递增数组中等于target的最小索引
     * @Author running4light朱泽雄
     * @CreateTime 14:13 2021/5/28
     */
    public static <E extends Comparable<E>> Integer searchExistMinElement(E[] arr, E value){
        int length = arr.length;
        if(length < 1){
            return -1;
        }
        int l = 0;
        int r = length - 1;
        int mid = 0;
        while (l < r) {
            mid =  l+ (r - l)/2;
            if(arr[mid].compareTo(value) == 0){
                r = mid;
                continue;
            }
            if(arr[mid].compareTo(value) < 0){
                l = mid + 1;
                continue;
            }
            if(arr[mid].compareTo(value) > 0){
                r = mid - 1;
                continue;
            }
        }
        if(arr[l] == value){
            // 查找结束并且存在目标值
//            System.err.println(l + " " + r + " " + mid);
            return l;
        }
        return -1;
    }
    /**
     * @Description 二分查找--查找递增数组中等于target的最大索引
     * @Author running4light朱泽雄
     * @CreateTime 15:19 2021/5/28
     */
    public static <E extends Comparable<E>> Integer searchExistMaxElement(E[] arr, E value){
        int length = arr.length;
        if(length < 1){
            return -1;
        }
        int l = 0;
        int r = length - 1;
        int mid = 0;
        while (l < r - 1) {
            mid =  l+ (r - l)/2;
            if(arr[mid].compareTo(value) == 0){
                l = mid;
                continue;
            }
            if(arr[mid].compareTo(value) < 0){
                l = mid + 1;
                continue;
            }
            if(arr[mid].compareTo(value) > 0){
                r = mid - 1;
                continue;
            }
        }
        if(arr[mid] == value){
            // 查找结束并且存在目标值
//            System.err.println(l + " " + r + " " + mid);
            return mid;
        }
        return -1;
    }
}
