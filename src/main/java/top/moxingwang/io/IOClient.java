package top.moxingwang.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Date;

/**
 * @description:
 * @author: MoXingwang 2019-06-19 09:17
 **/
public class IOClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            socket.getOutputStream().write((new Date() + ": hello world").getBytes());

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
