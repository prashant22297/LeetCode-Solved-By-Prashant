class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum=0;
        int count=0;
        int temp=Integer.MAX_VALUE;
        for(int num : nums){
            sum+=Math.max(num,num^k);
            if((num^k)>num){
            temp = Math.min(temp,(num^k)-num);
            count++;
            }
            else{
                temp=Math.min(temp,num-(num^k));
            }
        }
        if(count%2!=0){
            sum=sum-temp;
        }
        return sum;
    }
}