class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans=0;
        int n = matrix.length;
        int m = matrix[0].length;
        int mat[] = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[j]=matrix[i][j]=='1'?mat[j]+1:0;
            }
            // System.out.println(Arrays.toString(mat));
            ans=Math.max(ans,maxHisto(mat));
        }
        return ans;
    }
    public int maxHisto(int mat[]){
        int m = mat.length;
        int left[]= new int[m];
        int right[]= new int[m];
        left[0]=-1;
        right[m-1]=m;
        for(int i=1;i<m;i++){
            int idx=i-1;
            while(idx>=0 && mat[idx]>=mat[i]){
                idx=left[idx];
            }
            left[i]=idx;
        }
        
        for(int i=m-2;i>=0;i--){
            int idx=i+1;
            while(idx<m && mat[idx]>=mat[i]){
                idx=right[idx];
            }
            right[i]=idx;
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        int max_area=0;
        for(int i=0;i<m;i++){
            max_area=Math.max(max_area,(right[i]-left[i]-1)*mat[i]);
        }
        // System.out.println(Arrays.toString(left));
        // System.out.println(Arrays.toString(right));
        // System.out.println(max_area);
        
        return max_area;
    }
}