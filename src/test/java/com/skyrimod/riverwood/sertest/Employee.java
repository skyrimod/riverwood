package com.skyrimod.riverwood.sertest;


import java.io.Serializable;

/**
 * @Classname Employee
 * @Description
 * @author: suixin
 * @date: 2021/5/16
 */
public class Employee implements Serializable {
    public static final long serialVersionUID = 1L;
    private String username;
    private Integer salary;
    private Boolean sex;

    public Employee(String username, Integer salary, Boolean sex) {
        this.username = username;
        this.salary = salary;
        this.sex = sex;
    }

    public Employee() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "username='" + username + '\'' +
                ", salary=" + salary +
                ", sex=" + sex +
                '}';
    }
}
