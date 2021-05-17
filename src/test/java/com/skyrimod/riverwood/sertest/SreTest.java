package com.skyrimod.riverwood.sertest;

import lombok.SneakyThrows;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Classname SreTest
 * @Description
 * @author: suixin
 * @date: 2021/5/16
 */
public class SreTest {
    private final Boolean MAN = true;
    private final Boolean WOMAN = false;

    @SneakyThrows
    @Test
    public void serliTest(){
        File file = new File("object.txt");
        Path path = file.toPath();
        System.out.println(path.toAbsolutePath().toString());

        deleteFile(file);
        createFile(file);

        Employee employee = new Employee("小李", 5000, MAN);
        Manager wang = new Manager("王总", 9000, employee);
        Manager liu = new Manager("刘总", 9000, employee);

        List<Employee> employeeList = Lists.newArrayList(employee,wang,liu);

        writeOjb(employeeList,file);

        List<Employee> list =(List<Employee>) readObj(file);

        for (Employee employee1 : list) {
            System.out.println(employee1);
        }

    }

    public void createFile(File file){
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteFile(File file){
        if (file.exists()) {
            file.delete();
        }
    }

    public void writeOjb(Object obj,File file){
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object readObj(File file){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            Object o = ois.readObject();
            return o;
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void pathTest(){
        Path path = Paths.get("path.txt");
        System.out.println(path.toAbsolutePath().toString());

    }
}
