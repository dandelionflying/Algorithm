package cn.running4light.demo.entity;

/**
 * @author running4light
 * @description
 * @createTime 2021/5/13 16:22
 */
public class Catalogue<T> {
    private String description;
    private T data;

    public Catalogue(){

    }
    public Catalogue(String description, T data) {
        this.description = description;
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public Catalogue setDescription(String description) {
        this.description = description;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Catalogue setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "description='" + description + '\'' +
                ", data=" + data +
                '}';
    }
}
