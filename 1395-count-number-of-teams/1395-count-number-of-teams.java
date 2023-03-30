class Solution {
    public int numTeams(int[] rating) {
        int ans = 0;
        for (int i=0; i<rating.length; i++) {
            int[] small=new int[2], great=new int[2];
            for (int j = 0; j < i; j++) {
                if (rating[j]<rating[i]) small[0]++;
                else great[0]++;
            }
            for (int k = i + 1; k < rating.length; k++) {
                if (rating[i] < rating[k]) small[1]++;
                else great[1]++;
            }
            ans=ans+small[0]*small[1]+great[0]*great[1];
        }
        return ans;
    }
}