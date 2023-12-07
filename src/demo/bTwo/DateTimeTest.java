package demo.bTwo;
//2023-11-13 #时间 #日期
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {
        LocalDate now =LocalDate.now();//#获取当前系统日期 #获取日期
        System.out.println(now);
        LocalDate of= LocalDate.of(1949,10,1);//指定日期
        LocalDate of1= LocalDate.of(2004,1,1);//指定日期
        System.out.println(of);

        System.out.println(now.getYear()+"年");
        System.out.println(now.getMonthValue()+"月");
        System.out.println(now.getDayOfMonth()+"日");
        System.out.println(now.isLeapYear());//判断是否是闰年

        System.out.println(of.getYear()+"年");
        System.out.println(of.getMonthValue()+"月");
        System.out.println(of.getDayOfMonth()+"日");

        System.out.println(of.isLeapYear());//判断是否是闰年 false不是 t
        System.out.println(of1.isLeapYear());//判断是否是闰年 false不是 true是闰年

        //#获取当前系统时间 #获取时间
        LocalTime time =LocalTime.now();
        System.out.println(time);
        LocalTime t =LocalTime.of(20,30,10);//自定义时间
        System.out.println(t);
        System.out.println(time.getHour()+"时");
        System.out.println(time.getMinute()+"分");
        System.out.println(time.getSecond()+"秒");
        //#格式化日期时间
        System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss")));

//#获取系统日期时间 #日期时间
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        System.out.println(dt.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh时mm分ss秒")));









    }
}
