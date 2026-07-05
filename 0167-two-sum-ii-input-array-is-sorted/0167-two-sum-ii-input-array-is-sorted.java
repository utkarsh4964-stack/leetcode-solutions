class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int a = numbers.length;
        int l = 0;
        int r = a-1;
        int []sol = new int[2]; 
        while(l<r)
        {
            if(numbers[l]+numbers[r]==target){
                sol[0]=l+1;
                sol[1]=r+1;
                return sol;
            }
            else if(numbers[l]+numbers[r]<target){
                l++;
            }
            else{
                r--;
            }
        }
        sol[0]=-1;
        sol[1]=-1;
        return sol; 
    }
}