package cn.running4light.demo.finished;

/**
 * @author running4light
 * @description 	斐波那契数列
 * 递归可做，但消耗资源更多
 * 差异：
 *  递归求第39项：    63245986	耗时：224
 *  非递归求第39项    63245986	耗时：0
 * @createTIme 2021/5/14 12:43
 */
public class JZ7 {
    
    
    /*
     * @description 输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）n≤39
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 13:14
     * @param	n
     * @return 
     */
    public int Fibonacci(int n) {
        // n项对应数组索引，及实际为第n+1项数据
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /*
     * @description     非递归形式
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 13:26
     * @param	null
     * @return
     */
    public int Fibonacci2(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int post = 1;
        int pre = 0;
        int result = 0;
        for (int i = 0; i < n - 1 ; i++) {
            result = pre+post;
            pre = post;
            post = result;
        }
        return result;
    }
}
