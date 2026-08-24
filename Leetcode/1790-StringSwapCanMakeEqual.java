class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int n = s1.length();
        int f = -1;
        int s = -1;
        int c = 0;
        for(int i = 0; i<n; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                c++;
                if(c==1) f=i;
                else if(c==2) s=i;
            }
        }
        if(c == 0) return true;
        if(c != 2) return false;
        if(s1.charAt(f) == s2.charAt(s) && s1.charAt(s) == s2.charAt(f)) return true;
        return false;
    }
}
