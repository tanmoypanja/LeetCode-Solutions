class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String current = "";
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(current);
                current = "";
            }
            else if(c == ')') {
                String reversed =
                    new StringBuilder(current)
                    .reverse()
                    .toString();
                current = stack.pop() + reversed;
            }
            else {
                current += c;
            }
        }
        return current;
    }
}