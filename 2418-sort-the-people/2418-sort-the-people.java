class Solution {
     class pair{
        int height;
        String name;
        pair(int height, String name) {
            this.height = height;
            this.name = name;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        pair[] p = new pair[n];
        for(int i=0;i<n;i++){
            p[i]=new pair(heights[i],names[i]);
        }
        Arrays.sort(p, new Comparator<>() {
            @Override
            public int compare(pair a, pair b) {
                return b.height - a.height;
            }
        });
        for(int i=0;i<n;i++){
            names[i]=p[i].name;
        }
        return names;
    }
}