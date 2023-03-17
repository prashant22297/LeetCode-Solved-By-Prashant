class Solution {
    public String frequencySort(String s) {
        int fre[][] = new int[125][2];
        for(char ch : s.toCharArray()) {
            fre[ch][0]=ch;
            fre[ch][1]++;
        }
        Arrays.sort(fre,(a,b)->b[1]-a[1]);
        StringBuilder str = new StringBuilder();
        for(int i=0;i<125;i++){
            for(int j=1;j<=fre[i][1];j++)
                str.append((char)fre[i][0]);
        }
        return str.toString();
    }
}