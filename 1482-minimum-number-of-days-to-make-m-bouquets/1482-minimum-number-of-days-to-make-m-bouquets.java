class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long required = (long) m * k;
        if (required > bloomDay.length) {
            return -1;
        }
        int left = 1;
        int right = 0;
        for (int day : bloomDay) {
            right = Math.max(right, day);
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int flowers = 0;
        int bouquets = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}