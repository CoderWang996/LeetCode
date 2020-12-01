package Solution1;

import java.util.HashMap;
import java.util.Map;
//第二种解决方案
public class Solution1_2 {
    //hash算法
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int [] nums={2,3,2,11,33,44};
        int[] result = twoSum(nums, 4);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
