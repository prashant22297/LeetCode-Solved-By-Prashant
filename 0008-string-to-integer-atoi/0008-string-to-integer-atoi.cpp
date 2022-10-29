class Solution {
public:
    int myAtoi(string str) {
        // My Solution
//         long long n = s.length();
//         long long i=0;
//         int positive=1;
//         while(i<n && s[i]==' ')i++;
//         if(i<n && s[i]=='-') {
//             cout<<s[i];
//             positive = -1; 
//             i++;
//         }
//         else if(i<n && s[i]=='+')
//             i++;
//         long long ans=0;
//         while(i<n){
//             if(s[i]>='0' && s[i]<='9'){
//             ans=ans*10+(int(s[i])-48);
//                 if(ans> 2147483647) {
//                 ans=2147483648;
//                 break;
//             }
//             }
//             else {
//                 return ans*positive;
//             }
            
//             i++;
//         }
//         if(positive==-1) ans*=(-1);
//         if(ans<-2147483648) ans=-2147483648;
//         else if(ans>2147483647) ans=2147483647;
//         return (int)ans;
        
        
//         Best Solution from Discuss
         int sign = 1, base = 0, i = 0;
        while (str[i] == ' ') { i++; }
        if (str[i] == '-' || str[i] == '+') {
            sign = 1 - 2 * (str[i++] == '-'); 
        }
        while (str[i] >= '0' && str[i] <= '9') {
            if (base >  INT_MAX / 10 || (base == INT_MAX / 10 && str[i] - '0' > 7)) {
                if (sign == 1) return INT_MAX;
                else return INT_MIN;
            }
            base  = 10 * base + (str[i++] - '0');
        }
        return base * sign;
    }
};