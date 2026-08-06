class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char c : address.toCharArray()){
            if(c == '.') sb.append("[.]");
            else sb.append(c);
           // sb.append((c== '.') ? "[.]" : c);
        }
        return sb.toString();
    }
}



