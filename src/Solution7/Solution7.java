package Solution7;


import java.util.Stack;

/*
* 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:

输入: 123
输出: 321
 示例 2:

输入: -123
输出: -321
示例 3:

输入: 120
输出: 21

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */
public class Solution7 {
    public static int reverse(int x) {
        if (x<0){
            return -reverse2(x);
        } else if (x>0){
            return reverse2(x);
        }
        return 0;
    }
    public static int reverse2(int x){
        //无论x是正数还是负数都取其绝对值
        int abs = Math.abs(x);
        //将整数转换成字符串
        String s = String.valueOf(abs);
        StringBuffer sb = new StringBuffer();
        //遍历字符串,将每一位数字存入sb
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
        }
        sb = sb.reverse();
        try {
            Integer integer = Integer.valueOf(sb.toString());
            return integer;
        }catch (Exception e){
            return 0;
        }
    }

    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }
}
