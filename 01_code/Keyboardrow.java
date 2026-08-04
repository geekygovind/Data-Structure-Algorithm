class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";

        for(String s : words){
            if(isrow(s, first) || isrow(s, second) || isrow(s, third)) ans.add(s);
        }
        return ans.toArray(new String[0]);
    }
    private boolean isrow(String ss, String row){
        for(char c : ss.toCharArray()){
            if(row.indexOf(Character.toLowerCase(c)) == -1) return false;
        }
        return true;
    }
}
