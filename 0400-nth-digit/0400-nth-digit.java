class Solution {
    public int findNthDigit(int n) {
        int first = 1;
        long num=9;
        int count=1;
        while(n>first*num){
            n-=first*num;
            // count=count+first*num;
            first++;
            num=num*10;
            count=count*10;
        }
        // count--;
        count+=(n-1)/first;
        // count;
        // System.out.println(n+" "+count);
        // count=count%first;
        String temp = Integer.toString(count);
        return Character.getNumericValue(temp.charAt((n-1)%first));
    }
}