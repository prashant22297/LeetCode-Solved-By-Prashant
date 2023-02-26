class Solution {
    public int maximumUnits(int[][] boxTypes, int capacity) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int ans=0;
        for(int i=0;i<boxTypes.length;i++){
            if(capacity!=0){
                int req = Math.min(boxTypes[i][0],capacity);
                ans+=boxTypes[i][1]*req;
                capacity-=req;
            }
            else break;
        }
        return ans;
    }
}