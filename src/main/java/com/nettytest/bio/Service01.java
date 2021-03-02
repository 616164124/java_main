package com.nettytest.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** @author mikael */
public class Service01 {
  public static void main(String[] args) throws IOException {
    //
    ExecutorService service = Executors.newCachedThreadPool();
    ServerSocket serverSocket = new ServerSocket(6666);

    while (true) {
      final Socket accept = serverSocket.accept();
      service.execute(
          new Runnable() {
            @Override
            public void run() {
              // handler
              handle(accept);
            }
          });
    }
  }

  public static void handle(Socket socket) {
    try {
      byte[] bytes = new byte[1024];
      //获取socket中来的内容
      InputStream inputStream = socket.getInputStream();
      while (true) {
        int read = inputStream.read(bytes);
        if (read != -1) {
          System.out.println(new String(bytes, 0, read));
        } else {
          break;
        }
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        socket.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
