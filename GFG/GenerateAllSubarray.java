class Solution {
    public List<List<Integer>> getSubArrays(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = i; j < arr.length; j++) {
                temp.add(arr[j]);
                result.add(new ArrayList<>(temp));
            }
        }
        return result;
    }
}
