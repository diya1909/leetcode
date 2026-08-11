class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > high) {
                high = piles[i];
            }
        }
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isValid(piles, mid, h)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isValid(int[] piles, int mid, int h) {
        long hours = 0;
        for (int i = 0; i < piles.length; i++) {
            hours += (piles[i] + mid - 1) / mid;
        }
        return hours <= h;
    }
}