class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2 || n!= nums[i-2]){ //{1,1,1} then replace by only{1,1}or{2,2,2,2} by {2,2} and if {3,3}then write as it as ok bro..
                nums[i++]=n;
            }
        }
        return i;
    }
}