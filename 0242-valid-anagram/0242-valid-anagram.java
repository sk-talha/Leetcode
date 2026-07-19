import java.util.Arrays;

class Solution {
    public boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        char[] str1a = str1.toCharArray();
        char[] str2a = str2.toCharArray();

        Arrays.sort(str1a);
        Arrays.sort(str2a);

        return Arrays.equals(str1a, str2a);

    }
}