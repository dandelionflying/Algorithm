package cn.running4light.demo.unfinished;

import java.util.*;

/**
 * @author running4light
 * @description 前K个高频单词
 * 给一非空的单词列表，返回前 k 个出现次数最多的单词。
 * 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
 * https://leetcode-cn.com/problems/top-k-frequent-words/
 * @createTime 2021/5/20 16:09
 */
public class LeetCode692 {
    // "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for (String s :
                words) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        // 优先队列
//        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((entry1, entry2) -> entry1.getValue().equals(entry2.getValue()) ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue());
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry1.getValue().equals(entry2.getValue()) ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue();
            }
        });
        for (Map.Entry entry :
                map.entrySet()) {
            pq.offer(entry);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> ret = new ArrayList<String>();
        while (!pq.isEmpty()) {
            ret.add(pq.poll().getKey());
        }
        Collections.reverse(ret);
        return ret;
        
//        return new ArrayList(map.values());
    }
}
