class Solution {
    public int longestPalindrome(String s) {
        int[] dict = new int[Character.MAX_VALUE + 1];
        int l = 0;
        boolean odd = false;
        for (char c : s.toCharArray()){
            dict[c]++;
        }
        for (int count : dict){
            l += (count / 2) * 2;
            if (count % 2 == 1) {
                odd = true;
            }
        }
        return odd ? l + 1 : l;
    }
}
