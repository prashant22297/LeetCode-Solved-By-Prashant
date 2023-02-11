class Solution {
    public int primePalindrome(int n) {
        while(true){
            if(isPrime(n) && isPal(n))
                return n;
            n++;
            if(n>10000000 && n<100000000) n=100000000;
        }
    }
    boolean isPrime(int n){
        if(n == 1) {
            return false;
        }
        for (int i=2;i<=Math.sqrt(n); i++) {
            if (n%i==0) return false;
        }
        return true;
    }
    boolean isPal(int n) {
        int rev = 0;
        int temp = n;
        while(n != 0) {
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
        }
        return rev == temp;
    }
}