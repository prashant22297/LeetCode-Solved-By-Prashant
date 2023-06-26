class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int hire =0;
        long ans=0;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int i=0,j=costs.length-1;
        while(hire != k){
            while(left.size()<candidates && i<=j){
                left.add(costs[i]);
                i++;
            }
            while(right.size()<candidates && j>=i){
                right.add(costs[j]);
                j--;
            }
            int a = left.size()==0?Integer.MAX_VALUE:left.peek();
            int b = right.size()==0?Integer.MAX_VALUE:right.peek();
            if(a<=b){
                ans+=a;
                left.poll();
            }
            else {
                ans+=b;
                right.poll();
            }
            hire++;
        }
        return ans;
    }
}