class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        int[][] shifts = new int[2 * n - 1][2 * n - 1];

        // Store positions of 1s in img1
        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < n; c1++) {

                if (img1[r1][c1] == 1) {

                    // Compare with every 1 in img2
                    for (int r2 = 0; r2 < n; r2++) {
                        for (int c2 = 0; c2 < n; c2++) {

                            if (img2[r2][c2] == 1) {

                                int dr = r2 - r1;
                                int dc = c2 - c1;

                                shifts[dr + n - 1][dc + n - 1]++;
                            }
                        }
                    }
                }
            }
        }

        int ans = 0;

        for (int r = 0; r < 2 * n - 1; r++) {
            for (int c = 0; c < 2 * n - 1; c++) {
                ans = Math.max(ans, shifts[r][c]);
            }
        }

        return ans;
    }
}