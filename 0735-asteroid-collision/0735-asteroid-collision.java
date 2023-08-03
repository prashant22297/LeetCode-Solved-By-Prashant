class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(st.isEmpty() || (st.peek()<0 && asteroids[i]>0) || (st.peek()>0 && asteroids[i]>0)){
                st.push(asteroids[i]);
            }
            else{
                while(st.size()>0 && st.peek()>0 && asteroids[i]<0){
                    int sum = st.peek()+asteroids[i];
                    int a = st.peek();
                    int b = asteroids[i];
                    if(sum<0){
                        st.pop();
                    }
                    else if(sum>0){
                        asteroids[i]=0;
                    }
                    else{
                        st.pop();
                        asteroids[i]=0;
                    }
                }
                if(asteroids[i]!=0) st.push(asteroids[i]);
            }
        }
        int[] ans = new int[st.size()];
        int i=st.size()-1;
        while(!st.isEmpty()){
            ans[i]=st.pop();
            i--;
        }
        return ans;
    }
}