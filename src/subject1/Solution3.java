package subject1;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < chars.length; i++) {
            int progress = 0;
            for (int j = i; j < chars.length; j++) {
                if (charSet.add(chars[j])) {
                    progress++;
                } else {
                    break;
                }
            }
            charSet.clear();
            if (progress > max) {
                max = progress;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int i = new Solution3().lengthOfLongestSubstring("");
        System.out.println(i);
    }

}
