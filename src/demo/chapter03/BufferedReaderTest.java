/*
package demo.cThree;

import java.io.*;
import java.nio.Buffer;

//23.12.7
public class BufferedReaderTest {
    public static void main(String[] args) {
        BufferedReader br =null;//声明缓冲字符输入流对象
        BufferedWriter bw =null;//声明缓冲字符输入流对象
        try {
        */
/*    br =new BufferedInputStream( new FileInputStream("E:\\source999\\File1.txt"));//Buffered缓冲
            bw =new BufferedOutputStream(new FileOutputStream("E:\\test999\\File2.txt"));*//*

            int len;//读写的字节变量
            //System.out.println("复制读取的字节数："+br.available());
            System.out.println("复制的内容：");
            //循环实现读写操作
            while ((len=//br.read())!=-1){
                //写入目标文件
                bw.write(len);
                char c =(char)len;//把字节强制替换为字符
                System.out.print(c+" ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (br != null)
                    br.close();//关闭输入流
                if (bw != null)
                    bw.close();//关闭输出流
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
*/
