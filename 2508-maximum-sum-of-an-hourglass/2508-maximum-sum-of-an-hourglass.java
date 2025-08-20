class Solution {
    public int maxSum(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;
        int sum = 0, maxSum = 0;
        for (int i = 0; i < R - 2; i++) {
            for (int j = 0; j < C - 2; j++) {
                sum = (grid[i][j] + grid[i][j + 1] + grid[i][j + 2]) + (grid[i + 1][j + 1])
                        + (grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2]);
                maxSum = Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
}