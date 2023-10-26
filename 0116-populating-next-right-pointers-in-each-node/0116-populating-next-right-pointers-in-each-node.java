/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // Method 1 TC O(N) + SC O(N)
        // if(root==null) return root;
        // Queue<Node> q = new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int size = q.size();
        //     for(int i=0;i<size;i++){
        //         Node temp = q.remove();
        //         if(i<size-1) temp.next=q.peek();
        //         if(temp.left!=null) q.add(temp.left);
        //         if(temp.right!=null) q.add(temp.right);
        //     }
        // }
        // return root;
        
        
        
        
        // Method 2 TC O(N) + SC O(1)
        if(root==null) return root;
        Node leftMost = root;
        while(leftMost.left!=null){
            Node curr = leftMost;
            while(curr!=null){
                curr.left.next=curr.right;
                if(curr.next!=null){
                    curr.right.next=curr.next.left;
                }
                curr=curr.next;
            }
            leftMost=leftMost.left;
        }
        return root;
        
    }
}