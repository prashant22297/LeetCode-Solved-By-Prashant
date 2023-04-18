class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length(), len2 = word2.length();
        char[] result = new char[len1 + len2];
        int p1 = 0, p2 = 0, i = 0;

        while (p1 < len1 || p2 < len2) {
            if (p1 < len1) result[i++] = word1.charAt(p1++);
            if (p2 < len2) result[i++] = word2.charAt(p2++);
        }

        return new String(result);
    }
}