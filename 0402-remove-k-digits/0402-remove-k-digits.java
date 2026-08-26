class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {

            char current = num.charAt(i);

            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > current) {

                stack.pop();
                k--;
            }

            stack.push(current);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        for (char c : stack) {
            result.append(c);
        }

        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        if (result.length() == 0) {
            return "0";
        }

        return result.toString();
    }
}