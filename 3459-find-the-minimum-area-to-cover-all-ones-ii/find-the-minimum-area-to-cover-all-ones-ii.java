class Solution {
    public int minimumSum(int[][] grid) {
        int min_area = Integer.MAX_VALUE;

        // CASE 1 :
        // |````````|
        // |```|````|
        // |   |    |
        // ``````````
        for (int row_split = 1; row_split < grid.length; row_split++) {
            for (int col_split = 1; col_split < grid[0].length; col_split++) {
                int top_rectangle = minimumArea(0, row_split, 0, grid[0].length, grid);
                int bottom_left_rectangle = minimumArea(row_split, grid.length, 0, col_split, grid);
                int bottom_right_rectangle = minimumArea(row_split, grid.length, col_split, grid[0].length, grid);

                min_area = Math.min(min_area, top_rectangle + bottom_left_rectangle + bottom_right_rectangle);
            }
        }

        // CASE 2 :
        // |````|````|
        // |____|____|
        // |_________|
        for (int row_split = 1; row_split < grid.length; row_split++) {
            for (int col_split = 1; col_split < grid[0].length; col_split++) {
                int top_left_rectangle = minimumArea(0, row_split, 0, col_split, grid);
                int top_right_rectangle = minimumArea(0, row_split, col_split, grid[0].length, grid);
                int bottom_rectangle = minimumArea(row_split, grid.length, 0, grid[0].length, grid);

                min_area = Math.min(min_area, top_left_rectangle + top_right_rectangle + bottom_rectangle);
            }
        }

        // CASE 3 :
        // |```````|
        // |```````|
        // |```````|
        // `````````
        for (int row_1_split = 1; row_1_split < grid.length; row_1_split++) {
            for (int row_2_split = 2; row_2_split < grid.length; row_2_split++) {
                int top_rectangle = minimumArea(0, row_1_split, 0, grid[0].length, grid);
                int middle_rectangle = minimumArea(row_1_split, row_2_split, 0, grid[0].length, grid);
                int bottom_rectangle = minimumArea(row_2_split, grid.length, 0, grid[0].length, grid);

                min_area = Math.min(min_area, top_rectangle + middle_rectangle + bottom_rectangle);
            }
        }

        // CASE 4 :
        // |````|````|````|
        // |    |    |    |
        // |    |    |    |
        // ````````````````
        for (int col_1_split = 1; col_1_split < grid[0].length; col_1_split++) {
            for (int col_2_split = 2; col_2_split < grid[0].length; col_2_split++) {
                int left_rectangle = minimumArea(0, grid.length, 0, col_1_split, grid);
                int middle_rectangle = minimumArea(0, grid.length, col_1_split, col_2_split, grid);
                int right_rectangle = minimumArea(0, grid.length, col_2_split, grid[0].length, grid);

                min_area = Math.min(min_area, left_rectangle + middle_rectangle + right_rectangle);
            }
        }

        // CASE 5 :
        // |````|````|
        // |    |____|
        // |    |    |
        // |____|____|

        for (int row_split = 1; row_split < grid.length; row_split++) {
            for (int col_split = 1; col_split < grid[0].length; col_split++) {
                int left_rectangle = minimumArea(0, grid.length, 0, col_split, grid);
                int top_right_rectangle = minimumArea(0, row_split, col_split, grid[0].length, grid);
                int bottom_right_rectangle = minimumArea(row_split, grid.length, col_split, grid[0].length, grid);

                min_area = Math.min(min_area, left_rectangle + top_right_rectangle + bottom_right_rectangle);
            }
        }

        // CASE 6 :
        // |````|````|
        // |____|    |
        // |    |    |
        // |____|____|
        for (int row_split = 1; row_split < grid.length; row_split++) {
            for (int col_split = 1; col_split < grid[0].length; col_split++) {
                int top_left_rectangle = minimumArea(0, row_split, 0, col_split, grid);
                int bottom_left_rectangle = minimumArea(row_split, grid.length, 0, col_split, grid);
                int right_rectangle = minimumArea(0, grid.length, col_split, grid[0].length, grid);

                min_area = Math.min(min_area, top_left_rectangle + bottom_left_rectangle + right_rectangle);
            }
        }

        return min_area;
    }

    int minimumArea(int row_start, int row_end, int col_start, int col_end, int[][] grid) {
        // index of upper most 1
        int[] top = new int[2];
        for (int i = row_start; i < row_end; i++) {
            boolean found = false;
            for (int j = col_start; j < col_end; j++) {
                if (grid[i][j] == 1) {
                    top[0] = i;
                    top[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // index of lower most 1
        int[] bottom = new int[2];
        for (int i = row_end - 1; i >= row_start; i--) {
            boolean found = false;
            for (int j = col_start; j < col_end; j++) {
                if (grid[i][j] == 1) {
                    bottom[0] = i;
                    bottom[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // index of right most 1
        int[] left = new int[2];
        for (int j = col_start; j < col_end; j++) {
            boolean found = false;
            for (int i = row_start; i < row_end; i++) {
                if (grid[i][j] == 1) {
                    left[0] = i;
                    left[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        // index of left most 1
        int[] right = new int[2];
        for (int j = col_end - 1; j >= col_start; j--) {
            boolean found = false;
            for (int i = row_start; i < row_end; i++) {
                if (grid[i][j] == 1) {
                    right[0] = i;
                    right[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        int[] top_left = new int[] { top[0], left[1] };
        int[] bottom_right = new int[] { bottom[0], right[1] };

        int area = (bottom_right[0] - top_left[0] + 1) * (bottom_right[1] - top_left[1] + 1);

        return area;
    }
}