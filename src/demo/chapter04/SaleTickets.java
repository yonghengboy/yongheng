package demo.chapter04;
//2023.12.25
public class SaleTickets {
    public static void main(String[] args) {
        //创建用户线程对象
        //TicktWindow ticket =new TicktWindow();
        new Thread(new TicketWindow(),"窗口1").start();
        new Thread(new TicketWindow2(),"窗口2").start();
        new Thread(new TicketWindow3(),"窗口3").start();
        new Thread(new TicketWindow4(),"窗口4").start();

    }

    //窗口售票的线程类
    static class TicketWindow implements Runnable{
        public int tickets = 10;//定义票数

        public void run() {
            while (tickets>0){
                try{
                    Thread.sleep(20);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"售出的票"+tickets--);

            }
        }
    }

    //窗口2
    static class TicketWindow2 implements Runnable{
        public int tickets = 10;//定义票数
        public void run() {
            while (tickets>0){
                try{
                    Thread.sleep(20);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"售出的票"+tickets--);

            }
        }
    }
    //窗口3
    static class TicketWindow3 implements Runnable{
        public int tickets = 10;//定义票数
        public void run() {
            while (tickets>0){
                try{
                    Thread.sleep(20);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"售出的票"+tickets--);

            }
        }
    }
    //窗口4
    static class TicketWindow4 implements Runnable{
        public int tickets = 10;//定义票数
        public void run() {
            while (tickets>0){
                try{
                    Thread.sleep(20);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"售出的票"+tickets--);

            }
        }
    }
}
