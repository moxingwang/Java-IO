package top.moxingwang.io.bio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: MoXingwang 2019-07-18 09:24
 **/
public class MultiThreadServer {
    private static ExecutorService threadPool = new ThreadPoolExecutor(5, 20, 30, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(1000));

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (true) {
            try {
                //在unix基于PlainSocketImpl.c里面的for(;;)实现阻塞
                //在windows平台又不同
                System.out.println(new Date() + "等待客户端连接...");
                Socket socket = serverSocket.accept();
                System.out.println("有新的客户端建立连接成功");

                threadPool.execute(new Task(socket));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    static class Task implements Runnable {
        private Socket socket;

        public Task(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                {
                    int len;
                    byte[] data = new byte[1024];
                    InputStream inputStream = socket.getInputStream();
                    StringBuilder stringBuilder = new StringBuilder();
                    while ((len = inputStream.read(data)) != -1) {
                        stringBuilder.append(new String(data, 0, len));
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + new Date() + "读取到客户端发来的消息:" + stringBuilder.toString());
                }

                {
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Hello world".getBytes());
                }

                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
