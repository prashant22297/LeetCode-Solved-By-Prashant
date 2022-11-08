//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

  

// } Driver Code Ends
// Function to find square root
// x: element to find square root
#define ll long long int
class Solution{
  public:
    long long int floorSqrt(long long int x) 
    {
        ll l=0,h=x,m;
        while(l<=h){
            m=l+(h-l)/2;
            if(m*m==x) return m;
            else if(m*m>x) h=m-1;
            else l=m+1;
        }
        return h;
    }
};

//{ Driver Code Starts.

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		long long n;
		cin>>n;
		Solution obj;
		cout << obj.floorSqrt(n) << endl;
	}
    return 0;   
}

// } Driver Code Ends