//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  public:
  
    bool isPossible(vector<int>& stations, int K, double mid){
        int count=0;
        for(int i=1;i<stations.size();i++){
            count=count+(((stations[i]-stations[i-1])*1.0)/mid);
            if(count>K) return false;
        }
        return true;
    }
    double findSmallestMaxDist(vector<int> &stations, int K){
        int n=stations.size();
        double start=0,end=stations[n-1]-stations[0],ans,mid;
        while(end-start>1e-6){
            mid=start+(end-start)/2;
            if(isPossible(stations,K,mid)){
                ans=mid;
                end=mid;
            }
            else start = mid;
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main()
{
  int t;
  cin >> t;
  while (t--)
  {
    int n;
    cin >> n;
    vector<int> stations(n);
    for (int i = 0; i < n; i++)
    {
      cin >> stations[i];
    }
    int k;
    cin >> k;
    Solution obj;
    cout << fixed << setprecision(2) << obj.findSmallestMaxDist(stations, k) << endl;
  }
  return 0;
}
// } Driver Code Ends