import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        int l = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int cnum = num;
                int length = 1;
            while(set.contains(cnum+1)){
                length++;
                cnum++;
            }
            l = Math.max(l,length);
        }
        }
        return l;
    }
}
