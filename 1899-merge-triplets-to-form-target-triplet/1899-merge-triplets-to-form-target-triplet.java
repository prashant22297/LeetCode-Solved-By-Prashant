class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int a,b,c;
        int[] ans = new int[3];
        for(int[] i : triplets){
            if((i[0]<=target[0]) && i[1]<=target[1] && i[2]<=target[2]){
                ans=new int[]{Math.max(i[0],ans[0]),Math.max(i[1],ans[1]),Math.max(i[2],ans[2])};
            }
        }
        int j=0;
        for(int i : target){
            if(i!=ans[j]){
                return false;
            }
            j++;
        }
        return true;
    }
}