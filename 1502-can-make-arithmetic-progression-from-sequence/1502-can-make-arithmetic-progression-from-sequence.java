class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //if difference of a-b = x than, all for all i-j it should be x*(1,2,3,,4...)
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        int tempSum=0;
        for(int i = 1 ; i < arr.length;i++){
            if(arr[i]-arr[i-1]!=diff) return false;
        }
        return true;
    }
}