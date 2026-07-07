class Solution {
    public void sortColors(int[] nums) {
        int o=0;
        int t=0;
        int z=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }
            else if(nums[i]==1){
                o++;
            }
            else{
                t++;
            }
        }
        for(int j=0;j<z;j++){
            nums[j]=0;
        }
        for(int k = z;k< z+o ; k++){
            nums[k]=1;
        }
        for(int l = z+o ; l< z+o+t ; l++){
            nums[l]=2;
        }
        return;
    }
}