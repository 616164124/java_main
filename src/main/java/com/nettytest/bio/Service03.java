package com.nettytest.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author mikael
 */
public class Service03 {

    private static byte[] bytes;

    public static void main(String[] args) {
        //
        ExecutorService service = Executors.newCachedThreadPool();

        try {
            ServerSocket serverSocket = new ServerSocket(6666);

            while (true) {
                Socket accept = serverSocket.accept();

                service.execute(
                        () -> {
                            // ... do something inside runnable task
                            handler(accept);
                        });
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        service.shutdown();
    }


    private static void handler(Socket accept) {
        System.out.println(Thread.currentThread().getName() + "------------");
        bytes = new byte[1024];
        handler1(accept, bytes);
    }

    static void handler1(Socket accept, byte[] bytes) {
        try {
            InputStream inputStream = accept.getInputStream();
            while (true) {
                int read = inputStream.read(bytes);
                if (read != -1) {
                    System.out.println(new String(bytes, 0, read));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
