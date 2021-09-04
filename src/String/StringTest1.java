package String;

/**
 * @Auther Eternal
 * @Date 2021/9/4
 * 反转字符串
 */
public class StringTest1 {
    public static void main(String[] args) {
        char[] str = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(str);
        for (char c : str) {
            System.out.print(c);
        }
    }

    public static void reverseString(char[] s) {
        int length = s.length;
        char temp;

        for (int i = 0; i < length/2; i++) {
            temp = s[i];
            s[i] = s[length - 1 - i];
            s[length - 1 - i] = temp;
        }
    }
}
