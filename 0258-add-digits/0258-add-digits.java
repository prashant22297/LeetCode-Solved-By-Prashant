class Solution {
    public int addDigits(int num) {
        // O(N)
        // while(true){
        //     int sum = 0;
        //     while(num!=0){
        //         sum+=num%10;
        //         num/=10;
        //     }
        //     if(sum>=0 && sum<=9)
        //         return sum;
        //     else num=sum;
        // }
        
        if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9;
    }
}