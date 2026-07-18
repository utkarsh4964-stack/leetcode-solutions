class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0; 
        int l = nums.length;
        for (int i = 0;i< l ; i++){
            if(nums[i] == val){
                continue;
            }
            else{
               nums[c]=nums[i];
               c++;
            }
        }
        return c;
    }
}