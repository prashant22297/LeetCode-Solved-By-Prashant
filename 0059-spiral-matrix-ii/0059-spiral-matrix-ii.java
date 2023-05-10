class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int t=0,b=n-1,l=0,r=n-1,dir=0,count=1;
        while(t<=b && l<=r){
            switch(dir){
                case 0:
                    for(int i=l;i<=r;i++){
                        mat[t][i]=count++;
                    }
                    dir++;
                    t++;
                    break;
                case 1:
                    for(int i=t;i<=b;i++){
                        mat[i][r]=count++;
                    }
                    dir++;
                    r--;
                    break;
                case 2:
                    for(int i=r;i>=l;i--){
                        mat[b][i]=count++;
                    }
                    dir++;
                    b--;
                    break;
                case 3:
                    for(int i=b;i>=t;i--){
                        mat[i][l]=count++;
                    }
                    dir++;
                    l++;
                    break;
            }
            dir=dir%4;
        }
        return mat;
    }
}