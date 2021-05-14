package cn.running4light.demo.unfinished;

/**
 * @author running4light
 * @description 整数转罗马
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/integer-to-roman
 * @createTIme 2021/5/14 15:17
 */
public class LeetCode12 {
    /*
     * @description 普通
     * @Author running4light朱泽雄
     * @CreateTime 2021/5/14 15:35
     * @param	num
     * @return
     */
    public String intToRoman(int num) {
        String result = "";
        if(num >=1000){
            for (int i = 0; i < num/1000; i++) {
                result+="M";
            }
            num = num%1000;
        }
        if(num >=500){
            // 900 情况
            if(num>= 900){
                for (int i = 0; i < num/900; i++) {
                    result+="CM";
                }
                num = num%900;
            }
            for (int i = 0; i < num/500; i++) {
                result+="D";
            }
            num = num%500;
        }
        if(num >=100){
            // 400 情况
            if(num>= 400){
                for (int i = 0; i < num/400; i++) {
                    result+="CD";
                }
                num = num%400;
            }
            for (int i = 0; i < num/100; i++) {
                result+="C";
            }
            num = num%100;
        }
        if(num >=50){
            // 90 情况
            if(num>= 90){
                for (int i = 0; i < num/90; i++) {
                    result+="XC";
                }
                num = num%90;
            }
            for (int i = 0; i < num/50; i++) {
                result+="L";
            }
            num = num%50;
        }
        if(num >=10){
            // 40 情况
            if(num>= 40){
                for (int i = 0; i < num/40; i++) {
                    result+="XL";
                }
                num = num%40;
            }
            for (int i = 0; i < num/10; i++) {
                result+="X";
            }
            num = num%10;
        }
        if(num >=5){
            // 9 情况
            if(num>= 9){
                for (int i = 0; i < num/9; i++) {
                    result+="IX";
                }
                num = num%9;
            }
            for (int i = 0; i < num/5; i++) {
                result+="V";
            }
            num = num%5;
        }
        if(num >=1){
            // 4 情况
            if(num>= 4){
                for (int i = 0; i < num/4; i++) {
                    result+="IV";
                }
                num = num%4;
            }
            for (int i = 0; i < num; i++) {
                result+="I";
            }
        }
        return result;
    }

    public void intToRoman2(int num){

    }
}
