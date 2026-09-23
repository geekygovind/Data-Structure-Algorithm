class Solution {
    private static int tower(int n, int from, int to, int aux){
        if(n == 0) return 0;
        
        return 1 + tower(n-1, from, aux, to) + tower(n-1, aux, to, from);
        
    }
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        return tower(n, from, to, aux);
    }
}
