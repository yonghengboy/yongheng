package demo.chapter04;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//23.12.28
//客户端通信程序
public class Client {

    public static void main(String[] args) throws Exception{
new TCPClient().connect();
    }
}

//TCP客户端
class TCPClient{
    //定义一个端口号
    public static final int PORT =7788;
    //定义建立连接的方法connect()
    public void connect()throws Exception{
        //创建SocKet对象
        Socket socket =new Socket(InetAddress.getLocalHost(),PORT);
        OutputStream os = socket.getOutputStream();
        os.write("你在干什么？".getBytes());
        //接收服务器端的数据流
       InputStream is = socket.getInputStream();
       //定义一个字节数组存储接收到的数据流
        byte[] buf = new byte[1024];
        //读取接收到的数据流
        int len = is.read(buf);
        //以字符串显示读取的字节数据
        System.out.println(new String(buf,0,len));
        os.close();
        is.close();
        socket.close();//关闭客户端对象

    }
}
