//{ Driver Code Starts


#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends


class Solution{
	public:
	vector<int>AllPrimeFactors(int n) {
	    set<int> ans;
	    while(n%2==0){
	        n=n/2;
	        ans.insert(2);
	    }
	    for(int i=3;i<=sqrt(n);i+=2){
	        while(n%i==0){
	            n=n/i;
	            ans.insert(i);
	        }
	    }
	    if(n>1)
	    ans.insert(n);
	    vector<int> temp;
	    for(auto num : ans)
	    temp.push_back(num);
	    return temp;
	}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		long long int N;
		cin >> N;
		Solution ob;
		vector<int>ans = ob.AllPrimeFactors(N);
		for(auto i: ans)
			cout << i <<" ";
		cout <<"\n";
	}  
	return 0;
}
// } Driver Code Ends