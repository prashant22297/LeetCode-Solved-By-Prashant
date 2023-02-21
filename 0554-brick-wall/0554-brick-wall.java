class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int sum=0,ans=0;
        for(int i=0;i<wall.size();i++){
            sum=0;
            for(int j=0;j<wall.get(i).size()-1;j++){
                sum=sum+wall.get(i).get(j);
                freq.put(sum,freq.getOrDefault(sum,0)+1);
                ans=Math.max(ans,freq.get(sum));
            }
        }
        return wall.size()-ans;
    }
}