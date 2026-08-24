class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        // for(int i = 0; i < arr.length; i++){
        //     if(arr[i] != target && i == arr.length) return 0;
        // }
        int getlow = getlowerbound(arr, target);
        int gethigh = gethigherbound(arr, target);
        
        int ans = gethigh-getlow;
        return ans;
        
    }
            private static int getlowerbound(int arr[], int target){
            int n = arr.length;
            int s = 0;
            int e = n-1;
            int ans = n;
            while(s <= e){
                int mid = s + (e-s)/2;
                if(arr[mid] >= target){
                    ans = mid;
                    e=mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            return ans;
        }
        private static int gethigherbound(int arr[], int target){
            int n = arr.length;
            int s = 0;
            int e = n-1;
            int ans = n;
            while(s<=e){
                int mid = s + (e-s)/2;
                if(arr[mid] <= target){
                    s = mid+1;
                }
                else{
                    ans = mid;
                    e = mid-1;
                }
            }
            return ans;
        }
}
