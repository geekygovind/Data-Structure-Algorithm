class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        gs(nums, 0, ans);
        return ans;
    }
    private void gs(int[] nums,int i, List<List<Integer>> ans){
        if(i == nums.length){
            List<Integer> gc = new ArrayList<>();
            for(int num : nums) gc.add(num);
            ans.add(gc);
            return;
        }
        for(int j = i; j < nums.length; j++){
            swap(nums, i, j);
            gs(nums, i+1, ans);
            swap(nums, i, j);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
