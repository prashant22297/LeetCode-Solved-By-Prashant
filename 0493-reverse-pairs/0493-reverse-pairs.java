class Solution {
    public int reversePairs(int[] nums) {
        return sort(nums,0,nums.length-1);
        // System.out.println(Arrays.toString(nums));
    }
    public static int sort(int[] nums, int l, int r){
        if(l>=r) return 0;
        int count=0;
            int m=(l+r)/2;
            count+=sort(nums,l,m);
            count+=sort(nums,m+1,r);
            count+=merge(nums,l,m,r);
        return count;
    }
    
    public static int merge(int[] arr, int l , int m , int r){
        int count=0;
        int len1 = m-l+1;
        int len2 = r-m;
        int left[] = new int[len1];
        int right[] = new int[len2];
        
        for(int i=0;i<len1;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<len2;i++){
            right[i]=arr[m+i+1];
        }
        int i=0,j=0,k=l;
        while( i < left.length && j < right.length ) {
            if(left[i] > 2L * right[j]) {
                count += left.length - i;
                j++;
            } else i++;
        }
        i=0;
        j=0;
        
        while( i < left.length && j < right.length ) {
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        
        while( i < left.length ) arr[k++] = left[i++];
        while( j < right.length ) arr[k++] = right[j++];
        
        return count;
    }
}