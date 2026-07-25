class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;

        
        int mx = 0;

        while (left < right){
            int curmin = Math.min(height[left], height[right])* (right-left);
            mx = Math.max(curmin, mx);

            if(height[left]< height[right]) left ++;
            else right --;
        }
        return mx;
    }
}
