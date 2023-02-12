class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tgas=0,tcost=0;
        for(int i=0;i<gas.length;i++){
            tgas+=gas[i];
            tcost+=cost[i];
        }
        if(tgas<tcost) return -1;
        int gashai=0,ans=0;
        for(int i=0;i<gas.length;i++){
            gashai=gashai+(gas[i]-cost[i]);
            if(gashai<0){
                ans=i+1;
                gashai=0;
            }
        }
        return ans;
    }
}