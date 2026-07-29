class Solution {
    ArrayList<Integer> bracketNumbers(String s) {
        // code here
        ArrayList<Integer> r = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                count++;
                st.add(count);
                r.add(count);
            }
            else if(ch ==')'){
                r.add(st.pop());
            }
        }
        return r;
    }
};
