package com.fzf.msp.day1;

/**
 * @author fanZhiFei
 * @create 2022/7/31
 * 704. 二分查找
 */
public class Test01 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int search = search(nums, target);
        System.out.println(search);
    }

    /**
     * 二分法查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (target < num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        //画图，举个例子即可知道
        return -1;
    }
}
