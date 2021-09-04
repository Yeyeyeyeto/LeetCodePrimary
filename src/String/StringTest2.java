package String;

/**
 * @Auther Eternal
 * @Date 2021/9/4
 * 整数反转
 */
public class StringTest2 {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = x % 10;
            int newRes = res * 10 + t;
            if ((newRes - t) / 10 != res) return 0;
            res = newRes;
            x /= 10;
        }
        return res;
    }
}
