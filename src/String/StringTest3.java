package String;

/**
 * @Auther Eternal
 * @Date 2021/9/4
 * 字符串中的第一个唯一字符
 */
public class StringTest3 {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        int count[] = new int[26];
        char[] chars = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            count[chars[i] - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[chars[i] - 'a'] == 1)
                return i;
        }
        return-1;
    }
}
