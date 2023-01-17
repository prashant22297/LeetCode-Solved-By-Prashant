class Solution {
public:
    int minFlipsMonoIncr(string s) {
        int flip=0,one=0,n = s.size();
        for(int i=0;i<n;i++){
            if(s[i]=='1'){
                one++;
            }else{
                if(one==0)continue;
                else flip++;
            }
            if(one<flip)flip = one;
        }
        return flip;
    }
};