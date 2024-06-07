class Solution {
    public int minimumChairs(String s) {
        int count=0;
        int ans=0;
        for(char ch : s.toCharArray()){
            if(ch=='E'){
                count++;
            }
            else count--;
            ans=Math.max(ans,count);
        }
        return ans;
    }
}