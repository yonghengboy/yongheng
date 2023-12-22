package demo.chapter04;

public class JonThread {
    public static void main(String[] args)throws Exception {
        Thread t=new Thread(new Myjoin(),"线程一");
       t.start();
        for(int i = 1;i<=6;i++){
            System.out.println("线程二"+"输出"+i);
           if (i==2){
               t.join();
           }
           Thread.sleep(500);

        }
    }
}
//定义用户线程 循环输出6个数，每输出一个数，休眠0.5秒
class Myjoin implements Runnable{
    public void run(){
        for(int i = 1;i<=6;i++){
            System.out.println(Thread.currentThread().getName()+"输出"+i);
            try {
                Thread.sleep(500);//当前线程休眠0.5秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
