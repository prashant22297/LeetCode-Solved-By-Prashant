class Solution {
    public String removeOccurrences(String s, String part) {
        int i=s.indexOf(part);
        while(i!=-1){
            s=s.substring(0,i)+s.substring(i+part.length());
            i=s.indexOf(part);
        }
        return s;
    }
}