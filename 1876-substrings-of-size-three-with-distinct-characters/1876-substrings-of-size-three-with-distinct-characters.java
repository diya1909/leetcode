class Solution {
    public int countGoodSubstrings(String s) {
        int[] freq = new int[26];
        int l = 0;
        int distinct = 0;
        int count = 0;
        for (int r = 0; r < s.length(); r++) {           
            int index = s.charAt(r) - 'a';
            if (freq[index] == 0) {
                distinct++;
            }
            freq[index]++;
            if (r - l + 1 > 3) {
                int leftIndex = s.charAt(l) - 'a';
                freq[leftIndex]--;
                if (freq[leftIndex] == 0) {
                    distinct--;
                }
                l++;
            }
            if (r - l + 1 == 3 && distinct == 3) {
                count++;
            }
        }
        return count;
    }
}