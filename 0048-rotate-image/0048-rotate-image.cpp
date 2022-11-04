class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n=matrix.size(),m=matrix[0].size();
        vector<vector<int>> temp (m,vector<int>(n));
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                temp[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<m;i++){
            reverse(temp[i].begin(),temp[i].end());
        }
        matrix=temp;
    }
};