//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution{
    public:
    //arr1,arr2 : the arrays
    // n, m: size of arrays
    //Function to return a list containing the union of the two arrays. 
    vector<int> findUnion(int arr1[], int arr2[], int n, int m)
    {
        //used set here and later we converted the set to vector , just to avoid duplicates . 
        // set<int> ans;
        // int i=0,j=0;
        // while(i<n && j<m){
        //     if(arr1[i]>arr2[j]){
        //         ans.insert(arr2[j]);
        //         j++;
        //     }
        //     else if(arr1[i]<arr2[j]){
        //         ans.insert(arr1[i]);
        //         i++;
        //     }
        //     else {
        //         ans.insert(arr1[i]);
        //         i++;
        //         j++;
        //     }
        // }
        // while(i<n){
        //     ans.insert(arr1[i]);
        //     i++;
        // }
        // while(j<m){
        //     ans.insert(arr2[j]);
        //     j++;
        // }
        // vector<int> temp;
        // for(auto t:ans)
        // temp.push_back(t);
        // return temp;
        
        set<int> temp;
        for(int i=0;i<n;i++)
            temp.insert(arr1[i]);
        for(int i=0;i<m;i++)
            temp.insert(arr2[i]);
        vector<int> ans;
        for(auto t:temp)
        ans.push_back(t);
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
	
	int T;
	cin >> T;
	
	while(T--){
	    
	    
	    
	    int N, M;
	    cin >>N >> M;
	    
	    int arr1[N];
	    int arr2[M];
	    
	    for(int i = 0;i<N;i++){
	        cin >> arr1[i];
	    }
	    
	    for(int i = 0;i<M;i++){
	        cin >> arr2[i];
	    }
	    Solution ob;
	    vector<int> ans = ob.findUnion(arr1,arr2, N, M);
	    for(int i: ans)cout<<i<<' ';
	    cout << endl;
	    
	}
	
	return 0;
}
// } Driver Code Ends