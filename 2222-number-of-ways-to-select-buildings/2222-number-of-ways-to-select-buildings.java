class Solution {
    public long numberOfWays(String s) {
        long total=0, zero=0,zero1=0,one=0,one0=0;
        for(char ch : s.toCharArray()){
            if(ch =='0'){
                zero++;
                one0+=one;
                total+=zero1;
            }
            else{
                one++;
                zero1+=zero;
                total+=one0;
            }
        }
        return total;
    }
}