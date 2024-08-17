class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> words = new HashSet<>(wordList);
        if(!words.contains(endWord)) return 0;
        System.out.println(words);
        Queue<String> q = new LinkedList<>();
        q.add(beginWord);
        int level=1;
        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                String word = q.poll();
                char[] wordChars = word.toCharArray();

                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        wordChars[j] = ch;
                        String newWord = new String(wordChars);

                        if (newWord.equals(endWord)) {
                            return level + 1;
                        }

                        if (words.contains(newWord)) {
                            q.add(newWord);
                            words.remove(newWord);
                        }
                    }
                    wordChars[j] = originalChar;
                }
            }
            level++;
        }

        return 0;
    }
}