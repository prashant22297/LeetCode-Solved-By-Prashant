class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2002];
        for(int i : arr){
            if(i<0)
                freq[1000+(-1*i)]++;
            else 
                freq[i]++;
        }
        Arrays.sort(freq);
        for(int i=0;i<2001;i++){
            if( freq[i]!=0 && freq[i]==freq[i+1]) return false;
        }
        return true;
    }
}