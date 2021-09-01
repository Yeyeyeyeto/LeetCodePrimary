package Array;

/**
 * @Auther Eternal
 * @Date 2021/8/30
 * 旋转数组
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int temp[] = new int[length];

        for (int i = 0; i < length; i++) {
            temp[i] = nums[i];
        }

        for (int i = 0; i < length; i++) {
            nums[(i + k) % length] = temp[i];
            System.out.print((i + k) % length + " ");
        }
    }

}
