class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        int ss = 0;
        int e = s.length()-1;
        String vowel = "AEIOUaeiou";

        while(ss<e){
            while(ss < e && vowel.indexOf(word[ss]) == -1) ss++;
            while(ss < e && vowel.indexOf(word[e]) == -1) e--;


            char temp = word[ss];
            word[ss] = word[e];
            word[e] = temp;


            ss++;
            e--;
        }
        String ans = new String(word);
        return ans;
    }
}
