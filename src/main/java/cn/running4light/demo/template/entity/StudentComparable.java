package cn.running4light.demo.template.entity;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/17 15:12
 */
public class StudentComparable implements Comparable<StudentComparable>{
    private String name;
    private int score;

    public StudentComparable(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(StudentComparable o) {
        return this.score - o.score;
    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
