package cn.running4light.demo.finished;

import cn.running4light.demo.template.search.BinarySearch;
import cn.running4light.demo.utils.SearchUtil;

/**
 * @author running4light
 * @description 牛客--二分查找
 *  请实现有重复数字的升序数组的二分查找
 * 给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
 * eg:
 * 输入：[1,2,4,4,5],4
 * 返回值：2
 * 说明：从左到右，查找到第1个为4的，下标为2，返回2
 * @createTime 2021/5/28 11:43
 */
public class NC105 {
    public int search (Integer[] nums, Integer target) {
//        return BinarySearch.searchExistMinElement(nums, target);
        return BinarySearch.searchExistMaxElement(nums, target);
    }
}
