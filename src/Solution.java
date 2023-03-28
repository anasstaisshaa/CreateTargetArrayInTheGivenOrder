import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        // nums = [0,1,2,3,4], index = [0,1,2,2,1]
        int[] nums =  {0,1,2,3,4};
        int[] index =  {0,1,2,2,1};
        System.out.println(createTargetArray(nums, index));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < nums.length; i++)
            list.add(index[i], nums[i]);
        for(int i = 0; i< list.size(); i++)
            target[i] = list.get(i);
        return target;
    }
}
