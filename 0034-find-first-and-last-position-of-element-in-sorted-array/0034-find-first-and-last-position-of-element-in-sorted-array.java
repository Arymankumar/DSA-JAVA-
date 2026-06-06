class Solution {
    private int bs(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;

            }
        }
        return -1;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] answer = new int[2];
        int index = bs(nums, target);
        if (index == -1) {
            answer[0] = -1;
            answer[1] = -1;
            return answer;
        }
        int high = index;
        int low = index;
        while (high < nums.length && nums[high] == target) {
            high++;
        }
        while (low >= 0 && nums[low] == target) {
            low--;
        }
        answer[0] = low + 1;
        answer[1] = high - 1;
        return answer;
    }
}