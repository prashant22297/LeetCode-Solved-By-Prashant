class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list11 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list22 = new ArrayList<>();
        for(int i :nums1)
            list11.add(i);
        for(int i : nums2)
            list22.add(i);
        for(int i:nums1){
            if(!list22.contains(i) && !list1.contains(i)){
                list1.add(i);
            }
        }
        for(int i:nums2){
            if(!list11.contains(i) && !list2.contains(i)){
                list2.add(i);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(list1));
        ans.add(new ArrayList<>(list2));
        return ans;
    }
}