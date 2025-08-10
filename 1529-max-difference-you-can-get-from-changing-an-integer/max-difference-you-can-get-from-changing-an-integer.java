class Solution {
    boolean leadingZero;

    public int maxDiff(int num) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int number = replace(num, i, j);
                if (leadingZero) {
                    leadingZero = false;
                    continue;
                }
                max = Math.max(max, number);
                min = Math.min(min, number);
            }
        }
        return max - min;
    }

    public int replace(int num, int x, int y) {
        int n = 0;
        int count = 1;
        int temp = num;
        int r = -1;
        while (temp > 0) {
            r = temp % 10;
            if (r == x) {
                r = y;
            }
            n += r * count;
            count *= 10;
            temp /= 10;
        }
        if (r == 0) {
            leadingZero = true;
        }
        return n;
    }
}