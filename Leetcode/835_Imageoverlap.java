class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length;

        List<int[]> v1 = new ArrayList<>();
        List<int[]> v2 = new ArrayList<>();

        for(int i = 0; i < img1.length; i++){
            for(int j = 0; j < img1.length; j++){
                if(img1[i][j] == 1) v1.add(new int[]{i,j});
                if(img2[i][j] == 1) v2.add(new int[]{i,j});
            }
        }
        int maxi = 0;
        int[][] cnt = new int[n*2][n*2];

        for(int[] a : v1){
            for(int[] b : v2){
                int a1 = b[0]-a[0]+n;
                int a2 = b[1]-a[1]+n;

                cnt[a1][a2]++;
               // k++;

                maxi = Math.max(maxi, cnt[a1][a2]);
            }
        }
        return maxi;
    }
}
