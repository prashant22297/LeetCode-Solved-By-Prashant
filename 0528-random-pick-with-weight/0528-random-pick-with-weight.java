class Solution {
    int size = -1;
    int[] preSum;
    Random random;
    public Solution(int[] w) {
        size=w.length;
        int sum = 0;
        for(int i =0;i<size;i++){
            sum+=w[i];
            w[i]=sum;
        }
        preSum=w;
        random = new Random();
    }
    
    public int pickIndex() {
        int number = random.nextInt(preSum[size-1])+1;
        int l = 0 , r = size-1;
        while(l<r){
            int m = l+(r-l)/2;
            if(preSum[m] == number ) return m;
            else if(preSum[m]<number) l=m+1;
            else r=m;
        }
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */