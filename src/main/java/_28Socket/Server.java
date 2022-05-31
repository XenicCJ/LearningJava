package _28Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class Server extends Thread{
    private ServerSocket serverSocket;

    public Server(int port) throws IOException {
        //构造服务器套接字
        serverSocket=new ServerSocket(port);
        //设置超时时间
        serverSocket.setSoTimeout(10000);
    }

    @Override
    public void run() {
        while(true){
            try{
                System.out.println("等待远程连接，端口号为："+serverSocket.getLocalPort()+"...");
                Socket server=serverSocket.accept();
                System.out.println("远程主机地址："+server.getRemoteSocketAddress());
                DataInputStream in=new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out=new DataOutputStream(server.getOutputStream());
                out.writeUTF("欢迎连接："+server.getLocalSocketAddress()+"\nGoodbye!");
                server.close();
            }catch(SocketTimeoutException s)
            {
                System.out.println("Socket timed out!");
                continue;
            }catch(IOException e)
            {
                e.printStackTrace();
                continue;
            }
        }
    }

    public static void main(@org.jetbrains.annotations.NotNull String[] args) {
        //需要一个参数，端口号
        int port=Integer.parseInt(args[0]);
        try{
            Thread t=new Server(port);
            t.run();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
