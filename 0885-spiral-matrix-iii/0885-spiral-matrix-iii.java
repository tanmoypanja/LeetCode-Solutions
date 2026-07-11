class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];
        int[][] dir = {
                {0,1},    // East
                {1,0},    // South
                {0,-1},   // West
                {-1,0}    // North
        };
        int count = 0;
        ans[count++] = new int[]{rStart, cStart};
        int step = 1;
        while (count < rows * cols) {
            for (int d = 0; d < 2; d++) {
                for (int i = 0; i < step; i++) {
                    rStart += dir[d][0];
                    cStart += dir[d][1];
                    if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {
                        ans[count++] = new int[]{rStart, cStart};
                        if (count == rows * cols)
                            return ans;
                    }
                }
            }
            step++;
            for (int d = 2; d < 4; d++) {
                for (int i = 0; i < step; i++) {
                    rStart += dir[d][0];
                    cStart += dir[d][1];
                    if (rStart >= 0 && rStart < rows &&
                        cStart >= 0 && cStart < cols) {
                        ans[count++] = new int[]{rStart, cStart};
                        if (count == rows * cols)
                            return ans;
                    }
                }
            }
            step++;
        }
        return ans;
    }
}