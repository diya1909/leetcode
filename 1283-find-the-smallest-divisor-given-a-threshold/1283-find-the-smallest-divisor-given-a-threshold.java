class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int low = 1;
       int high = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isValid(nums, mid, threshold)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low; 
    }
     public boolean isValid(int[] nums, int mid, int h) {
        long hours = 0;
        for (int i = 0; i < nums.length; i++) {
            hours += (nums[i] + mid - 1) / mid;
        }
        return hours <= h;
    }
}