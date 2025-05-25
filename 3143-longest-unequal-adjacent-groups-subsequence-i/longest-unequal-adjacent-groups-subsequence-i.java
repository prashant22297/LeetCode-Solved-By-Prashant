import java.util.*;

class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> dp0 = new ArrayList<>();
        List<String> dp1 = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (groups[i] == 0) {
                List<String> newDp0 = new ArrayList<>(dp1);
                newDp0.add(words[i]);
                if (newDp0.size() > dp0.size()) {
                    dp0 = newDp0;
                }
            } else {
                List<String> newDp1 = new ArrayList<>(dp0);
                newDp1.add(words[i]);
                if (newDp1.size() > dp1.size()) {
                    dp1 = newDp1;
                }
            }
        }

        return dp0.size() > dp1.size() ? dp0 : dp1;
    }
}
