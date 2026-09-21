class Solution {
    void printPat(int n) {
        for (int i = 0; i < 2 * n - 1; i++){
            int comp;
            if (i < n) {
                comp = 2 * (n - i) - 1;
            } else {
                comp = 2 * (i - n + 1) + 1;
            }
            for (int j = 0; j < comp; j++){
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * n - comp; k++){

                if (k == 0 || k == 2 * n - comp - 1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
