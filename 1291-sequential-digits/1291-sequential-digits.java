class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String s = "123456789";
        int a = String.valueOf(low).length();
        int b = String.valueOf(high).length();
        for(int i=a;i<=b;i++){
            for(int j=0;j<=9-i;j++){
                int temp=Integer.valueOf(s.substring(j,j+i));
                if(temp>=low && temp<=high){
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
}