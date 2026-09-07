class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() < t.length() || t.length() < s.length()) return true;

        int[] sindex = new int[200];
        int[] tindex = new int[200];

        for(int i = 0; i < s.length(); i++){
            if(sindex[s.charAt(i)] != tindex[t.charAt(i)]) return false;

            sindex[s.charAt(i)] = i+1;
            tindex[t.charAt(i)] = i+1;
        }
        return true;
    }
}
