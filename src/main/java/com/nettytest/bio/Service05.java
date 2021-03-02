package com.nettytest.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** @author mikael */
public class Service05 {
  public static void main(String[] args) {
    //
    ExecutorService service = Executors.newCachedThreadPool();
    try {
      ServerSocket serverSocket = new ServerSocket(6666);
      while (true) {
      final   Socket accept = serverSocket.accept();
        service.execute(
            () -> {
              // ... do something inside runnable task
              handle(accept);
            });
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

    service.shutdown();
  }

  private static void handle(Socket accept) {
    byte[] bytes = new byte[1024];
    while (true) {
      try {
        InputStream inputStream = accept.getInputStream();
        int read = inputStream.read(bytes);
        if (read != -1) {
          System.out.println(new String(bytes, 0, read));
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
