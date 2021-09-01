package Array;

/**
 * @Auther Eternal
 * @Date 2021/8/31
 * 加一
 */
public class ArrayTest7 {
    public static void main(String[] args) {
        int[] digits = new int[] {2, 2, 9};

        int[] digitss = plusOne(digits);
        for (int i : digitss) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        int length = digits.length;

        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int temp[] = new int[length + 1];
        temp[0] = 1;
        return temp;
    }
}
