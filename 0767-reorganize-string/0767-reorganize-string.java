class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];
        for(Character c : s.toCharArray()){
            freq[c-97]++;
        }
        int max=0;
        char letter='0';
        for(Character c : s.toCharArray()){
            if(freq[c-97]>max){
                max = freq[c-97];
                letter = c;
            }
        }
        if(max >(s.length()+1)/2)
            return "";
        char[] ch = new char[s.length()];
        int idx=0;
        for(;idx<s.length();idx+=2){
            if(max>0){
                ch[idx]=letter;
                max--;
                freq[letter-97]--;
            }
            else break;
        }
        for(int i=0;i<26;i++){
            while(freq[i]>0){
                if(idx>=s.length()){
                    idx=1;
                }
                ch[idx]=(char)(i+97);
                idx+=2;
                freq[i]--;
            }
        }
        // for(char c: ch){
        //     System.out.println(c);
        // }
        return String.valueOf(ch);
    }
}