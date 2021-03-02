package com.nettytest.nio.server01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;

/** @author mikael */
public class Buffer02 {

  public static void main(String[] args) {
    //
    try {
      String str = "hello 2021年2月12日14:20:34";
      // 新建文件输出流（从内存中输出到磁盘中）
      FileOutputStream fileOutputStream = new FileOutputStream("c:\\test\\1.txt");
      FileChannel channel = fileOutputStream.getChannel();
      // 设置缓存区
      ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
      byteBuffer.put(str.getBytes());
      // flip 只是改变指针的位置，不改变buffer中的内容
      byteBuffer.flip();
      // 将内容写入通道channel中
      channel.write(byteBuffer);
      fileOutputStream.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
