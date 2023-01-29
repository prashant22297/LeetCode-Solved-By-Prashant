class Solution {
    public int countHousePlacements(int n) {
        long a=1,b=1,c=a+b;
        // if(n==1) return 
        while(n-->0){
            c=(a%1000000007+b%1000000007)%1000000007;
            a=b;
            b=c;
        }
        return (int)(c%1000000007*c%1000000007)%1000000007;
    }
}