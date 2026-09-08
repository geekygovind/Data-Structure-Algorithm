class Solution {
    
    public int countCommas(int n) {
        if(n<1000) return 0;
        // int c = 0;
        // int num = 999;
        // while(num < n){
        //     num++;
        //     c++;
        // }
        // return c;

        return n - 999;
    }
}
