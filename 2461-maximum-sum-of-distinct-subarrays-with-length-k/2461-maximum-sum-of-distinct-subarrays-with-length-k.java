class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int[] freq = new int[100001];
        int l = 0;
        int distinct = 0;
        long sum = 0;
        long maxSum = 0;
        for (int r = 0; r < nums.length; r++) {
            int index = nums[r];
            if (freq[index] == 0) {
                distinct++;
            }
            freq[index]++;
            sum += nums[r];
            if (r - l + 1 > k) {

                int leftIndex = nums[l];

                freq[leftIndex]--;

                if (freq[leftIndex] == 0) {
                    distinct--;
                }

                sum -= nums[l];

                l++;
            }
            if (r - l + 1 == k && distinct == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}