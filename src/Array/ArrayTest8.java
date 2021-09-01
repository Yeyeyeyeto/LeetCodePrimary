package Array;

/**
 * @Auther Eternal
 * @Date 2021/9/1
 * 移动零
 */
public class ArrayTest8 {
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 0, 3, 12};

        moveZeroes2(nums);
        for (int num : nums) {
            System.out.print(num  + " ");
        }
    }

    public static void moveZeroes(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            }
        }

        while (k-- > 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    int num = nums[i + 1];
                    nums[i + 1] = nums[i];
                    nums[i] = num;
                }
            }
        }
    }

    public static void moveZeroes2(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) nums[index++] = nums[i];
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
