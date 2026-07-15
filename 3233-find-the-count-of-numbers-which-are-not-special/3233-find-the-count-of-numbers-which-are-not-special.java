class Solution {
    public int nonSpecialCount(int l, int r) {
        int limit = (int) Math.sqrt(r);

        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        if (limit >= 0) prime[0] = false;
        if (limit >= 1) prime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    prime[j] = false;
                }
            }
        }

        int special = 0;

        for (int i = 2; i <= limit; i++) {
            if (prime[i]) {
                long sq = 1L * i * i;
                if (sq >= l && sq <= r) {
                    special++;
                }
            }
        }

        return (r - l + 1) - special;
    }
}