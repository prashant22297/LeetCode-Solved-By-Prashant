class Solution {
public:
    void sortColors(vector<int>& nums) {
         // O(N^2)
        // int min_index;
        // for(int i=0;i<nums.size();i++){
        //     min_index=i;
        //     for(int j=i+1;j<nums.size();j++){
        //         if(nums[j]<=nums[min_index]){
        //             min_index=j;
        //         }
        //     }
        //     int temp=nums[i];
        //     nums[i]=nums[min_index];
        //     nums[min_index]=temp;
        
//         O(N) 2nd Method
//         int zero=0,one=0,two=zero;
//         for(int i=0;i<nums.size();i++){
//             switch(nums[i]){
//                 case 0:
//                     zero++;
//                     break;
//                 case 1:
//                     one++;
//                     break;
//                 case 2:
//                     two++;
//                     break;
//             }
//         }
//         for(int i =0;i<nums.size();i++){
//             if(zero!=0){
//                 nums[i]=0;
//                 zero--;
//             }
//             else if(one!=0){
//                 nums[i]=1;
//                 one--;
//             }
//             else nums[i]=2;
//         }
        
//         O(N) Best Method
        int l=0,h=nums.size()-1,mid=0;
        while(mid<=h){
            if(nums[mid]==0) swap(nums[l++],nums[mid++]);
            else if(nums[mid]==1) mid++;
            else if(nums[mid]==2) swap(nums[mid],nums[h--]);
        }
    }
};