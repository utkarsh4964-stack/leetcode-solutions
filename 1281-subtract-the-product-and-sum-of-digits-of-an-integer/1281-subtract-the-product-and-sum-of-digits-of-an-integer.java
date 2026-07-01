class Solution {
    public int subtractProductAndSum(int n) {
        int ans= 0;
        int temp=0;
        int sum = 0;
        int pro = 1;
        while(n>0){
            {
                temp = n%10;
                sum = sum + temp;
                pro = pro*temp;
            }
            n = n/10;
        }
        ans = pro - sum;
        return ans;
    }
}