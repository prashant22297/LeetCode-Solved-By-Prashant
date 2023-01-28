class Solution {
    public int maximumGroups(int[] grades) {
        int ans=0;
        int i=0,inc=2;
        while(i<grades.length){
            i+=inc;
            inc++;
            ans++;
        }
        return ans;
    }
}