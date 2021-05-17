package com.skyrimod.riverwood.nettest;

import org.junit.Test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @Classname NetTest
 * @Description
 * @author: suixin
 * @date: 2021/5/16
 */
public class NetTest {
    @Test
    public void netTest() throws IOException {
        InetAddress name = InetAddress.getByName("time-a.nist.gov");
        System.out.println(name);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        String s = localHost.toString().split("/")[1];
        System.out.println(s);

        InetAddress[] allByName = InetAddress.getAllByName("www.baidu.com");
        for (InetAddress inetAddress : allByName) {
            System.out.println(inetAddress);
        }

        InetAddress[] google = InetAddress.getAllByName("www.google.com");
        for (InetAddress inetAddress : google) {
            System.out.println(inetAddress);
        }

        ServerSocket serverSocket = new ServerSocket(8989);
        Socket accept = serverSocket.accept();
    }
}
