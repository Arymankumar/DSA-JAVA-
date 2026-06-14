class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int num : nums) { //for(int i=0;i<n;i++) and num[i]
            if (num <= left) {
                left = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }
        return false;
    }
}