class Solution {
    int dp[][] = new int[101][101];
    public boolean checkValidString(String s) {
        // Method 1: Recursion+Dp
        for(int[] i: dp)
        Arrays.fill(i,-1);
        
        return solve(0,0,s.length(),s);
        // int countStar = 0;
        // int count =0;
        // int len = s.length();
        // for(int i=0;i<len;i++){
            // if(s.charAt(i)=='('){
            //     count++;
            // }
        //     else if(s.charAt(i)=='*'){
        //         countStar++;
        //     }
            // else if(s.charAt(i)==')'){
            //     if(count>0){
            //         count--;
            //     }
            //     else if(countStar>0){
            //         countStar--;
            //     }
            //     else return false;
            // }
        // }
        // if(countStar>=count) return true;
        // return count==0;
    }
    
    public boolean solve(int i, int count,int n,String s){
        if(i==n) return count==0;
        if(dp[i][count]!=-1) return dp[i][count]==1;
        boolean isValid=false;
         if(s.charAt(i)=='('){
                isValid= isValid || solve(i+1,count+1,n,s);
            }
        else if(s.charAt(i)==')'){
            if(count>0){
                isValid= isValid || solve(i+1,count-1,n,s);
            }
        }
        else if(s.charAt(i)=='*'){
            isValid= isValid || solve(i+1,count+1,n,s);
            if(count>0){
                isValid= isValid || solve(i+1,count-1,n,s);
            }
            isValid= isValid || solve(i+1,count,n,s);
        }
        dp[i][count]=isValid==true?1:0;
        return isValid;
    }
}