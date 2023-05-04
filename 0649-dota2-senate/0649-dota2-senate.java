class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Character> q = new LinkedList<>();
        for(char ch : senate.toCharArray()){
            q.offer(ch);
        }
        while(!q.isEmpty()){
            char ch = q.poll();
            q.add(ch);
            if(ch=='R' && q.contains('D')) q.remove('D');
            else if(ch=='D' && q.contains('R')) q.remove('R');
            else return q.poll()=='R'?"Radiant":"Dire";
            
            // if(q.size()==1) break;
        }
        return q.poll()=='R'?"Radiant":"Dire";
    }
}