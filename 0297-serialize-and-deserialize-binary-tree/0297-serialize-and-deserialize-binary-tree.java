/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int idx=0;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        StringBuffer s = new StringBuffer();
        seri(root,s);
        return s.toString();
    }
    
    private void seri(TreeNode root, StringBuffer s){
        if(root==null){
            s.append(',');
            s.append('n');
            return;
        }
        if(s.length()==0) s.append(Integer.toString(root.val));
        else s.append(","+Integer.toString(root.val));
        seri(root.left,s);
        seri(root.right,s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="") return null;
        String[] s = data.split(",");
        return deseri(s);
    }
    
    private TreeNode deseri(String[] s){
        if(idx>=s.length || s[idx].equals("n")){
            idx++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(s[idx++]));
        root.left = deseri(s);
        root.right=deseri(s);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));