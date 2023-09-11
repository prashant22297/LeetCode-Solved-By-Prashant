class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,List<Integer>> mp = new HashMap<>();

        for(int i=0;i<groupSizes.length;i++){
            List<Integer> temp;
            if(mp.containsKey(groupSizes[i])){
                temp=mp.get(groupSizes[i]);
                temp.add(i);
            }
            else{
                temp = new ArrayList<>();
                temp.add(i);
                mp.put(groupSizes[i],temp);
            }
            if(temp.size()==groupSizes[i]){
                result.add(new ArrayList(temp));
                mp.remove(groupSizes[i]);
            }
        }
        return result;
    }
}