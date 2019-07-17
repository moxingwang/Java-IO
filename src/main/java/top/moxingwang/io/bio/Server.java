package top.moxingwang.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * @description:
 * @author: MoXingwang 2019-06-19 09:36
 **/
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            try {
                //在unix基于PlainSocketImpl.c里面的for(;;)实现阻塞
                //在windows平台又不同
                System.out.println(new Date() + "等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("有新的客户端建立连接成功");

                {
                    int len;
                    byte[] data = new byte[1024];
                    InputStream inputStream = socket.getInputStream();
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((len = inputStream.read(data)) != -1) {
                        stringBuilder.append(new String(data, 0, len));
                    }
                    System.out.println(new Date() + "读取到客户端发来的消息:" + stringBuilder.toString());
                }

                {
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Hello world".getBytes());
                    socket.close();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
