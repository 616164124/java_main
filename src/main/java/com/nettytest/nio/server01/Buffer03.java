package com.nettytest.nio.server01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author mikael
 */
public class Buffer03 {
    public static void main(String[] args) throws IOException {
        //
        String str = "12341232021年2月12日14:41:38";
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("c:\\test\\1.txt");
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            FileChannel channel = fileOutputStream.getChannel();
            allocate.put(str.getBytes());
            allocate.flip();
            channel.write(allocate);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
