class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        // List<Integer> containsX = new ArrayList<>();
        // for (int i = 0; i < words.length; i++) {
        //     if (words[i].indexOf(x) != -1)
        //         containsX.add(i);

        // }
        // return containsX;
        return IntStream.range(0, words.length).filter(i -> words[i].indexOf(x) != -1).boxed().toList();

    }
}