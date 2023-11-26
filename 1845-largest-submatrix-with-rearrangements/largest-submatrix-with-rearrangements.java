class Solution {

    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // Calculate heights for each column
        int[][] heights = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    heights[i][j] = i == 0 ? 1 : heights[i - 1][j] + 1;
                }
            }
        }

        // Sort rows to find the maximum area
        int maxArea = 0;
        for (int i = 0; i < m; i++) {
            Arrays.sort(heights[i]);
            for (int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, heights[i][j] * (n - j));
            }
        }

        return maxArea;
    }
}
