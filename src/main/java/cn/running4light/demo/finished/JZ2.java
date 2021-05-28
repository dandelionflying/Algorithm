package cn.running4light.demo.finished;

import java.util.*;

/**
 *  @title  牛客--替换空格
 *  @Description
 *  @Author running4light朱泽雄
 *  @CreateTime 16:08 2021/5/13
 */
public class JZ2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @return string字符串
     */
    public String replaceSpace (String s) {
        // write code here
//        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();
        char[] result = new char[s.length() * 3];
        char[] chars = s.toCharArray();
        int index = 0;
        for (char c :
                chars) {
            if(c == ' '){
//                sb.append("%20");
                result [index] = '%';
                result[index+1] = '2';
                result[index+2] = '0';
                index+=3;
            }else{
                result [index] = c;
                index++;
            }
        }
        return new String(result, 0 , index);
//        s.replace(" ", "%20");
//        return sb.toString();
    }
}