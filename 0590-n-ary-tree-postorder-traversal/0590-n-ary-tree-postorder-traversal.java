/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ans;

    public List<Integer> postorder(Node root) {
        ans = new ArrayList<>();
        solve(root);
        return ans;
    }

    public void solve(Node root) {
        if (root == null) return;
        List<Node> children = root.children;
        for (int i = 0; i < children.size(); i++)
            solve(children.get(i));
        ans.add(root.val);
    }
}