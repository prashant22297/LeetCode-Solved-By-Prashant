class Solution {
    public boolean canPlaceFlowers(int[] bed, int n) {
        for(int i=0;i<bed.length;i++){
            if(bed[i]==0 && (i==0 || bed[i-1]==0) && (i==bed.length-1 || bed[i+1]==0) ){
                bed[i]=1;
                n--;
            }
        }
        if(n<=0) return true;
        else return false;
    }
}