class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int arr[][]=new int[m][n];

        //Marking Walls as Obstacle
        for(int i[]:walls){
            arr[i[0]][i[1]]=2;
        }

        //Marking Guards as Obstacle too
        //we priorly set to guards so that repeated iteration is avoided
        for(int i[]:guards){
            arr[i[0]][i[1]]=2;
        }

        //Now when the All Obstacles are set Check the Guards Vision
        for(int i[]:guards){
            findVal(i[0],i[1],arr);
        }

    //Check how many cells are unvisited !! Because other cells are marked either 1 (vision) || 2(obstacle)
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0) count++;
            }
        }
        return count;
    }
    public static void findVal(int i,int j,int[][] arr){
        //For RightSide
        int ref_j=j+1;
        while(isValid(i,ref_j,arr)){
            arr[i][ref_j]=1;
            ref_j++;
        }

        //For LeftSide
        ref_j=j-1;
        while(isValid(i,ref_j,arr)){
            arr[i][ref_j]=1;
            ref_j--;
        }

        //For DownSide
        int ref_i=i+1;
        while(isValid(ref_i,j,arr)){
            arr[ref_i][j]=1;
            ref_i++;
        }

        //For UpSide
        ref_i=i-1;
        while(isValid(ref_i,j,arr)){
            arr[ref_i][j]=1;
            ref_i--;
        }
    }

    //Checking whether we can move further or not.

    //It Includes the Boundary Condition and also tells us to not pass the Guards and walls
    public static boolean isValid(int i,int j,int[][] arr){
        return (i>=0&&i<arr.length&&j>=0&&j<arr[0].length&&arr[i][j]!=2);
    }
}