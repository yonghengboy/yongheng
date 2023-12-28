package demo.chapter04;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
//23.12.28
//服务器端通信程序
public class Server {
    public static void main(String[] args) throws Exception{
        new TCPServer().listen();

    }
}

//tcp服务器类
class TCPServer{
    //定义一个端口号
    private static final int PORT =7788;
    //定义一个监听的方法
    public void listen() throws Exception{
        //1.创建服务器端对象（ServerSocket）
        ServerSocket server =new ServerSocket(PORT);
        //不停的接收多客户端的连接请求
        while (true){
        //2.调用accept()方法等待客户端连接
        final Socket client =server.accept();
        //开启新线程
            new Thread() {
                public void run() {
                    //获取客户端输入流
                    OutputStream os =null;
                    try {
                        InputStream is = client.getInputStream();
                        os = client.getOutputStream();
                        System.out.println("开始与客户端交互数据....");

                        // 读取客户端发送的数据
                        byte[] buffer = new byte[1024];
                        int len = is.read(buffer);
                        String receivedMessage = new String(buffer, 0, len, StandardCharsets.UTF_8);
                        System.out.println("收到客户端消息: " + receivedMessage);

                        //输出数据的过程
                        os.write("服务器端欢迎您".getBytes());
                        //模拟其他交互功能的执行
                        Thread.sleep(5000);
                        System.out.println("结束与客户端交互数据");

                        // 关闭资源
                        os.close();
                        client.close();
                        //server.close();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                };
            }.start();

        }
    }
}