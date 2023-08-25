class Solution { 
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()) return false;
        int[][][] memo = new int[201][201][201];
        return solve(s1,s2,s3,0,0,0,memo);
    }
    
    private boolean solve(String a,String b, String c, int i , int j ,int k, int[][][] memo){
        if(i==a.length() && j==b.length() && k==c.length() ){
            return true;
        }
        if(memo[i][j][k]!=0){
            return memo[i][j][k]==-1?false:true;
        }
        boolean aa = false;
        boolean bb = false;
        if(i<a.length() && a.charAt(i)==c.charAt(k)){
            aa=solve(a,b,c,i+1,j,k+1,memo);
        }
        if(j<b.length() && b.charAt(j)==c.charAt(k)){
            bb=solve(a,b,c,i,j+1,k+1,memo);
        }
        if((aa || bb)==true){
            memo[i][j][k]=1;
        }
        else memo[i][j][k]=-1;
        return ((aa || bb));
    }
}