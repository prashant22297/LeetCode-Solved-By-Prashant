class Solution {
    public List<Integer> lexicalOrder(int n) {
        String[] st = new String[n];
        for(int i=0;i<n;i++){
            st[i]=""+(i+1);
        }
        Arrays.sort(st);
        List<Integer> result = new ArrayList<>();
        for (String s : st) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }
}