class Solution {
    public int passThePillow(int n, int time) {
        int onepasstime=n-1;
        int totalpass = time/onepasstime;
        time=time%(n-1);
        return totalpass%2==0?time+1:n-time;
    }
}