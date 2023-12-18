package demo.chapter04;
//23.12.18
//定义用户线程
public class MyRunnable implements Runnable{
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        //创建用户线程对象
        MyRunnable mr =new MyRunnable();
        //创建线程对象
        Thread t1 =new Thread(mr,"线程1");
        Thread t2 =new Thread(mr,"线程2");
        //分别执行用户线程
        t1.start();
        t2.start();
    }
}
