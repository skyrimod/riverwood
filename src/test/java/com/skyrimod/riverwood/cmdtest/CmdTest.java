package com.skyrimod.riverwood.cmdtest;

import lombok.SneakyThrows;
import org.junit.Test;

import java.io.*;
import java.util.Map;

public class CmdTest {
    @SneakyThrows
    @Test
    public void RuntimeTest(){
        //ProcessBuilder builder = new ProcessBuilder();
        Process ls = Runtime.getRuntime().exec("ls");
        BufferedReader br = new BufferedReader(new InputStreamReader(ls.getInputStream()));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }


    }
    @Test
    public void envTest(){
        Map<String, String> env = System.getenv();
        for (Map.Entry<String, String> stringStringEntry : env.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }
}
