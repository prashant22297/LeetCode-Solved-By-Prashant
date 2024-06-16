class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] count = new int[101];
        for(int j=0;j<logs.length;j++){
            int start = logs[j][0];
            int end = logs[j][1];
            count[start-1950]++;
            count[end-1950]--;
        }
        int maxCount=count[0];
        int maxYear =1950;
        for(int i=1;i<101;i++){
            count[i]=count[i]+count[i-1];
            if(maxCount<count[i]){
                maxCount = count[i];
                maxYear = i+1950;
            }
        }
        return maxYear;
    }
}