class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] mergedWordFreq= mergeWordFrequency(words2);
        for (String word : words1) {
            int[] freq = calculateFrequency(word.toCharArray());
            boolean flag = true;
            for (int i = 0; i < 26; i++) {
                if(mergedWordFreq[i]>freq[i]){
                    flag = false;
                    break;
                }
            }
            if(flag)
            ans.add(word);
        }
        return ans;
    }

    public int[] mergeWordFrequency(String[] words2) {
        StringBuilder mergedWord = new StringBuilder();
        int[] mergedWordFreq = new int[26];
        for (String word : words2) {
            int[] freq = calculateFrequency(word.toCharArray());
            for (int i = 0; i < 26; i++) {
                mergedWordFreq[i] = Math.max(mergedWordFreq[i], freq[i]);
            }
        }
        return mergedWordFreq;
    }

    public int[] calculateFrequency(char[] word) {
        int[] freq = new int[26];
        for (int i = 0; i < word.length; i++) {
            freq[word[i] - 'a']++;
        }
        return freq;
    }
}