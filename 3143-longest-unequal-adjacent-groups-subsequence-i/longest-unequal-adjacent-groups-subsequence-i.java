class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> startsWithZero = new ArrayList<>();
        List<String> startsWithOne = new ArrayList<>();
        boolean zero = true;
        boolean one = true;
        for (int i = 0; i < n; i++) {
            if (zero) {
                if (groups[i] == 0) {
                    startsWithZero.add(words[i]);
                    zero = false;
                }
            } else {
                if (groups[i] == 1) {
                    startsWithZero.add(words[i]);
                    zero = true;
                }

            }
            if (one) {
                if (groups[i] == 1) {
                    startsWithOne.add(words[i]);
                    one = false;
                }
            } else {
                if (groups[i] == 0) {
                    startsWithOne.add(words[i]);
                    one = true;
                }

            }
        }
        return startsWithZero.size() > startsWithOne.size() ? startsWithZero : startsWithOne;
    }
}