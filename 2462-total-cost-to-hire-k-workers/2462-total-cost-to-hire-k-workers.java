class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long sum=0;
        PriorityQueue<Integer> left = new PriorityQueue<>();
        PriorityQueue<Integer> right = new PriorityQueue<>();
        int i=0,j=costs.length-1;
        for(;i<candidates;i++){
            left.add(costs[i]);
        }
        for(;j>Math.max(costs.length-candidates-1,candidates-1);j--){
            right.add(costs[j]);
        }
        // System.out.println(left.toString());
        // System.out.println(right.toString());
        while(k-->0){
            
            if(left.size()!=0 && right.size()!=0){
                int l = left.peek(), r=right.peek();
            if(l<=r){
                left.poll();
                sum+=l;
                if(i<=j){
                    left.add(costs[i]);
                    i++;
                }
                // if(j<=i && l==r){
                //     right.poll();
                // }
            }
            else{
                sum+=r;
                right.poll();
                if(i<=j){
                    right.add(costs[j]);
                    j--;
                }
                // if(j<=i){
                //     left.poll();
                // }
            }
            }
            else if(left.size()!=0){
                sum+=left.peek();
                left.poll();
            }
            else {
                sum+=right.peek();
                right.poll();
            }
        }
        return sum;
    }
}