class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int j=1;j<=9;j++){
            solve(j,n,ans);
        }
        return ans;
    }
    
    public void solve(int i , int n , List<Integer> ans){
        if(i>n) return;
        ans.add(i);
        for(int j=0;j<=9;j++){
            solve(i*10+j,n,ans);
        }
    }
}