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
public class Service02 {
    public static void main(String[] args) {
        //
        ExecutorService service = Executors.newCachedThreadPool();
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            while (true) {
                final Socket accept = serverSocket.accept();
                service.execute(
                        new Runnable() {
                            @Override
                            public void run() {
                                handler(accept);
                            }
                        });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handler(Socket serverSocket) {
        byte[] bytes = new byte[1024];
        Service03.handler1(serverSocket, bytes);
    }
}
