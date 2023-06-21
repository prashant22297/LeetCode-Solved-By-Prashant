class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> mp = new HashMap<>();
        int ans=0;
        for(int i: answers){
            if(mp.getOrDefault(i,i)==i){
                ans+=i+1;
                mp.put(i,0);
            }
            else mp.put(i,mp.get(i)+1);
        }
        return ans;
    }
}