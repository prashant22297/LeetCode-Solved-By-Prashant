class Solution {
    public int countTriplets(int[] arr) {
        int ans =0;
        int[] prefix = new int[arr.length+1];
        prefix[0]=0;
        for(int i=1;i<prefix.length;i++)
            prefix[i] = prefix[i-1] ^ arr[i-1];
        // System.out.println(Arrays.toString(prefix));
        for(int i=0;i<arr.length+1;i++){
            for(int j=i+1;j<arr.length+1;j++){
                if(prefix[i]==prefix[j]){
                    // System.out.println(i+" "+j);
                    ans+=j-i-1;
                }
            }
        }
        return ans;
    }
}