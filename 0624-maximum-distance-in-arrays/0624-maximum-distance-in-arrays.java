class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int minArrayIndex = -1;
        int minValue = Integer.MAX_VALUE;
        int maxArrayIndex = -1;
        int maxValue = Integer.MIN_VALUE;
        int i = 0;
        for (List<Integer> arr : arrays) {
            if (arr.get(0) < minValue) {
                minValue = arr.get(0);
                minArrayIndex = i;
            }
            i++;
        }
        i = 0;
        for (List<Integer> arr : arrays) {
            if (arr.get(arr.size() - 1) > maxValue && i != minArrayIndex) {
                maxValue = arr.get(arr.size() - 1);
                maxArrayIndex = i;
            }
            i++;
        }
        // System.out.println(maxValue + " " + minValue);

        int ans = maxValue - minValue;

        minArrayIndex = -1;
        minValue = Integer.MAX_VALUE;
        maxArrayIndex = -1;
        maxValue = Integer.MIN_VALUE;
        i = 0;
        for (List<Integer> arr : arrays) {
            if (arr.get(arr.size() - 1) > maxValue) {
                maxValue = arr.get(arr.size() - 1);
                maxArrayIndex = i;
            }
            i++;
        }
        i=0;
        for (List<Integer> arr : arrays) {
            if (arr.get(0) < minValue && i != maxArrayIndex) {
                minValue = arr.get(0);
                minArrayIndex = i;
            }
            i++;
        }
        // System.out.println(maxValue + " " + minValue);
        return Math.max(ans, maxValue - minValue);

    }
}