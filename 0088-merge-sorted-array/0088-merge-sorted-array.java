class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 =0;
        int idx2=0;
        int index = m;
        for(int i=0;i<n;i++,m++){
            nums1[m]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}