//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

#define ll long long
class Solution {
  public:
  ll gcd(ll a, ll b){
      if(b==0) return a;
      return gcd(b,a%b);
      
  }
    vector<long long> lcmAndGcd(long long A , long long B) {
        ll g=gcd(A,B);
        vector<ll> ans;
        ans.push_back((A*B)/g);
        ans.push_back(g);
        // cout<<(A*B)/g<<" "<<g;
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long A,B;
        
        cin>>A>>B;

        Solution ob;
        vector<long long> ans = ob.lcmAndGcd(A,B);
        cout<<ans[0]<<" "<<ans[1]<<endl;
    }
    return 0;
}
// } Driver Code Ends