package homework.cThree.books;
import java.time.YearMonth;
/**
 * 表示书籍的类，包含各种属性。
 * 实现了Serializable接口，以支持对象序列化。
 */
public class Books implements java.io.Serializable {
    // 书籍的属性
    private String title;       // 书名
    private String author;      // 作者
    private String isbn;        // ISBN号
    private YearMonth publishDate; // 出版日期
    private double price;       // 价格

    /**
     * 构造函数，初始化书籍属性。
     * @param title 书名。
     * @param author 作者。
     * @param isbn ISBN号。
     * @param publishDate 出版日期，格式为YYYY-MM
     * @param price 价格。如果为负，则设为0。
     */
    public Books(String title, String author, String isbn, String publishDate, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishDate = YearMonth.parse(publishDate); // 格式: "YYYY-MM"
        this.price = price >= 0 ? price : 0;
    }

    // 每个属性的getter和setter方法
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author = author;}
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public YearMonth getPublishDate() {return publishDate;}
    public void setPublishDate(String publishDate) {this.publishDate = YearMonth.parse(publishDate);}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price >= 0 ? price : 0;}

    /**
     * 重写toString方法，以更好地表示书籍详细信息。
     * @return 书籍详细信息的字符串表示。
     */
    @Override
    public String toString() {
        return  "书名：" +title+
                "\n作者：" + author +
                "\nISBN号：" + isbn +
                "\n出版日期：" + publishDate+
                "\n价格：" + price + "元\n";
    }

    public static void main(String[] args) {
    }
}
