package demo.Two;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;

public class TimeDateTest {
    public static void main(String[] args) {
        //#获取当前系统日期
        LocalDate now =LocalDate.now();
        System.out.println(now);
        //指定日期
        LocalDate of = LocalDate.of(1949,10,1);
        System.out.println("今年是："+now.getYear()+"年");
        System.out.println("现在是："+now.getMonthValue()+"月");
        System.out.println("今天是："+now.getDayOfMonth()+"号");

        LocalTime time =LocalTime.now();
        
    }
}
