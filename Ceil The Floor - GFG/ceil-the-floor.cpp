//{ Driver Code Starts

#include <bits/stdc++.h>

using namespace std;

pair<int, int> getFloorAndCeil(int arr[], int n, int x);

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, x;
        cin >> n >> x;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        auto ans = getFloorAndCeil(arr, n, x);
        cout << ans.first << " " << ans.second << "\n";
    }
    return 0;
}

// } Driver Code Ends


pair<int, int> getFloorAndCeil(int v[], int n, int x) {
    int l=0,h=n-1,m;
    pair<int,int> ans;
    sort(v,v+n);
        while(l<=h){
            m=l+(h-l)/2;
            if(v[m]==x) {
                ans.first=v[m];
                ans.second=v[m];
                return ans;
            }
            else if(v[m]>x) h=m-1;
            else l=m+1;
        }
        
        if(h>=0 && l<n) {
            ans.first=v[h];
            ans.second=v[l];
        }
        else if(h<0) {
            ans.first=-1;
            ans.second=v[l];
        }
        else if(m<n) {
            ans.first=v[m];
            ans.second=-1;
        }
        else{
            ans.first=-1;
            ans.second=-1;
        } 
        return ans;
        
}