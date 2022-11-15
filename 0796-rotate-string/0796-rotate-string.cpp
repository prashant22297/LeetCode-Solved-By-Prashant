class Solution {
public:
    bool rotateString(string s, string goal) {
    //     int i=0,j=0,flag=0;
    //     if(!(s.size()==goal.size())) return false;
    //     while(i<s.size() && (j<s.size()|| i>=0)){
    //         if(s[i]==goal[j%goal.size()]){
    //             i++,j++;
    //             flag=1;
    //         }
    //         else{ j++;
    //              if(flag==1) return false;
    //             }
    //     }
    //     if(i==s.size()) return true;
    //     else return false;
    // }
    
        return (s.size()==goal.size() )&& (s+s).find(goal)!=string::npos;
    }
    
};