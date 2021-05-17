package com.skyrimod.riverwood.sertest;

import java.io.Serializable;

/**
 * @Classname Manager
 * @Description
 * @author: suixin
 * @date: 2021/5/16
 */
public class Manager extends Employee implements Serializable {
    private String username;
    private Integer salary;
    private Employee employee;

    public Manager() {
    }

    public Manager(String username, Integer salary, Employee employee) {
        this.username = username;
        this.salary = salary;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "username='" + username + '\'' +
                ", salary=" + salary +
                ", employee=" + employee +
                '}';
    }
}
