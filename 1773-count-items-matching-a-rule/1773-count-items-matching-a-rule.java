class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = 0;
        if(ruleKey.equals("color")) index=1;
        else if(ruleKey.equals("name")) index=2;
        int count = 0;
        int len = items.size();
        for(int i = 0;i < len;i++){
            if(items.get(i).get(index).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}