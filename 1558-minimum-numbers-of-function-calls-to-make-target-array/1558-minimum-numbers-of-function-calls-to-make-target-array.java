class Solution {
    public int minOperations(int[] num) {
        int count = 0,div=0,temp=0;
        for(int i=0;i<num.length;i++){
            temp=0;
            while(num[i]>0){
                if(num[i]%2==0){
                    num[i]/=2;
                    temp++;
                    if(temp>div){
                        count++;
                        div=temp;
                    }
                }
                else{
                    num[i]--;
                    count++;
                }
            }
        }
        return count;
    }
}