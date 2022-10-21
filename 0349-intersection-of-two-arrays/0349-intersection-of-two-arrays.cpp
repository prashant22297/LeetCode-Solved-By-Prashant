class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> temp;
        
        sort(nums1.begin(),nums1.end());
        sort(nums2.begin(),nums2.end());
        int n = nums1.size();
        int m = nums2.size();
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums2[j]<nums1[i]){
                j++;
            }
            else {
                temp.insert(nums1[i]);
                i++;
                j++;
            }
        }
        vector<int> ans;
        for(auto t : temp)
            ans.push_back(t);
        return ans;
    }
};