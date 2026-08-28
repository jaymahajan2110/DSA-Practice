class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int child = 0;

        for (int i = 0; i < s.length && child < g.length; i++) {

            if (s[i] >= g[child]) {
                count++;
                child++;
            }
        }

        return count;
    }
}