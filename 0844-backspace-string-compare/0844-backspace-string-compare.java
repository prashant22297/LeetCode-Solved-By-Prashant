class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j = t.length()-1;
        
        while(i>=0 || j>=0){
            int count=0;
            while(i>=0){
                if(s.charAt(i)=='#') count++;
                else if(count>0) count--;
                else break;
                i--;
            }
            
            count=0;
            while(j>=0){
                if(t.charAt(j)=='#') count++;
                else if(count>0) count--;
                else break;
                j--;
            }
            
            if(i<0 && j<0) return true;
            else if(i<0 || j<0) return false;
            else if(s.charAt(i)!=t.charAt(j)) return false;
            
            i--;
            j--;
            
        }
        return true;
    }
}