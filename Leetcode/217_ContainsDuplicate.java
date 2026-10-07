class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> gs = new HashSet<>();
        for (int num : nums){
            if (gs.add(num) == false) return true;
        }
        return false;
    }
}
