class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int l=0,r=matrix[0].length-1,t=0,b=matrix.length-1,dir=0;
        while(t<=b && l<=r){
            switch(dir){
                case 0:
                    for(int i=l;i<=r;i++) ans.add(matrix[t][i]);
                    t++;
                    break;
                case 1:
                    for(int i=t;i<=b;i++) ans.add(matrix[i][r]);
                    r--;
                    break;
                case 2:
                    for(int i=r;i>=l;i--) ans.add(matrix[b][i]);
                    b--;
                    break;
                case 3:
                    for(int i=b;i>=t;i--) ans.add(matrix[i][l]);
                    l++;
                    break;
            }
            dir=(dir+1)%4;
        }
        return ans;
    }
}