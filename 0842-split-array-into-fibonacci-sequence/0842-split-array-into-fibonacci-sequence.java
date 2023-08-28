class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> ans = new ArrayList<>();
        // if(num.charAt(0)=='0') return ans;
        solve(num,ans,0);
        return ans;
    }
    private boolean solve(String num, List<Integer> ans, int idx){
        if(idx==num.length()){
             return ans.size() > 2? true:false;
        }
        int curr=0;
        for(int i = idx ; i<num.length();i++){
           
            
            curr = curr*10 + (num.charAt(i)-'0');
            if(curr<0) return false;
            if(ans.size()<=1 || curr==ans.get(ans.size()-1)+ans.get(ans.size()-2)){
                ans.add(curr);
                if(solve(num,ans,i+1))
                    return true;
                ans.remove(ans.size()-1);
            }
             if(i==idx && num.charAt(i)=='0') return false;
        }
        return false;
    }
}