package Array;

/**
 * @Auther Eternal
 * @Date 2021/9/1
 * 两数之和
 */
public class ArrayTest9 {
    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] nums2 = towSum(nums, target);
        for (int i : nums2) {
            System.out.print(i + " ");
        }

    }

    public static int[] towSum(int[] nums, int target) {
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
