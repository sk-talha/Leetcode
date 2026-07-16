class Solution {
    public static int compress(char[] chars) {

        int index = 0;

        for (int i = 0; i < chars.length; i++) {

            int count = 1;

            // Count consecutive repeating characters
            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // Write the character
            chars[index++] = chars[i];

            // Write the count if greater than 1
            if (count > 1) {
                String str = String.valueOf(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[index++] = str.charAt(j);
                }
            }
        }

        return index;
    }
}