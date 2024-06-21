class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int minDay = 0;
        int maxDay=0;
        int ans=-1;
        int n = bloomDay.length;
        for(int day: bloomDay){
            minDay=Math.min(minDay,day);
            maxDay=Math.max(maxDay,day);
        }
        while(minDay<=maxDay){
            int mid =(minDay+maxDay)/2;
            if(solve(bloomDay,m,k,mid,n)){
                ans=mid;
                maxDay=mid-1;
            }
            else minDay=mid+1;
        }
        return ans;
    }
    private boolean solve(int[] bloomDay, int m, int k,int mid,int n){
        int count=0;
        int flowers=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                flowers++;
                if(flowers==k){
                    count++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        return count>=m;
    }
}