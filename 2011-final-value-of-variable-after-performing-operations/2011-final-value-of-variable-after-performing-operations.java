class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String i : operations){
            if(i.charAt(1) == '+')
                X++;
            else
                X--;
        }
        return X;
    }
}