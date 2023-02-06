class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] fre = new int[26];
            for(int j=i;j<s.length();j++){
                fre[s.charAt(j)-'a']++;
                ans+=Max(fre)-Min(fre);
            }
        }
        return ans;
    }
    public int Max(int[] fre){
        int max=0;
        for(int i: fre){
            if(i!=0)
            max=Math.max(max,i);
        }
        return max;
    }
    public int Min(int[] fre){
        int min=Integer.MAX_VALUE;
        for(int i: fre){
            if(i!=0)
            min=Math.min(min,i);
        }
        return min;
    }
}