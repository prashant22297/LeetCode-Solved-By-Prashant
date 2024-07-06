class Solution {
    public int passThePillow(int n, int time) {
        int i = 1;
        while(time != 0){
            for( ; i < n ; i++ ) {
                if(time != 0){
                    time--;
                }
                else
                    break;
            }
            for( ; i > 1 ; i-- ) {
                if(time != 0) {
                    time--;
                }
                else
                    break;
            }
        }
        return i;
    }
}