//{ Driver Code Starts
import java.util.*;

class suffix
{
     int index;  
    int rank[] = new int[2];
}

class UniqueSubStr
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            GfG g = new GfG();
            System.out.println(g.countDistinctSubstring(st));
        }
    }
}
// } Driver Code Ends




/*You are required to complete this method */
class GfG
{
   public static int countDistinctSubstring(String st)
   {
       //your code here
       Node root = new Node();
    int n = st.length();
    int count = 0;

    for (int i = 0; i < n; i++) {
      Node node = root;

      for (int j = i; j < n; j++) {
        if (!node.containsKey(st.charAt(j))) {
          node.put(st.charAt(j), new Node());
          count++;
        }
        node = node.get(st.charAt(j));
      }
    }
    return count + 1;
  }
}

class Node {
  Node links[] = new Node[26];

  boolean containsKey(char ch) {
    return (links[ch - 'a'] != null);
  }

  Node get(char ch) {
    return links[ch - 'a'];
  }

  void put(char ch, Node node) {
    links[ch - 'a'] = node;
  }
};
      

  