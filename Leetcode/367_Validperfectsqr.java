class Solution {
    public boolean isPerfectSquare(int num) {
        int s =0;
        int e = num;
        if(num < 0) return false;
        while(s <= e){
            int mid = s + (e-s)/2;
            long sq = (long)mid*mid;
            if(sq == num) return true;
            else if(sq < num) s = mid+1;
            else e = mid-1;
        }
        return false;
    }
}
