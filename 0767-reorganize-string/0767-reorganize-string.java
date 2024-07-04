class Solution {
    
    // Method 2:
    public class pair{
        char ch;
        int freq;
        pair(char ch, int freq){
            this.ch = ch;
            this.freq=freq;
        }
    }
    public class compare implements Comparator<pair>{
        public int compare(pair a , pair b){
            if(a.freq<b.freq){
                return 1;
            }
            return -1;
        }
    }
    public String reorganizeString(String s) {
        PriorityQueue<pair> pq = new PriorityQueue<>(new compare());
        
        int[] freq = new int[26];
        
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pair temp = new pair((char)(i+'a'),freq[i]);
                pq.add(temp);
            }
        }
        pair temp = pq.peek();
        if(temp.freq>((s.length()+1)/2)) return "";
        int i=0;
        char[] ans = new char[s.length()];
        while(!pq.isEmpty()){
            temp = pq.remove();
            int f = temp.freq;
            char ch = temp.ch;
            while(f-->0){
                ans[i]=ch;
                i+=2;
                if(i>=s.length()){
                    i=1;
                }
            }
        }
        return String.valueOf(ans);
    }
    
    
    
    // Method 1:
//      public String reorganizeString(String s) {
//         int[] freq = new int[26];
//         int max = 0;
//         char letter='_';
//         for(int i=0;i<s.length();i++){
//             freq[s.charAt(i)-'a']++;
//             if(freq[s.charAt(i)-'a']>max){
//                 max = freq[s.charAt(i)-'a'];
//                 letter = s.charAt(i);
//             }
//         }
//         if(max > ((s.length()+1)/2)) return "";
//         int idx=0;
//         char[] ans = new char[s.length()];
//         while(max-->0){
//             ans[idx]=letter;
//             idx+=2;
//             freq[letter-97]--;
//         }
//         for(int i = 0;i<26;i++){
//             while(freq[i]>0){
//                 if(idx>=s.length()){
//                     idx=1;
//                 }
//                 ans[idx]=(char)(i+97);
//                 freq[i]--;
//                 idx+=2;
                
//             }
//         }
//         return String.valueOf(ans);
//     }
}