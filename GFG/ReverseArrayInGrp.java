class Solution {
    public void reverseInGroups(int[] arr, int k) {
        // code here
        int n = arr.length;
        for(int i = 0; i<n; i+=k){
            int l = i;
            int r = Math.min(i+k-1, n-1);
            
            while(l < r){
                swap(arr, l, r);
                l++;
                r--;
            }
        }
        
    }
    private void swap(int[] arr, int i , int k){
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
