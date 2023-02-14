class Solution {
    public List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String[] temp = s.split(" ");
        boolean first=true;
        int count=0,mx=0;
        for(String i : temp){
            int j=0;
            while(j<i.length()){
                mx=Math.max(mx,i.length());
                if(j<ans.size())
                ans.set(j,ans.get(j)+i.charAt(j));
                else if(count==0)
                    ans.add(""+i.charAt(j));
                else {
                    int t = count;
                    String tt="";
                    while(t-->0){
                        tt+=" ";
                    }
                    ans.add(tt+i.charAt(j));
                }
                j++;
            }
            while(j<mx){
                ans.set(j,ans.get(j)+" ");
                j++;
            }
            count++;
            first=false;
        }
        for(int i=0;i<ans.size();i++){
            String t= ans.get(i);
            t=t.replaceFirst("\\s++$", "");
            ans.set(i,t);
        }
        return ans;
    }
}