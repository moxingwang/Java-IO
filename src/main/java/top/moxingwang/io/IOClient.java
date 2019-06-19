package top.moxingwang.io;

import java.io.IOException;
import java.net.Socket;
import java.util.Date;

/**
 * @description:
 * @author: MoXingwang 2019-06-19 09:17
 **/
public class IOClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 3333);
            while (true) {
                try {
                    socket.getOutputStream().write((new Date() + ": hello world").getBytes());
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
