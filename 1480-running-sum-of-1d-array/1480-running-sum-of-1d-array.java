class Solution {
    public int[] runningSum(int[] nums) {
        int a = nums.length;
        int[] copy= new int[a];
        copy[0]=nums[0];
        for(int i= 1;i<nums.length;i++)
        {
            copy[i]=copy[i-1] + nums[i];
        }
        return copy;
    }
}