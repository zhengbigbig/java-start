package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        // 标准输出流
        PrintStream val = System.out;
        // 标准输入流

        char a = 'a'; // 1字节 编码表示1字符 \71 = a , \72 = b
        InputStream val2 = System.in;
        InputStreamReader stdRender = new InputStreamReader(System.in); //字节流转字符流
        char[] buffer = new char[20];
        int length = 0;
        try {
            length = stdRender.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(length);

    }
}
