class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                String sb = s.substring(0,i);
                StringBuilder sbb = new StringBuilder();
                for(int j = 0; j < n/i; j++) sbb.append(sb);

                if(sbb.toString().equals(s)) return true;
            }
        }
        return false;
    }
}
