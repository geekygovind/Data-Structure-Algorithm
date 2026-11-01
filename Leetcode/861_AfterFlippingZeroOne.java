class Solution {
    public int matrixScore(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i< m; i++){
            if(arr[i][0] == 0){
                for(int j = 0; j < n; j++){
                    arr[i][j] ^= 1;
                }
            }
        }
        int ts = m*(1 << (n-1));

        for(int i =1; i < n; i++){
            int onec = 0;
            for(int j = 0; j < m; j++){
                onec += arr[j][i];
            }
            onec = Math.max(onec, m-onec);
            ts += onec * (1 << (n-1-i));
        }
        return ts;
    }
}
