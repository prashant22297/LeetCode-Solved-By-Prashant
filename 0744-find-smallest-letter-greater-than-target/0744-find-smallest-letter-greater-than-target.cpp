class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int n=letters.size(),s=0,e=n-1,m;
        while(s<=e){
            m=s+(e-s)/2;
            if(letters[m]==target){
                s=m+1;
            // return letters[(m+1)%n];
            }
            else if(letters[m]<target){
                s=m+1;
            }
            else e=m-1;
        }
        return letters[s%n];
    }
};