class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,Map<String,Double>> graph = new HashMap<>();
        for(int i=0;i<equations.size();i++){
            String src = equations.get(i).get(0);
            String des = equations.get(i).get(1);
            double val = values[i];
            
            graph.putIfAbsent(src,new HashMap());
            graph.putIfAbsent(des,new HashMap());
            
            graph.get(src).put(des,val);
            graph.get(des).put(src,1.0/val);
        }
        double[] ans = new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            String src = queries.get(i).get(0);
            String des = queries.get(i).get(1);
            if(!graph.containsKey(src) || !graph.containsKey(des)) ans[i]=-1.0;
            else {
                double[] a = {-1.0};
                double temp = 1.0;
                Set<String> vis = new HashSet<>();
                dfs(graph,src,des,a,temp,vis);
                ans[i]=a[0];
            }
        }
        return ans;
    }
    public void dfs(Map<String, Map<String, Double>> graph,String src, String des, double[] a, double temp,Set<String> vis) {
        if (vis.contains(src)) return;

        vis.add(src);
        if (src.equals(des)) {
            a[0] = temp;
            return;
        }
        for (Map.Entry<String , Double> e : graph.get(src).entrySet()) {
            String next = e.getKey();
            double val = e.getValue();
            dfs(graph,next, des, a, temp*val,vis);
        }
    }
}