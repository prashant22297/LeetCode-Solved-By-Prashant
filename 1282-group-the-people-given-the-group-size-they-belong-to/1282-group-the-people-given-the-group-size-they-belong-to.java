class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,List<Integer>> mp = new HashMap<>();

        for(int i=0;i<groupSizes.length;i++){
            List<Integer> temp=mp.computeIfAbsent(groupSizes[i],k->new ArrayList<>());
            temp.add(i);
            if(temp.size()==groupSizes[i]){
                result.add(temp);
                mp.remove(groupSizes[i]);
            }
        }
        return result;
    }
}