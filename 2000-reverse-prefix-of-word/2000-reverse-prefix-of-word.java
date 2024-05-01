class Solution {

    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean flag = false;
        for (; i < word.length(); i++) {
            char c = word.charAt(i);
            sb.append(c);
            if (c == ch) {
                flag = true;
                break;
            }
        }
        if (flag==false) return word;
        sb.reverse();
        if (i + 1 < word.length()) sb.append(word.substring(i + 1));
        return sb.toString();
    }
}
