package demo.chapter03;
import java.io.File;
import java.io.IOException;
//2023.12.7
public class FileTest {
    public static void main(String[] args)throws IOException {
        //创建文件对象
        /*
         "E:\\mydDoc\\test.txt"  这种写法需要创建好mydDoc  因为java不会创建目录
         */
        File file = new File("E:\\draft\\test9527.txt");
        //调用文件创建的方法create()
        create(file);
        delete(file);
    }

    //实现文件创建的方法 #创建文件
    static void create(File file)throws IOException{
        if (!file.exists()){
            file.createNewFile();
        }
    }
    //实现删除文件的方法 #删除文件
    static void delete(File file)throws IOException{
        if (file.exists()){
            file.delete();
        }
    }

}
