class Solution {

    void solve(int[] nums, int i, List<Integer> temp, List<List<Integer>> ans){
        if(i == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        int val = nums[i];
        temp.add(val);
        solve(nums, i+1, temp, ans);
        temp.remove(temp.size()-1);
        solve(nums, i+1, temp, ans);

    }


    public List<List<Integer>> subsets(int[] nums) {
        int i = 0;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> gs = new ArrayList<>();
        solve(nums, i, gs, ans);
        return ans;
    }
}
