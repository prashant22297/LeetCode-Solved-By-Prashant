class Solution {
public:
    bool arr[5000000+1];
    void sieve(int n){
        memset(arr, true, sizeof(arr));
        for(int i=2;i<=sqrt(n);i++){
            int j=i*i;
            while(j<=n){
                if(arr[j]){
                    arr[j]=false;
                }
                j=j+i;
            }
        }
    }
    int countPrimes(int n) {
        sieve(n);
        int count=0;
        for(int i=2;i<n;i++){
            if(arr[i]) {
                count++;
            }
                
        }
        return count;
    }
};