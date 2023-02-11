class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for (char ch: word1.toCharArray()) fre1[ch - 'a']++;
        for (char ch: word2.toCharArray()) fre2[ch - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (fre1[i] == 0) continue;
            fre1[i]--;
            for (int j = 0; j < 26; j++) {
                if (fre2[j] == 0) continue;
                fre2[j]--;
                fre1[j]++;
                fre2[i]++;
                int d1 = 0, d2 = 0;
                for (int ii: fre1)
                    if (ii >= 1) d1++;
                for (int ii: fre2)
                    if (ii >= 1) d2++;
                if (d1 == d2) return true;
                else {
                    fre1[j]--;
                    fre2[i]--;
                }
                fre2[j]++;
            }
            fre1[i]++;
        }
        return false;
    }
}