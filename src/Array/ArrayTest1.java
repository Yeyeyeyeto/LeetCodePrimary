package Array;

/**
 * @Auther Eternal
 * @Date 2021/8/30
 * 删除排序数组中的重复项
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int[] nums = new int[] {1,1,2};

        int len = removeDuplicates(nums);

        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int len = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[len] != nums[i]) {
                len++;
                nums[len] = nums[i];
            }
        }

        return len + 1;
    }

}