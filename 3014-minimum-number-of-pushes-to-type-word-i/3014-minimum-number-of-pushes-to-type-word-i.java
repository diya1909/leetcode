class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int b = n / 8;
        return (b * (b + 1) * 4)
                + (n % 8) * (b+ 1);
    }
}