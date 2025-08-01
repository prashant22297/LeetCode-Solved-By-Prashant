class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> output = new ArrayList<List<Integer>>();
			List<Integer> temp = new ArrayList<>();

			for (int i = 0; i < numRows; i++) {
				temp.add(0,1);
				for (int j = 1; j < temp.size()-1; j++) {
					temp.set(j, temp.get(j) + temp.get(j+1));
				}
				output.add(new ArrayList<>(temp));
			}
	    
         
	    return output;      
    }
}