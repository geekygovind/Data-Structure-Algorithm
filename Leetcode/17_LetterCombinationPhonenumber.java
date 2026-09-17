class Solution {
    static void solve(String digits, int idx, String[] mapping, List<String> ans, StringBuilder sb){
        if(idx >= digits.length()){
            ans.add(sb.toString());
            return;
        }
        int value = digits.charAt(idx) - '0';
        String mappString = mapping[value];

        for(int i = 0; i < mappString.length(); i++){
            sb.append(mappString.charAt(i));
            solve(digits, idx+1, mapping, ans, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs","tuv", "wxyz"};
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        solve(digits, idx, mapping, ans, sb);
        return ans;
    }
}
