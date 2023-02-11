class Solution {
    public boolean isItPossible(String word1, String word2) {
        int dist1=0,dist2=0,max1=0,max2=0;
        int[] fre1 = new int[26];
        int[] fre2 = new int[26];
        for(char ch : word1.toCharArray()){
            fre1[ch-'a']++;
            max1 = Math.max(max1,fre1[ch-'a']);
        }
        for(char ch : word2.toCharArray()){
            fre2[ch-'a']++;
            max2 = Math.max(max2,fre2[ch-'a']);
        }
        // System.out.println(max2);
        // System.out.println(Arrays.toString(fre1));
        // System.out.println(Arrays.toString(fre2));
        for(int i : fre1)
            if(i>=1) dist1++;
        for(int i : fre2)
            if(i>=1) dist2++;
        // if(dist1==dist2 && max1==max2) return true;
        // if(Math.abs(dist1-dist2)==1){
            for(int i=0;i<26;i++){
                if(fre1[i]==0) continue;
                fre1[i]--;
                for(int j=0;j<26;j++){
                    if(fre2[j]==0) continue;
                    fre2[j]--;
                    
                    fre1[j]++;
                    fre2[i]++;
                    int d1=0,d2=0;
                    for(int ii : fre1)
                        if(ii>=1) d1++;
                    for(int ii : fre2)
                        if(ii>=1) d2++;
                    if(d1==d2) return true;
                    else {
                        fre1[j]--;
                        fre2[i]--;
                    }
                    fre2[j]++;
                }
                fre1[i]++;
            }
                // else if(fre1[i]==0){
                //     if(fre2[i]>1 && max1>1){
                //         return true;
                //     }
                //     else return false;
                // }
                // else if(fre2[i]==0){
                //     if(fre1[i]>1 && max2>1){
                //         return true;
                //     }
                //     else return false;
                // }
        // }
        // else return false;
        // System.out.println(dist1);
        // System.out.println(dist2);
        return false;
    }
}