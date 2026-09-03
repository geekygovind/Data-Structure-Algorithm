class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        for(int i = 0; i < chars.length;){
            char currword = chars[i];
            int c = 0;

            while(i < chars.length && chars[i] == currword){
                c++;
                i++;
            }
            chars[ans++] = currword;

            if(c > 1){
                for(char cs : String.valueOf(c).toCharArray()) chars[ans++] = cs;
            }
        }
        return ans;
    }
}
