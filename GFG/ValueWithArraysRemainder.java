class Solution {
    public int sameMod(int[] arr) {
        // code here
        int g=0;
        for(int i =0; i < arr.length; i++){
            g= gcd(g, Math.abs(arr[i]-arr[0]));
        }
        if(g == 0) return -1;
        int c= 0;
        for (int i = 1; i <= g / i; i++){
            if (g % i == 0){
                c++;
                if(i != g/i) c++;
            }
        }

        return c;
    }
    private int gcd(int a,int b){
        if(b ==0) return a;
        return gcd(b, a%b);
    }
}
