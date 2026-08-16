class Solution {
    String[] keypad = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        if (digits.isEmpty()) {
            return result;
        }

        backtrack(digits, 0, new StringBuilder(), result);

        return result;
    }

    void backtrack(String digits, int index,
                   StringBuilder curr,
                   List<String> result) {

        if (index == digits.length()) {
            result.add(curr.toString());
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            curr.append(ch);

            backtrack(digits, index + 1, curr, result);

            curr.deleteCharAt(curr.length() - 1);
        }
    }
}