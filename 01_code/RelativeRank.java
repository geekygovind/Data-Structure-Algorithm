class Solution {
    public String[] findRelativeRanks(int[] score) {
        String arr[] = new String[score.length];
        PriorityQueue<Integer> gs = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < score.length; i++){
            gs.add(score[i]);
        }

        HashMap<Integer, String> mp = new HashMap<>();
        int g = 1;
        while(gs.isEmpty() == false){
            if(g == 1) mp.put(gs.remove(), "Gold Medal");
            else if(g == 2) mp.put(gs.remove(), "Silver Medal");
            else if(g == 3) mp.put(gs.remove(), "Bronze Medal");
            else mp.put(gs.remove(), Integer.toString(g));

            g++;
        }

        for(int i = 0; i < score.length; i++) arr[i] = mp.get(score[i]);

        return arr;

    }
}
