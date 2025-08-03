class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int left = 0;
        int right = 0;
        int n = fruits.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i][0], fruits[i][1]);
        }
        System.out.println(map);
        for (int i = startPos; i <= startPos + k; i++) {
            if (map.containsKey(i))
                right += map.get(i);
        }

        for (int i = startPos; i >= startPos - k; i--) {
            if (map.containsKey(i))
                left += map.get(i);
        }

        int ans = Math.max(left, right);

        int x = startPos;
        int y = startPos + k;
        while (y > startPos) {
            if (map.containsKey(y))
                right -= map.get(y);
            y--;
            if (map.containsKey(y))
                right -= map.get(y);
            y--;
            x--;
            if (map.containsKey(x))
                right += map.get(x);

            ans = Math.max(ans, right);
        }

        x = startPos;
        y = startPos - k;
        while (y < startPos) {
            if (map.containsKey(y))
                left -= map.get(y);
            y++;

            if (map.containsKey(y))
                left -= map.get(y);
            y++;

            x++;
            if (map.containsKey(x))
                left += map.get(x);

            ans = Math.max(ans, left);
        }
        return ans;
    }
}