package cn.running4light.demo.unfinished;

/**
 * @decription 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class JZ6 {
    public int minNumberInRotateArray(int [] array) {

        if(array.length >0){
            int begin = 0;
            int length = array.length;
            int end = array.length - 1;
            for (int i = 0; i <= (length%2 == 1 ? length/2+1: length/2); i ++){
                if(array[i]>array[end]){
                    end--;
                    continue;
                }else{
                    if(i == end){
                        System.err.println("ppppppppp");
                    }
                    if(i == 0){
                        return array[i];
                    }
                    if(array[i] > array[end+1]){
                        return array[end+1];
                    }else{
                        return array[i];
                    }
                }
            }
            return array[0];
        }else{
            return 0;
        }
    }

    public void dvide(int[] left, int right[] ,int length){

    }



}
/**
 * 3 4 5 1 2
 * 5 1 2 3 4
 * 2 3 4 5 1
 * 4, 5, 6, 1, 2, 2, 3, 3
 *
 * */