package demo.bTwo.SharingEV;
//2023.11.13 一个异常的测试类
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            /*String[] str = new String[5];
            str[3] = "算数运算";
            System.out.println(str[5]);*/
            int result =divie(5,0);
            System.out.println(result);
            //ArithmeticException e 算数的异常
        }catch (ArithmeticException e0){//括号内写异常的类型
            System.out.print(e0.getMessage());//捕获到异常后 处理的语句

        }
        //ArrayIndexOutOfBoundsException e1数组下标越界异常
        /*catch (ArrayIndexOutOfBoundsException e1){//
            System.out.print(e1.getMessage());
        }*/
        finally {//finally无论是否发生异常都必然执行
            System.out.print("运行完毕！");
        }
    }
    //定义除法方法
    public static int divie(int num1,int num2)throws  ArithmeticException{
        int result =num1/num2;
        return result;
    }
}
