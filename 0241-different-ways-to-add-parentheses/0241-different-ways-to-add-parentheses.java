class Solution {
    public List<Integer> diffWaysToCompute(String exp) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<exp.length();i++){
            if(exp.charAt(i)=='-' || exp.charAt(i)=='+' || exp.charAt(i)=='*'){
                String p1=exp.substring(0,i);
                String p2=exp.substring(i+1);
                List<Integer> part1 = diffWaysToCompute(p1);
                List<Integer> part2 = diffWaysToCompute(p2);
                // System.out.print(p1);
                // System.out.println(p2);
                for(int a: part1){
                    for(int b: part2){
                        int temp=0;
                        if(exp.charAt(i)=='-'){
                            temp=a-b;
                        }
                        else if(exp.charAt(i)=='+'){
                            temp=a+b;
                        }
                        else{
                            temp=a*b;
                        }
                        ans.add(temp);
                    }
                }
            }
        }
        if(ans.size()==0) {
            ans.add(Integer.valueOf(exp));
        }
        return ans;
    }
}