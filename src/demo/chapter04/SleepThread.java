package demo.chapter04;
//23.12.21
public class SleepThread {

    public static void main(String[] args)throws Exception {//直接抛出异常throws Exception
        new Thread(new Task2()).start();
        for (int i = 1;i<=10;i++){
            if (i==5){
                Thread.sleep(2000);//当前线程休眠两秒
            }else {
                Thread.sleep(500);//否则休眠0.5秒
            }
            System.out.println("主线程正在输出"+i);
        }

    }

}

//定义用户线程
class Task2 implements Runnable{
    public void run(){
        for (int i=1;i<=10;i++){
            try{
                if (i==5){
    Thread.sleep(2000);//当前线程休眠两秒
                }else {
                    Thread.sleep(500);//否则休眠0.5秒
                }
                System.out.println("用户线程正在输出"+i);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
