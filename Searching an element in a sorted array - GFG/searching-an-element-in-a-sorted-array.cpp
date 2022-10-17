//{ Driver Code Starts
#include <bits/stdc++.h> 
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    int searchInSorted(int arr[], int N, int K) 
    { 
        int h=N-1,l=0;
        while(l<=h){
            int mid=l + (h - l) / 2;
            if(arr[mid]==K) return 1;
            else if(arr[mid]<K) l=mid+1;
            else h=mid-1;
        }
        return -1;
    }
};

//{ Driver Code Starts.


int main(void) 
{ 
    
    int t;
    cin >> t;
    while(t--){
        int n, k;
        cin >> n >> k;
        
        int arr[n];
        
        for(int i = 0;i<n;i++){
            cin >> arr[i];
        }
        
        Solution ob;
        cout << ob.searchInSorted(arr, n, k) << endl;

    }

	return 0; 
} 

// } Driver Code Ends