class Solution {
    public int countSegments(String s) {
        if(s.isEmpty()) return 0;
        int c= 0;
        boolean  ss = false;

        for(char ch  : s.toCharArray()){
            if(ch != ' '){
                if(ss == false){
                    c++;
                    ss = true;
                }
            }
            else ss  = false;
        }

        return c;
    }
}
