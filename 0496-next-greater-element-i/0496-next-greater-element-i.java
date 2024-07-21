class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int el = nums1[i];
            int idx =-1;
            for(int j=0;j<m;j++){
                if(el == nums2[j]){
                    idx =j;
                    break;
                }
            }
            if(idx!=-1){
                boolean flag = true;
                for(int j =idx+1;j<m;j++){
                    if(el<nums2[j]){
                        ans[i]=nums2[j];
                        flag=false;
                        break;
                    }
                }
                if(flag)
                ans[i]=-1;
            }
        }
        return ans;
    }
}