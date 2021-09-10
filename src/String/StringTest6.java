package String;

/**
 * @Auther Eternal
 * @Date 2021/9/10
 * 字符串转换整数 (atoi)
 */
public class StringTest6 {
    public static void main(String[] args) {
        String s = "words and 987";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) return 0;

        boolean flag = true;
        int index = 0;

        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            index = 1;
            if (s.charAt(0) == '-') flag = false;
        }

        int result = 0;
        for (int i = index; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) break;
            int temp = result * 10 + (s.charAt(i) - '0');
            if (temp / 10 != result) return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = temp;
        }

        return flag ? result : -result;
    }
}
