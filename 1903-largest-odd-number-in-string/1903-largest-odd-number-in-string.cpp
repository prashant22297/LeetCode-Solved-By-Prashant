class Solution {
public:
    string largestOddNumber(string num) {
        int last=0,n=num.length();
        bool odd=false;
        for(int i=n-1;i>=0;i--){
            last++;
            if((num[i]-'0')%2!=0) {
                odd= true;
                break;
            }
        }
        if(!odd){
            return "";
        }
        return num.substr(0,num.length()-last+1);
    }
};