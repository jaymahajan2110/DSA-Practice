class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, 0, 0, "", result);
        return result;
    }

    static void generate(int n, int open, int close,
                         String p, List<String> result) {

        if (p.length() == 2 * n) {
            result.add(p);
            return;
        }

        if (open < n) {
            generate(n, open + 1, close, p + "(", result);
        }

        if (close < open) {
            generate(n, open, close + 1, p + ")", result);
        }
    }
}