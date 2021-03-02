package com.nettytest.bio;

import com.thread.day016.ThreadPool;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** @author mikael */
public class Service04 {
  public static void main(String[] args) {
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

  private static byte[] bytes;

  private static void handler(Socket accept) {
    bytes = new byte[1024];
    try {
      while (true) {
        InputStream inputStream = accept.getInputStream();
        int read = inputStream.read(bytes);
        if (read != -1) {
          System.out.println(new String(bytes, 0, read, Charset.forName("utf-8")));
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
