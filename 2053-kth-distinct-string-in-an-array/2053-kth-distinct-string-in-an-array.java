class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int i=0;
        for(i=0;i<n;i++){
            String s = arr[i];
            boolean flag=true;
            for(int j=i+1;j<n;j++){
                if(s.equals(arr[j])){
                    
                    arr[j]="";
                    flag = false;
                }
                if(s==""){
                    flag=false;
                }
            }
            if(flag){
                // System.out.println(arr[i]);
                k--;
                if(k==0)
                    return s;
            }
            // System.out.println(arr[i]);
            // // System.out.println(Arrays.toString(arr));
        }
        return "";
    }
}