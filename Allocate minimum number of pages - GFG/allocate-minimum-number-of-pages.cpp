//{ Driver Code Starts
// Initial template for C++

#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template in C++

class Solution 
{
    public:
    bool isPossible(int A[], int N , int M, int mid){
        int count=1,curr_sum=0;
        for(int i=0;i<N;i++){
            if (A[i] > mid) return false;
            if(curr_sum+A[i]>mid){
                count++;
                curr_sum=A[i];
                if(count>M) return false;
            }
            else curr_sum+=A[i];
        }
        return true;
    }
    //Function to find minimum number of pages.
    int findPages(int A[], int N, int M) 
    {
        if (N < M)
        return -1;
        long long int sum=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
        }
        int low=0,high=sum,mid,ans=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(isPossible(A,N,M,mid)){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        int A[n];
        for(int i=0;i<n;i++){
            cin>>A[i];
        }
        int m;
        cin>>m;
        Solution ob;
        cout << ob.findPages(A, n, m) << endl;
    }
    return 0;
}

// } Driver Code Ends