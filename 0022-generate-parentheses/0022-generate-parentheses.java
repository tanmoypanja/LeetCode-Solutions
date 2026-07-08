class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrack(n, 0, 0, new StringBuilder());
        return ans;
    }
    private void backtrack(int n, int open, int close, StringBuilder current) {
        if (current.length() == 2 * n) {
            ans.add(current.toString());
            return;
        }
        if (open < n) {
            current.append('(');
            backtrack(n, open + 1, close, current);
            current.deleteCharAt(current.length() - 1);
        }
        if (close < open) {
            current.append(')');
            backtrack(n, open, close + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}