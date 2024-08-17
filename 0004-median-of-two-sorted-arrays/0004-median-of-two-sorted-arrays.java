class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Two Pointer
        int i = 0, j = 0;
        int m = nums1.length, n = nums2.length;
        int totalLength = m + n;
        // if(totalLength%2==0){
        int requiredIndex = (totalLength / 2) - 1, requiredIndex2 = (totalLength / 2);
        System.out.println(requiredIndex + " " + requiredIndex2);
        int requiredValue = -1, requiredValue2 = -1;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                if (requiredIndex == index) {
                    requiredValue = nums1[i];
                }
                if (requiredIndex2 == index) {
                    requiredValue2 = nums1[i];
                }
                i++;
            } else {
                if (requiredIndex == index) {
                    requiredValue = nums2[j];
                }
                if (requiredIndex2 == index) {
                    requiredValue2 = nums2[j];
                }
                j++;
            }
            index++;
        }
        while (i < m) {
            if (requiredIndex == index) {
                requiredValue = nums1[i];
            }
            if (requiredIndex2 == index) {
                requiredValue2 = nums1[i];
            }
            i++;
            index++;
        }
        while (j < n) {
            if (requiredIndex == index) {
                requiredValue = nums2[j];
            }
            if (requiredIndex2 == index) {
                requiredValue2 = nums2[j];
            }
            j++;
            index++;

        }
        if (totalLength % 2 == 0)
            return (requiredValue + requiredValue2) / 2.0;
        else
            return requiredValue2;

    }
}