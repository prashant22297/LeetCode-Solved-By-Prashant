class Solution {
    public int minCostClimbingStairs(int[] c) {
        // int cost=Math.min(c[0],c[1]);
        int one=c[0];
        int two =c[1];
        int cost=0;
        for(int i=2;i<c.length;i++){
            int temp=c[i]+Math.min(one,two);
            one=two;
            two=temp;
        }
        return Math.min(one,two);
        // return Math.min(solve(cost.length,cost))
    }
    // solve()
}