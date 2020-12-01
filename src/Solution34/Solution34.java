package Solution34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。

如果数组中不存在目标值 target，返回 [-1, -1]。

进阶：

你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 

示例 1：

输入：nums = [5,7,7,8,8,10], target = 8
输出：[3,4]
示例 2：

输入：nums = [5,7,7,8,8,10], target = 6
输出：[-1,-1]
示例 3：

输入：nums = [], target = 0
输出：[-1,-1]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class Solution34 {
    public static int[] searchRange(int[] nums, int target) {
        //如果数组为空，则返回[-1,-1]
        if (nums == null || nums.length <= 0) {
            return new int[]{-1, -1};
        }
        //对数组进行排序
        Arrays.sort(nums);
        //遍历数组,如果数组中有目标值则将其索引存入集合
        List list = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
            }
        }
        //如果集合为空，则返回[-1,-1]
        if (list == null || list.size() <= 0) {
            return new int[]{-1, -1};
        }
        //如果集合长度为1则说明数组中只有一个目标值，起始位置一样
        if (list.size() == 1) {
            int index = (int) list.get(0);
            return new int[]{index, index};
        }
        //如果集合长度大于等于2,则返回集合的第一个元素和最后一个元素
        if (list.size() >= 2) {
            return new int[]{(int)list.get(0),(int)list.get(list.size()-1)};
        }
        return new int[]{-1, -1};
    }


    public static void main(String[] args) {
        int[] res = searchRange(new int[]{5,7,7,8,8,10}, 6);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
