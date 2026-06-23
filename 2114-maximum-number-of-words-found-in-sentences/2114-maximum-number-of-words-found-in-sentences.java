import java.util.StringTokenizer;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String str : sentences){
            StringTokenizer tokenizer= new StringTokenizer(str);
            int words = tokenizer.countTokens();
            max = Math.max(max, words);
        }
        return max;
    }
}