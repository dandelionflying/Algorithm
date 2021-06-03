package cn.running4light.demo.unfinished;

import java.util.TreeSet;

/**
 * @author running4light
 * @description 唯一摩尔斯密码词
 * @createTime 2021/6/3 15:14
 */
public class LeetCode804 {
    private String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int run(String[] words){
        return uniqueMorseRepresentations(words);
    }
    public int uniqueMorseRepresentations(String[] words) {
        TreeSet set = new TreeSet();
        for (String w :
                words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.length(); i++) {
                sb.append(codes[w.charAt(i) - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}

