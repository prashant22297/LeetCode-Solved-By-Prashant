class Solution {
    public int maximum69Number(int num) {
        // Change the 1st 6 to 9
        char[] ch = String.valueOf(num).toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }
        }
        return Integer.parseInt(String.valueOf(ch));
    }
}