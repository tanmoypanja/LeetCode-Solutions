class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
       boolean[] visited = new boolean[nums.length];
       backtrack(nums, visited, new ArrayList<>());
       return ans; 
    }
    private void backtrack(int[] nums, boolean[] visited, List<Integer> current){
        if(current.size() == nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i])  continue;
            visited[i] = true;
            current.add(nums[i]);
            backtrack(nums, visited, current);
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}