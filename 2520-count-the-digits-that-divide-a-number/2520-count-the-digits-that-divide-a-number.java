class Solution {
    public int countDigits(int num) {
        int a = num;
        int temp=0;
        int c=0;
        while(a>0){
            {
                temp = a%10;
                if(temp != 0 && num%temp==0){
                    c=c+1;
                }
            }
            a = a/10;
        }
        return c;
    }
}