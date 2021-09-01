package Array;

import java.util.Arrays;

/**
 * @Auther Eternal
 * @Date 2021/8/31
 * 只出现一次的数字
 */
public class ArrayTest5 {
    public static void main(String[] args) {
        int[] nums = new int[] {4, 1, 2, 1, 2};

        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }

}
