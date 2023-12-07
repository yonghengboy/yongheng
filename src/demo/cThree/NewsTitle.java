package demo.cThree;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class NewsTitle {
        //封装新闻标题实体类
    int number;//序号
   private String title;//标题
   private String author;//创建者
   private String time;//创建时间


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    //定义构造方法
    public NewsTitle(int number,String title,String author){
        this.number =number;
        this.title =title;
        this.author=author;
        //this.time=time;



    }
    public static void main(String[] args) {
//1.创建新闻标题类对象
        NewsTitle car =new NewsTitle(1,"汽车","张三");
        NewsTitle food =new NewsTitle(2,"美食","李四");
        NewsTitle education =new NewsTitle(3,"教育","王五");
//2.创建set集合对象
        Set<NewsTitle> set =new HashSet<NewsTitle>();
        //HashSet news =new HashSet();
        //添加新闻标题数据
        set.add(car);
        set.add(food);
        set.add(education);

        //对set集合数据实现常见操作
        System.out.println("新闻标题："+set.size()+"条");
        System.out.println("是否包含美食新闻？"+set.contains(food));

        //遍历集合元素Iterator遍历器
        //创建迭代器对象
        Iterator<NewsTitle> it =set.iterator();
        //while循环遍历输出新闻标题
        while (it.hasNext()){
            NewsTitle news = it.next();//迭代器的next 返回object类型
            System.out.println(news.getNumber()+" "+news.getTitle()+" "+news.getAuthor());
        }

        //增强型for循环遍历输出新闻标题
        for (Object o : set) {
NewsTitle title = (NewsTitle)o;
            System.out.println(title.getNumber()+" "+title.getTitle()+" "+title.getAuthor());
        }

    }
}
