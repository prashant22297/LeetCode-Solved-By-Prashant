class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1 = nums1.length;
        int len2 =nums2.length;
        int i=0, j=0;
        while(i<len1 && j<len2 && nums1[i]!=nums2[j]){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else j++;
        }
        if(i<len1 && j<len2 &&nums1[i]==nums2[j]) return nums1[i];
        else return -1;
    }
}