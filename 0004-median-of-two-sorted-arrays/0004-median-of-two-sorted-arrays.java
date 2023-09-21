class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int size = m+n;
        int idx1 = (size/2)-1,val1=10000000;
        int idx2 = (size/2),val2=10000000;
        int i = 0 , j = 0;
        int index=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                if(index==idx1) val1=nums1[i];
                if(index==idx2) val2=nums1[i];
                i++;
            }
            else {
                if(index==idx1) val1=nums2[j];
                if(index==idx2) val2=nums2[j];
                j++;
            }
            index++;
        }
        while(i<m){
            if(index==idx1) val1=nums1[i];
            if(index==idx2) val2=nums1[i];
            index++;
            i++;
        }
        while(j<n){
            if(index==idx1) val1=nums2[j];
            if(index==idx2) val2=nums2[j];
            index++;
            j++;  
        }
        System.out.println(val1+" "+idx1+" "+val2+" "+idx2);
        if(size%2==1) return val2;
        else return (val2+val1)/2.0;
        
    }
}