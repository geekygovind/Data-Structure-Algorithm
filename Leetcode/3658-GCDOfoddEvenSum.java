class Solution {
    public int gcdOfOddEvenSums(int n) {
        int ans;
        int sumodd = 0;
        int sumeven = 0;
        for(int i = 1; i <= 2*n; i++){
            if((i & 1) == 1) sumodd += i;
            else sumeven += i;
        }
        ans = gcd(sumeven, sumodd);
        return ans;
    }
    private int gcd(int a, int b){
    if (b == 0){
        return a;
    }
    return gcd(b, a % b);
    }
}
