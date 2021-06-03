package cn.running4light.demo.finished;

import java.util.HashSet;
import java.util.Set;
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
    /**
     * @Description 基于平衡二叉树
     * @Author running4light朱泽雄
     * @CreateTime 15:26 2021/6/3
     * @Return
     */
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
    /**
     * @Description 基于哈希集合
     * @Author running4light朱泽雄
     * @CreateTime 15:26 2021/6/3
     * @Return
     */
    public int uniqueMorseRepresentations2(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> set = new HashSet();
        for (String word: words) {
            StringBuilder sb = new StringBuilder();
            for (char c: word.toCharArray())
                sb.append(MORSE[c - 'a']);
            set.add(sb.toString());
        }
        return set.size();
    }
}

