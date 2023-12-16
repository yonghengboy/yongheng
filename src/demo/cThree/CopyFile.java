package demo.cThree;
//2023.12.7
import javax.swing.*;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        //声明输入/输出流对象
        BufferedInputStream fis =null;
        BufferedOutputStream fos =null;
        try {
            fis =new BufferedInputStream( new FileInputStream("E:\\source999\\File1.txt"));//Buffered缓冲
            fos =new BufferedOutputStream(new FileOutputStream("E:\\test999\\File2.txt"));
            int len;//读写的字节变量
            System.out.println("复制读取的字节数："+fis.available());
            System.out.println("复制的内容：");
            //循环实现读写操作
            while ((len=fis.read())!=-1){
            //写入目标文件
                fos.write(len);
                char c =(char)len;//把字节强制替换为字符
                System.out.print(c+" ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fis != null)
                    fis.close();//关闭输入流
                if (fos != null)
                    fos.close();//关闭输出流
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
