class Solution {
    public int minStartValue(int[] nums) {
        int ans = 0;
        int maxi= 0;
        for(int a : nums){
            ans += a;
            maxi = Math.min(ans, maxi); // min
        }
        int ansi=  Math.abs(maxi-0); // positive
        int ansii = ansi+1; // +1

        return ansii;
    }
}
