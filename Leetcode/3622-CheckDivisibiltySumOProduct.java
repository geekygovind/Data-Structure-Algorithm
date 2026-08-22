class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul=1;
        int original = n;
        while(n > 0){
            int digit = n%10;
            sum = sum + digit;
            mul = mul*digit;
            n=n/10;
        }
        int val = sum+mul;
        if(original % val == 0) return true;
        else return false;
    }
}
