class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i=0; i < s.length(); i++){
            char curr = s.charAt(i);
            int ss = gs(curr);

            if(i+1 < s.length() && ss < gs(s.charAt(i+1))){
                ans = ans-ss;
            }
            else ans = ans+ss;
        }
        return ans;
    }
    public int gs(char ch){
        if(ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;

        return 0;
    }
}
