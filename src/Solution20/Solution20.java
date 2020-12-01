package Solution20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
* 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。

示例 1:

输入: "()"
输出: true
示例 2:

输入: "()[]{}"
输出: true
示例 3:

输入: "(]"
输出: false
示例 4:

输入: "([)]"
输出: false
示例 5:

输入: "{[]}"
输出: true

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/valid-parentheses
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
*
* 思路：
*       数据结构选用栈，读到左括号时入栈，读到右括号时判断是否匹配，
*       匹配则左括号出栈，最后判断栈为空说明匹配，不为空不匹配。
* */
public class Solution20 {
    public static boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        //将左右括号以键值对的方式存入map中
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            //如果是左括号就进栈
            if (map.containsValue(c)){
                stack.push(c);
            }
            //如果是右括号，当栈为空时返回false,如果栈中有此右括号所对应的左括号则弹出此左括号
            else if (map.containsKey(c)){
                if (stack.isEmpty()){
                    return false;
                }
                if (stack.peek()==map.get(c)){
                    stack.pop();
                }else {
                    return false; 
                }
            }
        }
        return stack.isEmpty()?true:false;
    }
    public static void main(String[] args) {
        String string ="([a+b]-(rr{}))";
        boolean res =  isValid(string);
        System.out.println(res);
    }
}
