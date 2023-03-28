class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int t : tasks)
            mp.put(t,mp.getOrDefault(t,0)+1);
        int ans=0;
        for(int i : mp.values()){
            if(i==1)  return -1;
            ans+=i/3;
            if(i%3!=0) ans++;
        }
        return ans;
    }
}