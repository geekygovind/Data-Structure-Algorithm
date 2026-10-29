class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Set<Integer> st = new HashSet<>();
        for(int val : candyType) st.add(val);

        int m = st.size();

        int ans = Math.min(n/2, m);

        return ans;
    }
}
