class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        int sum=0;
        int l=0;
        int r=people.length-1;
        Arrays.sort(people);
        while(l<=r){
            sum = people[l] + people[r];
            if(sum<=limit)
                l++;
            
            c++;
            r--;
        }
        return c;
    }
}