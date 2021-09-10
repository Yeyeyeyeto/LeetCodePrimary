package String;

/**
 * @Auther Eternal
 * @Date 2021/9/8
 * 有效的字母异位词
 */
public class StringTest4 {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letterCount = new int[26];

        for (int i = 0; i < s.length(); i++) letterCount[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++) letterCount[t.charAt(i) - 'a']--;

        for (int count : letterCount) if (count != 0) return false;

        return true;
    }
}
