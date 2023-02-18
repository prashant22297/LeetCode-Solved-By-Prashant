class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        LinkedList<Integer> ans = new LinkedList<>();
        int carry=0;
        for(int i=nums.length-1;i>=0;i--){
            int sum = carry+k%10+nums[i];
            // sum=;
            ans.addFirst(sum%10);
            carry=sum/10;
            k=k/10;
        }
        
        while(k!=0){
            ans.addFirst((carry+k%10)%10);
            
            carry=(carry+k%10)/10;
            k/=10;
        }
        if(carry!=0){
            ans.addFirst(carry);
        }
        return ans;
    }
}