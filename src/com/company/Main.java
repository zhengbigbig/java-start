package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
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

        //从一个文件读取内容，输出到另一个文件
        FileInputStream input = new FileInputStream("res/input.txt");
        FileOutputStream output = new FileOutputStream("res/output.txt");

        InputStreamReader reader = new InputStreamReader(input, "UTF-8");
        OutputStreamWriter writer = new OutputStreamWriter(output, "UTF-8");

        BufferedReader bufferedReader = new BufferedReader(reader);
        PrintWriter printWriter = new PrintWriter(writer);


        try {
            String content = "";
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }

            reader.close();
            input.close();

            System.out.println(content);
            printWriter.print(content);

            printWriter.close();
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
