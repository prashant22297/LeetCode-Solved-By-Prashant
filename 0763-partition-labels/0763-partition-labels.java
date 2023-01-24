class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> last= new HashMap<>();
        for(int i=0;i<s.length();i++){
            last.put(s.charAt(i),i);
            // last[s.charAt(i)]=i;
        }
        List<Integer> ans = new ArrayList<>();
        int prev=-1, mx =0;
        for(int i=0;i<s.length();i++){
            mx= Math.max(mx,last.get(s.charAt(i)));
            if(mx == i) {
                ans.add(mx-prev);
                prev=mx;
            }
                         
        }
        return ans;
    }
}