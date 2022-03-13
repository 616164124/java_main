package com.nettytest.nio.server01;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * @author mikael
 */
public class Buffer01 {
    public static void main(String[] args) {
        //
        IntBuffer intBuffer = IntBuffer.allocate(5);
        intBuffer.put(87);
        intBuffer.put(2);
        intBuffer.put(55);
        intBuffer.put(23);
        intBuffer.put(4);
        intBuffer.flip();

        for (int i = 0; i < intBuffer.capacity(); i++) {
            //
            intBuffer.put(i * 2);
        }
        intBuffer.flip();
        while (intBuffer.hasRemaining()) {
            System.out.println(intBuffer.get());
        }
    }
}
