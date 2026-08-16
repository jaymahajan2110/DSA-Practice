class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }
        return padRet("", digits);
    }

    static ArrayList<String> padRet(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        String[] keypad = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }

        return list;
    }
}