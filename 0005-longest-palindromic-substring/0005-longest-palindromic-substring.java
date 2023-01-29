class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans="";
        for(int i=0;i<n;i++){
            int l=i,r=i;
            while((r<n && l>=0) && s.charAt(l)==s.charAt(r)){
                if(ans.length()<r-l+1){
                    ans=s.substring(l,r+1);
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while((r<n && l>=0) &&s.charAt(l)==s.charAt(r)){
                if(ans.length()<r-l+1){
                    ans=s.substring(l,r+1);
                }
                l--;
                r++;
            }
        }
        return ans;
        
        
        
        
//         String ans ="", temp="",sub="";
//         int start=0,end=s.length()-1;
//         for(int i=0;i<s.length();i++){
//             start=i;
//             end=s.length()-1;
//             while(start<end){
//                 // System.out.println("while");
//                 if(!(ans.length()<end-i+1)) break;
//                 if(s.charAt(start)==s.charAt(end) && ans.length()<end-i+1){
//                     // System.out.println(s.charAt(start)+" "+s.charAt(end));
//                     // System.out.println("while");
//                     sub=s.substring(i,end+1);
//                     String r = rev(sub);
//                     // System.out.println(sub);
//                     if(sub.equals(r)){
//                         ans=sub;
//                     }
//                 }
                
//                 end--;
//             }   
//         }
//         if(ans.length()==0) ans+=s.charAt(0);
//         return ans;
//     }
    
//     public String rev(String s){
//         String temp="";
//         for(int i=s.length()-1;i>=0;i--){
//             temp+=s.charAt(i);
//         }
//         return temp;
    }
}