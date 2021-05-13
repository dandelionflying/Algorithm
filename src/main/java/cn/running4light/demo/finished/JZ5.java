package cn.running4light.demo.finished;

import java.util.Stack;

/**
 * 	@tite 用两个栈实现队列
 *  @description 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 * eg:
 * in:[3,4,5,1,2]
 * out:1
 *  @author running4light
 */
public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }
    /**
     *  @Description    高效
     *  @Author running4light朱泽雄
     *  @CreateTime 16:01 2021/5/13
     *
     */
    public int pop(){
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }
    /**
     *  @Description    低效
     *  @Author running4light朱泽雄
     *  @CreateTime 16:01 2021/5/13
     *  @return
     */
    public int pop2() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int one = stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return one;
    }
}
