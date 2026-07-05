class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int max = 0;
        for (int i : gain){
            currentAltitude += i;
            max = Math.max(max, currentAltitude);
        }
        return max;
    }
}