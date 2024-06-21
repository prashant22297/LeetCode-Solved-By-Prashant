class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int[] preSum = new int[n];
        int[] postSum = new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                preSum[i]+=temp+customers[i];
            }
            else{
                preSum[i]+=temp;
            }
            temp=preSum[i];
        }
        temp=0;
        for(int i=n-1;i>=0;i--){
            if(grumpy[i]==0){
                postSum[i]+=temp+customers[i];
            }
            else{
                postSum[i]+=temp;
            }
            temp=postSum[i];
        }
        // System.out.println(Arrays.toString(preSum));
        // System.out.println(Arrays.toString(postSum));
        int l =0;
        int currSatisfied=0;
        int maxSatisfied =0;
        for(int r = 0;r<n;r++){
            currSatisfied+=customers[r];
            if(r-l+1>minutes){
                currSatisfied-=customers[l];
                l++;
            }
            int t = currSatisfied;
            if(l>0){
                t+=preSum[l-1];
            }
            if(r<n-1){
                t+=postSum[r+1];
            }
            maxSatisfied=Math.max(t,maxSatisfied);
        }
        return maxSatisfied;
    }
}