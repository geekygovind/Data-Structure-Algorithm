class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> fm = new HashMap<>();
        for(int num : nums){
            fm.put(num, fm.getOrDefault(num, 0)+1);
        }
        int ml = 0;

        for(int num : fm.keySet()){
            if(fm.containsKey(num+1)){
                int cl = fm.get(num) + fm.get(num+1);
                ml = Math.max(ml, cl);
            }
        }
        return ml;
    }
}
