/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
        // Method 1 
//     Stack<NestedInteger> st= new Stack<>();
//     public NestedIterator(List<NestedInteger> nestedList) {
//         for(int i=nestedList.size()-1;i>=0;i--){
//             st.push(nestedList.get(i));
//         }
//     }
    
//     @Override
//     public Integer next() {
//         Integer ab ;
//         if(st.peek().isInteger()){
//             return st.pop().getInteger();
//         }
//         else{
//             List<NestedInteger> nums = st.pop().getList();
//             for(int i = nums.size()-1;i>=0;i--){
//                 st.push(nums.get(i));
//             }
//             return st.pop().getInteger();
//         }
//     }

//     @Override
//     public boolean hasNext() {
//         if(st.isEmpty()){
//             return false;
//         }
//         else{
//             while(!st.isEmpty() && !st.peek().isInteger()){
//                 List<NestedInteger> nums = st.pop().getList();
//                 for(int i = nums.size()-1;i>=0;i--){
//                     st.push(nums.get(i));
//                 }
//             }
//             if(st.isEmpty()) return false;
//             else return true;
//         }
//     }
    
    // Method 2:
    
    Queue<Integer> q = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        flatten(nestedList);
    }
    public void flatten(List<NestedInteger> nestedList){
        int len = nestedList.size();
        for(int i=0;i<len;i++){
            if(nestedList.get(i).isInteger()){
                q.add(nestedList.get(i).getInteger());
            }
            else{
                flatten(nestedList.get(i).getList());
            }
        }
    }
    @Override
    public Integer next() {
        return q.remove();
    }

    @Override
    public boolean hasNext() {
        return !q.isEmpty();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */