class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        List<String> ans=new ArrayList<>();
         for (int i = 0; i < words.length; i++) {
            if (isIsomorphic(words[i], pattern)) {
                ans.add(words[i]);
            }
        }

        return ans;
    }
     public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] mapST = new int[256];
        int[] mapTS = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (mapST[c1] == 0 && mapTS[c2] == 0) {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            }
            else if (mapST[c1] != c2 || mapTS[c2] != c1) {
                return false;
            }
        }
        return true;
    }
}