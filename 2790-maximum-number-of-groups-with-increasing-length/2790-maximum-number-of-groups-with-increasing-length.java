class Solution {
    public int maxIncreasingGroups(List<Integer> usageLimits) {
        long sum=0,k=1;
        Collections.sort(usageLimits);
        for(int i=0;i<usageLimits.size();i++){
            sum+=usageLimits.get(i);
            if(sum>=k*(k+1)/2) k++;
        }
        return (int)--k;
    }
}