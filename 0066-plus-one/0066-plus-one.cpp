class Solution {
public:
    void add_one(vector<int> & nums,int n){
        if(nums.size()==0){
            nums.push_back(1);
            return;
        }
        int t = nums[n-1];
        nums.pop_back();
        add_one(nums,n-1);
        nums.push_back(t);
    }
    vector<int> plusOne(vector<int>& digits) {
        int carry=0;
        int n=digits.size();
        int t= digits[n-1]+1;
        carry=t/10;
        digits[n-1]=t%10;
        if(carry){
            for(int i=n-2;i>=0;i--){
                t=digits[i]+carry;
                carry=t/10;
                digits[i]=t%10;
            }
        }
        if(carry) add_one(digits,n);
        return digits;
    }
};