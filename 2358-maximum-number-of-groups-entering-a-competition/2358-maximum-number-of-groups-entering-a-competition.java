class Solution {
    public int maximumGroups(int[] grades) {
        
        return (int)((-1 + Math.sqrt(1 - (4 * (-grades.length * 2)))) / 2);
        
        
        
        // int ans=0;
        // int i=0,inc=2;
        // while(i<grades.length){
        //     i+=inc;
        //     inc++;
        //     ans++;
        // }
        // return ans;
    }
}