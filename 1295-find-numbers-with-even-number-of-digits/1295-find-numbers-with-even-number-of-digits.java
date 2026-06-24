class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i = 0; i < nums.length; i++){
            int digit = 0;
            int temp = nums[i];
            while(temp != 0){
                temp=temp/10;
                digit++;
            }
            if(digit%2 == 0){
                even++;
            }
        }
        return even;
    }
}