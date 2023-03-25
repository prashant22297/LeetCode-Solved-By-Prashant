class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int inc[] = new int[s.length()+1];
        for(int[] shift:shifts){
            if(shift[2]==1){
                inc[shift[0]]+=1;
                inc[shift[1]+1]-=1;
            }
            else {
                inc[shift[0]]-=1;
                inc[shift[1]+1]+=1;
            }
        }
        int presum=0;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<inc.length-1;i++){
            presum+=inc[i];
            int ch = ((s.charAt(i)-'a')+presum)%26;
            if(ch<0) ch+=26;
            str.append((char)('a'+ch));
        }
        return str.toString();
    }
}