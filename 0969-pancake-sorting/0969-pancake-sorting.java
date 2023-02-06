class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int n=arr.length;
        List<Integer> ans = new ArrayList<>();
        int k=n-1, max_el=0,max_idx=0;int t=10;
        while(k>=0){
            max_el=0;
            System.out.print(k+" ");
            for(int i=0;i<=k;i++){
                if(max_el<arr[i]){
                    max_el=arr[i];
                    max_idx = i;
                }
            }
            System.out.println(max_el+" "+max_idx);
            if(max_idx==0) {
                ans.add(k+1);
                reverse(0,k+1,arr);
                k--;
            }
            else{
                ans.add(max_idx+1);
                reverse(0,max_idx+1,arr);
            }
            
        }
        return ans;
    }
    public void reverse(int i, int j,int[] arr){
        for (i = 0; i <j/2; i++)
        {
            int temp= arr[i];
            arr[i] = arr[j-i-1];
            arr[j-i-1] = temp;            
        }
        System.out.print(Arrays.toString(arr));
    }
}