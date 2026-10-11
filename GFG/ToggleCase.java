class Solution {
    public String toggleCase(String s) {
        // code here
        if(s == null || s.isEmpty()) return s;
        
        char[] chars = s.toCharArray();
        
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
                if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                     chars[i] ^= 32;
        }
        return new String(chars);
    }
}
