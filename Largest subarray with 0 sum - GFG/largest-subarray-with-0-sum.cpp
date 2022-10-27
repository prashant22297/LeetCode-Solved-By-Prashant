//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
/*You are required to complete this function*/

class Solution{
    public:
    int maxLen(vector<int>&A, int n)
    {   unordered_map<int,int> mp;
        int s=0,len=0,mlen=0;
        for(int i=0;i<n;i++){
            s+=A[i];
            if(s==0){
                mlen=max(i-len+1,mlen);
                len=0;
            }    
            else if(mp.find(s)!=mp.end()){
                mlen=max(i-mp.find(s)->second,mlen);
            }
            else mp[s]=i;
        }
        return mlen;
    }
};


//{ Driver Code Starts.

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int m;
        cin>>m;
        vector<int> array1(m);
        for (int i = 0; i < m; ++i){
            cin>>array1[i];
        }
        Solution ob;
        cout<<ob.maxLen(array1,m)<<endl;
    }
    return 0; 
}



// } Driver Code Ends