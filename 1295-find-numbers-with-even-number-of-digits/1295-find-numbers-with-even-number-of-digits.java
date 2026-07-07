class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        int even=0;
        int temp;
        for(int i=0;i<nums.length;i++){
            temp=nums[i];
            c=0;
            while(temp>0){
                c++;
                temp=temp/10;
            }
            if(c%2==0){
                even++;
            }
        }
        return even;
    }
}