package cn.running4light.demo.template.entity;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/17 10:16
 */
public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * @Description     参数必须符合父类Object的参数类型（Object）,才能进行覆盖，不然就是重载
     * @Author running4light朱泽雄
     * @CreateTime 10:23 2021/5/17
     *
     */
    @Override
    public boolean equals(Object student){
        if (this == student)
            return true;
        if(student == null){
            return false;
        }
        if(this.getClass() != student.getClass())
            return false;
        Student s2 = (Student)student;
        return this.name.equals(s2.getName());
    }
    @Override
    public String toString() {
        return "StudentComparable{" +
                "name='" + name + '\'' +
                '}';
    }
}
