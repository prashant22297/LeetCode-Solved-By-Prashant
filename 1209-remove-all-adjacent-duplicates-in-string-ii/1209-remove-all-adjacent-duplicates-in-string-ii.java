class Solution {
    public String removeDuplicates(String s, int k) {
        int i=0,j=1,count=1;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j) && count!=k){
                count++;
                j++;
            }
            else if(count==k){
                s=s.substring(0,i)+s.substring(j);
                // if(j+1<s.length()) s=s.substring(0,i)+s.substring(j);
                // else s=s.substring(0,i);
                
                if(i-count+1<=0) {
                    i=0;
                    j=i+1;
                    count=1;
                }
                else {
                    i=i-count+1;
                    j=i+1;
                    count=1;
                }
                
            }
            else {
                i=j;
                j=i+1;
                count=1;
            }
            // System.out.println(s+" "+i+" "+ j);
        }
        if(j-i==k){
            s=s.substring(0,i);
            // System.out.println("f");
        }
        return s;
    }
}