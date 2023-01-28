class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long sum = 0;
        for(int i : skill){
            sum+=i;
        }
        sum=sum/(skill.length/2);
        // sum=skill[0]+skill[skill.length-1];
        // System.out.print(sum);
        long mul=0;
        int start=0,end=skill.length-1;
        while(start<end){
            if(sum!=skill[start]+skill[end]) return -1;
            mul+=(skill[start]*skill[end]);
            start++;
            end--;
        }
        return mul;
    }
}

    
    
