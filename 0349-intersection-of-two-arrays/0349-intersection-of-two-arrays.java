class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();

        for(int i = 0 ; i<nums1.length ;i++){
            set.add(nums1[i]);
        }
        for(int j = 0; j<nums2.length;j++){
            if(set.contains(nums2[j]))
            set1.add(nums2[j]);
        }
        int[] arr = new int[set1.size()];
        int s =0;
        for(int nums:set1){
            arr[s++] =nums;
        }
        return arr ;
    }
}