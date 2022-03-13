package com.nettytest.nio.server01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author mikael
 */
public class BufferToHeap01 {
    public static void main(String[] args) {
        //
        try {
            FileInputStream fileInputStream = new FileInputStream("c:\\test\\2.txt");
            FileChannel channel = fileInputStream.getChannel();
            ByteBuffer allocate = ByteBuffer.allocate(1024);
            channel.read(allocate);
            System.out.println(new String(allocate.array()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
