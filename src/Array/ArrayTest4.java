package Array;

import java.util.Arrays;

/**
 * @Auther Eternal
 * @Date 2021/8/31
 * 存在重复元素
 */
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};

        System.out.println(containsDuplicate(nums));
    }


    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
}
