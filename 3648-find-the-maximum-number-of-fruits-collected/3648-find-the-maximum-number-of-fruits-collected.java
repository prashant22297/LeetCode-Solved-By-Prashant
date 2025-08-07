class Solution {
    public int maxCollectedFruits(int[][] fruits) {
        int n = fruits.length;
        int totalFruits = 0;

        for (int i = 0; i < n; i++) {
            totalFruits += fruits[i][i];
        }

        totalFruits += calculateMaxFruits(fruits);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = fruits[i][j];
                fruits[i][j] = fruits[j][i];
                fruits[j][i] = temp;
            }
        }

        totalFruits += calculateMaxFruits(fruits);

        return totalFruits;
    }

    private int calculateMaxFruits(int[][] fruits) {
        int n = fruits.length;
        int[] prevRowMax = new int[n];
        int[] currRowMax = new int[n];

        for (int i = 0; i < n; i++)
            prevRowMax[i] = Integer.MIN_VALUE;

        prevRowMax[n - 1] = fruits[0][n - 1];

        for (int row = 1; row < n - 1; row++) {
            for (int i = 0; i < n; i++)
                currRowMax[i] = Integer.MIN_VALUE;

            int startCol = Math.max(n - 1 - row, row + 1);
            for (int col = startCol; col < n; col++) {
                int bestPrev = prevRowMax[col];
                if (col - 1 >= 0)
                    bestPrev = Math.max(bestPrev, prevRowMax[col - 1]);
                if (col + 1 < n)
                    bestPrev = Math.max(bestPrev, prevRowMax[col + 1]);
                currRowMax[col] = bestPrev + fruits[row][col];
            }

            int[] temp = prevRowMax;
            prevRowMax = currRowMax;
            currRowMax = temp;
        }

        return prevRowMax[n - 1];
    }
}