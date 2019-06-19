package top.moxingwang.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description:
 * @author: MoXingwang 2019-06-19 09:36
 **/
public class BIOServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true) {
            try {
                //在unix基于PlainSocketImpl.c里面的for(;;)实现阻塞
                //在windows平台又不同
                Socket socket = serverSocket.accept();

                int len;
                byte[] data = new byte[1024];
                InputStream inputStream = socket.getInputStream();
                while ((len = inputStream.read(data)) != -1) {
                    System.out.println(new String(data, 0, len));
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
