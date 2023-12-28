package demo.chapter04;
import java.util.Random;
//2023.12.25
public class SaleTickets2 {
    public static void main(String[] args) {
        //创建用户线程对象
        //TicktWindow ticket =new TicktWindow();
        new Thread(new TicketWindow(),"窗口1").start();
        new Thread(new TicketWindow(),"窗口2").start();
        new Thread(new TicketWindow(),"窗口3").start();
        new Thread(new TicketWindow(),"窗口4").start();

    }

    static class TicketWindow implements Runnable{
        public static int tickets = 20;//定义票数
        //定义同步代码块的锁（创建任意一个对象）
        public static Object lock =new Object();
        //窗口售票的线程类
       public void run() {

            while (true){
                synchronized (lock){
                try{
                    /*随机延迟 方法一 random.nextInt(100)
                    *           方法二 (int)(Math.random() * 100)*/
                    Thread.sleep(300);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            if (tickets>0)
                System.out.println(Thread.currentThread().getName()+"----售出的票"+tickets--);
                else {
             System.exit(0);
            }
                }
            }
        }
    }
}


