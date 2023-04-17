class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sumAll =0;
        int n = nums.length;
        for(int i: nums) sumAll+=i;
        if(k>n || sumAll%k!=0) return false;
        int sum = sumAll/k;
        boolean[] visited = new boolean[n];
        return solve(nums,n,0,sum,k,0,visited);
    }
    static boolean solve(int nums[],int n, int curr_sum, int target, int k, int curr_i, boolean[] visited){
        if(k==1) return true;
        if(curr_sum == target) return solve(nums,n,0,target,k-1,0,visited);
        
        if(curr_sum>target || curr_i>=n) return false;
        
        for(int i=curr_i;i<n;i++){
            if(visited[i]==false){
                visited[i]=true;
                if(solve(nums,n,curr_sum+nums[i],target,k,i+1,visited))
                    return true;
                visited[i]=false;
            }
        }
        return false;
    }
}