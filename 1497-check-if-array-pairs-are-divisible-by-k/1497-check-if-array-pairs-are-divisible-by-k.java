class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int el : arr){
            int temp = el%k;
            if(temp < 0) temp += k;
            if(mp.containsKey(temp)){
                mp.put((temp),mp.get(temp)+1);
            }
            else mp.put(temp,1);
        }
        // System.out.println(mp.toString());
        for(int key: mp.keySet()){
            // System.out.println(key+" "+mp.get(key));
            if(key == 0)
            {
                if(mp.get(key)%2!=0){
                return false;}
            }
            else {
                if(!mp.containsKey(k-key)){
                    return false;
                }
                else {
                    int p = mp.get(key), q= mp.get(k-key);
                    if(p!=q) {
                        // System.out.print(mp.get(key)+" "+mp.get(k-key));
                        return false;
                    }
                }
            }
            
        }
        return true;
    }
}