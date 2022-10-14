//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++
class Solution{
public:	
	// Function returns the second
	// largest elements
	int print2largest(int arr[], int n) {
	    int max1=INT_MIN,min1=INT_MAX,max2=INT_MIN,min2=INT_MAX;
	    for(int i=0;i<n;i++){
	        max1=max(arr[i],max1);
	        min1=min(arr[i],min1);
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]>max2 && arr[i]!=max1)
	        max2=arr[i];
	        if(arr[i]<min2 && arr[i]!=min1)
	        min2=arr[i];
	    }
	    if(max2<0)
	    max2=-1;
	    return max2;
	}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int arr[n];
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.print2largest(arr, n);
        cout << ans << "\n";
    }
    return 0;
}

// } Driver Code Ends