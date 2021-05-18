package cn.running4light.demo.finished;

import java.util.Stack;

/**
 * @author running4light
 * @description 《有效的括号 》给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 *      左括号必须用相同类型的右括号闭合。
 *      左括号必须以正确的顺序闭合。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * @createTime 2021/5/18 16:20
 */
public class LeetCode20 {

    public boolean isValid(String s) {
        if (null == s || s.length() == 0) {
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer(s);
        Stack<String> stack = new Stack<>();
        String substring = "";
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            substring = stringBuffer.substring(i, i + 1);
            if (substring.equals("{") || substring.equals("[") || substring.equals("(")) {
                stack.push(substring);
            } else if (stack.isEmpty()) {
                return false;
            } else if (substring.equals("}") && "{".equals(stack.peek())) {
                stack.pop();
            } else if (substring.equals("]") && "[".equals(stack.peek())) {
                stack.pop();
            } else if (substring.equals(")") && "(".equals(stack.peek())) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    /**
     * @Description 巧妙版本
     * @Author running4light朱泽雄
     * @CreateTime 17:16 2021/5/18
     */
    public boolean isValid2(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        Stack<String> stack = new Stack<>();
        String substring = "";
        boolean result = false;
        for (int i = 0; i < s.length(); i++) {
            substring = stringBuffer.substring(i, i + 1);
            if (substring.equals("{")) {
                stack.push("}");
            } else if (substring.equals("[")) {
                stack.push("]");
            } else if (substring.equals("(")) {
                stack.push(")");
            } else if (stack.isEmpty() || !substring.equals(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
