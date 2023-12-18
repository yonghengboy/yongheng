package homework.chapter03.books;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Books类的测试类。
 * 演示了Books对象的序列化和反序列化。
 */
public class BooksTest {
    // 用于测试的静态书籍对象
    static Books book1;
    static Books book2;
    static Books book3;

    /**
     * 执行测试用例的主方法。
     * @param args 命令行参数（未使用）。
     */
    public static void main(String[] args) {
        // 1.创建书籍对象
        book1 = new Books("Java基础案例教程", "黑马程序员出版社：人民邮电出版社", "978-7-115-54747-7", "2022-11", 59.8);
        book2 = new Books("高等数学", "王荣琴出版社：高等教育出版社", "978-7-116-54123-2", "2021-05", 29.5);
        book3 = new Books("大学生创新创业", "张丽华出版社:高等教育出版社", "978-7-110-54439-1", "2021-10", 30.5);

        // 2.将书籍对象序列化到文件
        objecToFile();
        // 3.从文件中反序列化书籍对象并打印
        fileToobject();
    }

    /**
     * 将书籍对象序列化到文件的方法。
     */
    static void objecToFile() {
        //1.创建对象输出流
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/homework/chapter03/books/books.txt"))) {
            List<Books> list = new ArrayList<>();  //2.创建集合对象
            //3.添加数据对象
            list.add(book1);
            list.add(book2);
            list.add(book3);
            //4.对象序列化，写入输入流
            oos.writeObject(list);
        } catch (IOException e) {//捕获
            e.printStackTrace();//处理
        }
    }
    /**
     * 从文件中反序列化书籍对象并打印的方法。
     */
    static void fileToobject() {
            // 1.创建对象输入流，用于读取之前序列化的对象
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/homework/chapter03/books/books.txt"))) {
            List<Books> booksList = (List<Books>) ois.readObject();//2.读取集合对象数据（反序列化）
            for (Books book : booksList) {  // 遍历书籍列表并打印每本书的详细信息
                System.out.println(book);  // 自动调用 book 对象的 toString 方法并打印输出
            }
        } catch (IOException | ClassNotFoundException e) {//捕获两种异常
            e.printStackTrace();//处理
        }
    }
}
