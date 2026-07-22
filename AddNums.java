import java.util.ArrayList;
import java.util.List;

public class AddNums {
    public List<Integer> Check(int[] nums){
        List<Integer> ans = new ArrayList<>();
        for(int num : nums){
            int index = Math.abs(num) -1;
            nums[index] = -Math.abs(nums[index]);
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        AddNums addNums = new AddNums();
        int[] nums = {1, 2, 4, 5};
        System.out.println(addNums.Check(nums));
    }
}
