// class Solution {
//     int parent=0;
//     public List<List<Integer>> getAncestors(int n, int[][] edges) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for(int i=0;i<n;i++)
//             adj.add(new ArrayList<>());
        
//         for(int[] edge: edges){
//             adj.get(edge[0]).add(edge[1]);
//         }
//         System.out.println(adj);
//         List<SortedSet<Integer>> set = new ArrayList<>(); 
//         for(int i=0;i<n;i++)
//             set.add(new TreeSet<>());
//         // dfs
//         for(int i=0;i<n;i++){
//             parent=i;
//             dfs(adj,set,i);
//         }
//         List<List<Integer>> ans = new ArrayList<>();
//         for(SortedSet<Integer> s : set){
//             ans.add(new ArrayList<>(s));
//         }
//         return ans;
//     }
//     private void dfs( List<List<Integer>> adj, List<SortedSet<Integer>> set , int i){
//         List<Integer> childs = adj.get(i);
//         SortedSet<Integer> s = set.get(i);
//         for(Integer child : childs){
//             set.get(child).add(i);
//             set.get(child).addAll(s);
//         }
//     }
// }

// Brute Force -- TLE O(N*E*(log N))
// class Solution {
//     int parent=0;
//     public List<List<Integer>> getAncestors(int n, int[][] edges) {
//         List<List<Integer>> adj = new ArrayList<>();
//         for(int i=0;i<n;i++)
//             adj.add(new ArrayList<>());
        
//         for(int[] edge: edges){
//             adj.get(edge[0]).add(edge[1]);
//         }
//         List<SortedSet<Integer>> set = new ArrayList<>(); 
//         for(int i=0;i<n;i++)
//             set.add(new TreeSet<>());
//         // dfs
//         for(int i=0;i<n;i++){
//             parent=i;
//             dfs(adj,set,i);
//         }
//         List<List<Integer>> ans = new ArrayList<>();
//         for(SortedSet<Integer> s : set){
//             ans.add(new ArrayList<>(s));
//         }
//         return ans;
//     }
//     private void dfs( List<List<Integer>> adj, List<SortedSet<Integer>> set , int i){
//         List<Integer> childs = adj.get(i);
//         for(Integer child : childs){
//             set.get(child).add(parent);
//             dfs(adj,set,child);
//         }
//     }
// }


class Solution {
    int parent=0;
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> ans = new ArrayList<>(); 
        for(int i=0;i<n;i++)
            ans.add(new ArrayList<>());
        
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++)
            adj.add(new ArrayList<>());
        
        for(int[] edge: edges){
            adj.get(edge[0]).add(edge[1]);
        }

        for(int i=0;i<n;i++){  
            dfs(adj,i,i,ans,new boolean[n]);
        }
        return ans;
    }
    private void dfs( List<List<Integer>> adj, int parent, int curr, List<List<Integer>> ans, boolean[] visit){
        visit[curr]=true;
        List<Integer> childs = adj.get(curr);
        for(Integer child : childs){
            if(!visit[child]){
                ans.get(child).add(parent);
                dfs(adj,parent,child,ans,visit);
            }
        }
    }
}