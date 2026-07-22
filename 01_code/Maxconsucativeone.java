public class Maxconsucativeone{
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int n = nums.length;
        int mx = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1) c++;
            else{
                mx = Math.max(c, mx);
                c=0;
            }
        }
        return mx>c ? mx : c;
    }
    public static void main(String[] args) {
        Maxconsucativeone mco = new Maxconsucativeone();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(mco.findMaxConsecutiveOnes(nums));
    }
}
