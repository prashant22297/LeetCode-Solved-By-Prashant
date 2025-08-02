class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> frequency = new HashMap<>();
        Map<Integer, Integer> freq1 = new HashMap<>();
        Map<Integer, Integer> freq2 = new HashMap<>();
        int n = basket1.length;
        int minCost = Integer.MAX_VALUE;
        for (int num : basket1) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            freq1.put(num, freq1.getOrDefault(num, 0) + 1);
            minCost = Math.min(minCost, num);
        }
        for (int num : basket2) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
            freq2.put(num, freq2.getOrDefault(num, 0) + 1);
            minCost = Math.min(minCost, num);
        }

        // Check if impossible
        for (int count : frequency.values()) {
            if (count % 2 != 0) {
                return -1;
            }
        }

        List<Integer> extra1 = new ArrayList<>();
        List<Integer> extra2 = new ArrayList<>();
        for (int num : frequency.keySet()) {
            int target = frequency.get(num) / 2;
            int count1 = freq1.getOrDefault(num, 0);
            int count2 = freq2.getOrDefault(num, 0);
            if (count1 > target) {
                for (int i = 0; i < count1 - target; i++) {
                    extra1.add(num);
                }
            }
            if (count2 > target) {
                for (int i = 0; i < count2 - target; i++) {
                    extra2.add(num);
                }
            }
        }

        Collections.sort(extra1);
        Collections.sort(extra2, Collections.reverseOrder());

        long res = 0;
        for (int i = 0; i < extra1.size(); i++) {
            int x = extra1.get(i);
            int y = extra2.get(i);
            res += Math.min(2L * minCost, Math.min(x, y)); // the important part.
        }

        return res;
    }
}
