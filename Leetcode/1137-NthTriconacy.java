class Solution {
    public int tribonacci(int n) {
        if(n == 0) return 0;
        else if(n == 1 || n == 2) return 1;
        //else return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);

        int[] gs = new int[n+1];
        gs[1] = 1;
        gs[2] =1;
        for(int i = 3; i <= n; i++){
            gs[i] = gs[i-1] + gs[i-2] + gs[i-3];
        }
        return gs[n];
    }
}
