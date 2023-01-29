class Solution {
    public int countHousePlacements(int n) {
        long a=1,b=1,c=a+b;
        while(n-->0){
            c=(a+b)%1000000007;
            a=b;
            b=c;
        }
        return (int)(c%1000000007*c%1000000007);
    }
}