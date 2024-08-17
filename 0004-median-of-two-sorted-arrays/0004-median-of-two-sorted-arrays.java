class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Binary Search
        int m = nums1.length;
        int n = nums2.length;
        int totalLength=m+n;
        int mid2Length = (totalLength+1)/2;
        if(n<m)
            return findMedianSortedArrays(nums2,nums1);
        int low =0, high = m;
        while(low<=high){
            int mid1 = (low+high)/2;
            int mid2 = mid2Length-mid1;
            int L1=Integer.MIN_VALUE;
            int L2=Integer.MIN_VALUE;
            int R1=Integer.MAX_VALUE;
            int R2=Integer.MAX_VALUE;
            if(mid1-1>=0 && mid1<=m){
                L1=nums1[mid1-1];
            }
            if(mid2-1>=0 && mid2<=n){
                L2=nums2[mid2-1];
            }
            if(mid1<m){
                R1=nums1[mid1];
            }
            if(mid2<n){
                R2=nums2[mid2];
            }
            if(L1<=R2 && L2<=R1){
                if(totalLength%2==0){
                    return (Math.max(L1,L2)+Math.min(R1,R2))/2.0;
                }
                else{
                    return Math.max(L1,L2);
                }
            }
            if(L1>R2){
                high = mid1-1;
            }
            else if(L2>R1){
                low=mid1+1;
            }
        }
        return 0.0;
        
        
        // Two Pointer - O(m+n)
//         int i = 0, j = 0;
//         int m = nums1.length, n = nums2.length;
//         int totalLength = m + n;
//         int requiredIndex = (totalLength / 2) - 1, requiredIndex2 = (totalLength / 2);
//         System.out.println(requiredIndex + " " + requiredIndex2);
//         int requiredValue = -1, requiredValue2 = -1;
//         int index = 0;
//         while (i < m && j < n) {
//             if (nums1[i] < nums2[j]) {
//                 if (requiredIndex == index) {
//                     requiredValue = nums1[i];
//                 }
//                 if (requiredIndex2 == index) {
//                     requiredValue2 = nums1[i];
//                 }
//                 i++;
//             } else {
//                 if (requiredIndex == index) {
//                     requiredValue = nums2[j];
//                 }
//                 if (requiredIndex2 == index) {
//                     requiredValue2 = nums2[j];
//                 }
//                 j++;
//             }
//             index++;
//         }
//         while (i < m) {
//             if (requiredIndex == index) {
//                 requiredValue = nums1[i];
//             }
//             if (requiredIndex2 == index) {
//                 requiredValue2 = nums1[i];
//             }
//             i++;
//             index++;
//         }
//         while (j < n) {
//             if (requiredIndex == index) {
//                 requiredValue = nums2[j];
//             }
//             if (requiredIndex2 == index) {
//                 requiredValue2 = nums2[j];
//             }
//             j++;
//             index++;

//         }
//         if (totalLength % 2 == 0)
//             return (requiredValue + requiredValue2) / 2.0;
//         else
//             return requiredValue2;
    }
}