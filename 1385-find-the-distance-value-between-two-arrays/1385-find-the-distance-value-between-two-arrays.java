class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        boolean flag=false;
        for(int i=0;i<arr1.length;i++){
            flag=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    flag=false;
                }
            }
            if(flag==true) ans++;
        }
        return ans;
    }
}