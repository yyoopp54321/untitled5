package demo;

import java.io.*;
import java.util.Date;

public class TestIo {
    public static void main(String[] args) throws IOException {
        File file=new File("C:/Users/云鹏鹏/Desktop/测试.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        Writer writer=new OutputStreamWriter(fileOutputStream);
        writer.write("哈哈哈哈"+new Date());
        writer.close();



//        File file=new File("C:/Users/云鹏鹏/Desktop/测试.txt");
//        FileInputStream fileInputStream = new FileInputStream(file);
////        FileOutputStream fileOutputStream=new FileOutputStream(file);
//        Reader reader=new InputStreamReader(fileInputStream);
//        char[] chars=new char[100];
//        int  a=reader.read(chars);
//        System.out.println(new String(chars,0,a));
    }
}
