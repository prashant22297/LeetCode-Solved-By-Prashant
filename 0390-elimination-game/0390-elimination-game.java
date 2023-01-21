class Solution {
    public int lastRemaining(int n) {
        boolean left= true;
        int start = 1,end=n, step=1;
        while(end>1){
            if(left || end %2==1){
                start=start+step;
            }
            end/=2;
            step=step*2;
            left=!left;
        }
        return start;
    }
}