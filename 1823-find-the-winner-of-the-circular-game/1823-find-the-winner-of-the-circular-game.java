class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++)
            q.add(i);
        // System.out.println(q);
        int i=1;
        while(q.size()>1){
            // System.out.print(q);
            if(i!=k){
                int temp=q.poll();
                q.add(temp);
            }
            else{
                q.remove();
                i=0;
            }
            i++;
        }
        return q.poll();
    }
}