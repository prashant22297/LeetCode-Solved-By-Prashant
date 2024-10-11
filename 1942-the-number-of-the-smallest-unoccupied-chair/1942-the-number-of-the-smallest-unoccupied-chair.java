class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        int targetFriendArrivalTime = times[targetFriend][0];
        System.out.println(targetFriendArrivalTime);
        Arrays.sort(times,(a,b)->a[0]-b[0]);
        int[] chair = new int[n];
        Arrays.fill(chair,-1);
        for(int[] time : times){
            int arrival= time[0];
            int departure = time[1];
            for(int i =0;i<n;i++){
                if(chair[i]==-1 || chair[i]<=arrival){
                    chair[i]=departure;
                    if(arrival == targetFriendArrivalTime){
                        return i;
                    }
                    break;
                }
            }
        }
        return 0;
    }
}