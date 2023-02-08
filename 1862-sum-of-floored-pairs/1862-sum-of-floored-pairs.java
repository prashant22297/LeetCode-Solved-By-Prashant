class Solution {
    int N=100000,mod=1000000000+7;
    public int sumOfFlooredPairs(int[] nums) {
        int[] freq = new int[2*N+1];
        int mx=0;
        int n = nums.length;
        for(int i : nums){
            freq[i]++;
            mx=Math.max(mx,i);
        }
        for(int i=1;i<=2*mx;i++){
            freq[i]+=freq[i-1];
        }
        // System.out.print(Arrays.toString(freq));
        int ans=0;
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i=0;i<n;i++){
            if(visited.containsKey(nums[i])){
                ans+=visited.get(nums[i]);
            }
            else{
                int sum=0;
                int one = nums[i],two = 2*nums[i]-1, division=1;
                while(one<=mx){
                    sum=(sum+division*(freq[two]-freq[one-1])%mod)%mod;
                    one+=nums[i];
                    two+=nums[i];
                    division++;
                }
                visited.put(nums[i],sum);
                ans+=sum;
            }
            ans%=mod;
        }
        return ans;
    }
}