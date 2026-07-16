class Solution {
    public int majorityElement(int[] nums) {
        int n = (nums.length-1)/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int j =0;j<nums.length;j++){
            int s = map.get(nums[j]);
            if(s>n){
                return nums[j];
            }
            s=0;
        }
        return -1;
    }
}