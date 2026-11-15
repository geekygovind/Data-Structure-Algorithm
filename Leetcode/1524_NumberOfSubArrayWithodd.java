class Solution {
    public int numOfSubarrays(int[] arr) {
        final int m = 1000000007;
        int even = 1, odd = 0;
        long ans = 0;
        int sum = 0;

        for(int x : arr){
            sum = (sum+x) % 2;
            if(sum==1){
                ans = (ans+even) % m;
                odd++;
            }
            else{
                ans = (ans+odd) % m;
                even++;
            }
        }
        return (int)ans;
    }
}
