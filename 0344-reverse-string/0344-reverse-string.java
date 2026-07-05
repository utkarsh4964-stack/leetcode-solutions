class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        char temp;
        int r=s.length-1;
        while (l<r){
            temp=s[r];
            s[r]=s[l];
            s[l]=temp;
            l++;
            r--;
        }
    }
}