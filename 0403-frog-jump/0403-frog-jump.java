class Solution {
    public boolean canCross(int[] stones) {
        Map<String,Boolean> mp = new HashMap<>();
        if(stones[1]!=1) return false;
        return solve(stones,1,1,mp);
    }
    
    private boolean solve(int[] stones , int idx, int jumps,Map<String,Boolean> mp){
        if(idx>=stones.length) return false;
        if(idx == stones.length-1) return true;
        boolean a = false;
        boolean b = false;
        boolean c = false;
        int curr = stones[idx];
        Boolean isPos=false;
        String temp = idx+"_"+jumps;
        if(mp.containsKey(temp)){
            return mp.get(temp);
        }
        if(jumps-1>0 ){
            String key = idx+"_"+(jumps-1);
            // if(mp.containsKey(key)){
            //     return mp.get(key);
            // }
            // else{
            int next = Arrays.binarySearch(stones,jumps-1+curr);
            if(next>0){
                a=(solve(stones,next,jumps-1,mp));
                if(a==true)isPos=true;
                // a = 
            
            }
        }
        if(jumps>0 ){
            String key = idx+"_"+(jumps);
            // if(mp.containsKey(key)){
            //     return mp.get(key);
            // }
            // else{
            int next = Arrays.binarySearch(stones,jumps+curr);
            if(next>0){
                b=(solve(stones,next,jumps,mp));
                if(b==true)isPos=true;
            // }
            }
        }
        if(jumps+1>0 ){
            //  String key = idx+"_"+(jumps+1);
            // if(mp.containsKey(key)){
            //     return mp.get(key);
            // }
            // else{
            int next = Arrays.binarySearch(stones,jumps+1+curr);
            if(next>0){
                c=(solve(stones,next,jumps+1,mp));
                if(c==true)isPos=true;
            // }
            }
        }
        mp.put(temp,isPos);
        return isPos;
    }
}