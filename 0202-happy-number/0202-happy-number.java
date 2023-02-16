class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        else if(n>1 && n<7) return false;
        int sum=0;
        while(n!=0){
            int rem = n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        return isHappy(sum);
        
        
        // Set<Integer> sum = new HashSet<>();
        // while(n!=1 && !sum.contains(n)){
        //     sum.add(n);
        //     n=summ(n);
        // }
        // if(n==1) return true;
        // else return false;
    }
    // public int summ(int n){
    //     int sum =0;
    //     while(n!=0){
    //         int rem = n%10;
    //         n=n/10;
    //         sum+=rem*rem;
    //     }
    //     return sum;
    // }
}