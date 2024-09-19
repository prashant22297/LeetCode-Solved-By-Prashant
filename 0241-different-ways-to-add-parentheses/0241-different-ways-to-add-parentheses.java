class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='-' || expression.charAt(i)=='+' || expression.charAt(i)=='*'){
                List<Integer> p1 = diffWaysToCompute(expression.substring(0,i));
                List<Integer> p2 = diffWaysToCompute(expression.substring(i+1));
                for(int j : p1){
                    for(int k : p2){
                        int temp=0;
                        if(expression.charAt(i)=='-'){
                            temp = j-k;
                        }
                        else if(expression.charAt(i)=='+'){
                            temp=j+k;
                        }
                        else{
                            temp=j*k;
                        }
                        ans.add(temp);
                    }
                }
            }
        }
        if(ans.size()==0) {
            ans.add(Integer.valueOf(expression));
        }
        return ans;
    }
}