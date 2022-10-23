class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=-1;
        for(int i=0;i<matrix.size();i++){
            // cout<<matrix[i][0];
            if(matrix[i][0]<=target && matrix[i][matrix[i].size()-1]>=target)
                row=i;
        }
        if(row!=-1){
            for(int i=0;i<matrix[row].size();i++){
                if(matrix[row][i]==target)
                    return true;
            }
        }
        return false;
    }
};