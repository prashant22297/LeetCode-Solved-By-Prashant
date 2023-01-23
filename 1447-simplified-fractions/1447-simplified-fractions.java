class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> ans= new ArrayList<>();
        HashSet<Double> temp = new HashSet<>();
        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(!temp.contains((double)i/j)){
                    temp.add((double)i/j);
                    String s = i+"/"+j;
                    ans.add(s);
                }
            }
        }
        return ans;
    }
}