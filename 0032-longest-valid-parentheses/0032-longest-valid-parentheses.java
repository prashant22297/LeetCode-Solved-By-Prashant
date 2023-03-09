class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' && stack.size()>1 && s.charAt(stack.peek())=='('){
                stack.pop();
                ans=Math.max(ans,i-stack.peek());
            }
            else 
                stack.push(i);
        }
        return ans;
    }
}