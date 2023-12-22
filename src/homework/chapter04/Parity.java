//编写一个Java多线程程序（继承Thread类或者实现Runnable接口任选其一使用），请使用两个线程分别输出100以内的奇数和偶数，并按从小到大的顺序输出。
/*项目解析：1.继承Thread类或者实现Runnable接口任选其一使用
2.请使用两个线程分别输出100以内的奇数和偶数
 3.并按从小到大的顺序输出。*/
//2023.12.22
package homework.chapter04;
public class Parity {
    public static void main(String[] args)throws Exception {
        Thread a1 =new Thread(new Odd(),"奇数线程");
        Thread a2 =new Thread(new Even(),"偶数线程");
        a1.start();
        a2.start();

  }
}

//遍历一百以内的
class Odd implements Runnable{
    public void run(){
        for (int i=0;i<=100;i++){
            if (i % 2 != 0){
                System.out.println("100以内的奇数是："+i);
            }
        }
    }
}

//遍历一百以内的
class Even implements Runnable{
    public void run(){
        for (int i=0;i<=100;i++){
            if (i % 2 == 0){
                System.out.println("100以内偶数的是："+i);
            }
        }
    }
}
/*
//也可用以下代码
package homework.chapter04;
//编写一个Java多线程程序（继承Thread类或者实现Runnable接口任选其一使用），请使用两个线程分别输出100以内的奇数和偶数，并按从小到大的顺序输出。
*/
/*项目解析：1.继承Thread类或者实现Runnable接口任选其一使用
2.请使用两个线程分别输出100以内的奇数和偶数
 3.并按从小到大的顺序输出。*//*

public class Parity {
    public static void main(String[] args)throws Exception {
        Thread a =new Thread(new Odd(),"100以内的奇数是：");
        //Thread a2 =new Thread(new even(),"100以内的奇数是：");
        a.start();
        for (int i=0;i<=100;i++){
            if (i % 2 == 0){
                System.out.println("100以内偶数的是："+i);
            }
        }

    }
}

//遍历一百以内的
class Odd implements Runnable{
    public void run(){
        for (int i=0;i<=100;i++){
            if (i % 2 != 0){
                System.out.println("100以内的奇数是："+i);
            }
        }
    }
}

//遍历一百以内的
class even implements Runnable{
    public void run(){

    }
}


*/




