package com.verse.github.dao.domain;

/**
 * @Auther：Verse
 * @Date：19-12-28 下午10:48
 * @Description： 用户信息
 */
public class Customer {
    // 主键id
    private Integer id;

    // 用户名
    private String name;

    // 密码
    private String password;

    //年龄
    private String age;

    //月份：用于分表查询
    private String month;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
