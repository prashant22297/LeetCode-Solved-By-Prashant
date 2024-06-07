class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";
        Stack<Character> s = new Stack<>();
        int i = 0;
        for (char ch : num.toCharArray()) {
            if (k == 0 || s.isEmpty())
                s.push(ch);
            else if (s.peek() < ch) {
                s.push(ch);
                continue;
            } else {
                while (!s.isEmpty() && s.peek() > ch && k != 0) {
                    s.pop();
                    k--;
                }
                s.push(ch);
            }
        }
        while (k != 0) {
            s.pop();
            k--;
        }
        StringBuilder sh = new StringBuilder();
        while (!s.isEmpty()) {
            sh.append(s.pop());
        }

        sh = sh.reverse();

        while (sh.length() > 0 && sh.charAt(0) == '0')
            sh.deleteCharAt(0);
        return sh.length() > 0 ? sh.toString() : "0";
    }
}