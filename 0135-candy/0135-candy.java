class Solution {
    public int candy(int[] ratings) {
        int length = ratings.length;
        int candyCount = length;
        int[] curr = new int[length];
        for(int i=1;i<length;i++){
            if(ratings[i]>ratings[i-1]){
                curr[i]=curr[i-1]+1;
            }
        }
        for(int i =length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                curr[i]=Math.max(curr[i],curr[i+1]+1);
            }
        }
        for(int i : curr){
            candyCount+=i;
        }
        return candyCount;
    }
}



// 1 0 2
// 2 1 2
    
// 1 2 2
// 1 2 1