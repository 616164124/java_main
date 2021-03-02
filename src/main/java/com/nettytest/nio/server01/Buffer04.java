package com.nettytest.nio.server01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/** @author mikael */
public class Buffer04 {
  public static void main(String[] args) {
    //
    String str = "123132021年2月12日14:51:53";
    try {
      FileOutputStream fileOutputStream = new FileOutputStream("c:\\test\\1.txt");
      FileChannel channel = fileOutputStream.getChannel();
      ByteBuffer allocate = ByteBuffer.allocate(1024);
      allocate.put(str.getBytes());
      allocate.flip();
      channel.write(allocate);
      fileOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
