class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long ans=0;
        int minus=0;
        int len = happiness.length;
        Arrays.sort(happiness);
        while(k-->0){
            int temp=happiness[len-minus-1]-minus;
            if(temp>=0)
                ans=ans+temp;
            minus++;
        }
        return ans;
    }
}