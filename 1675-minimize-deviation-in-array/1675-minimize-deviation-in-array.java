class Solution {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> even = new PriorityQueue<>(nums.length,Collections.reverseOrder());
        int min =Integer.MAX_VALUE;
        
        for(int i:nums){
            if(i%2==0){
                even.offer(i);
                min=Math.min(i,min);
            }
            else{
                even.offer(i*2);
                min =Math.min(i*2,min);
            }
        }
        int ans = Integer.MAX_VALUE;
        while(even.peek()%2==0){
            int max = even.poll();
            ans=Math.min(ans,max-min);
            int n=max/2;
            even.offer(n);
            min=Math.min(min,n);
        }
        ans=Math.min(ans,even.peek()-min);
        return ans;
    }
}