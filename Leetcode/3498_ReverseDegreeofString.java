class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int rev = ('z' - ch) + 1;
            int post = i+1;
            sum = sum + (rev*post);
        }
        return sum;
    }
}
