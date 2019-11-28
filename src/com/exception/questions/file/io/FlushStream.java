package com.exception.questions.file.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlushStream {

    public static void main(String[] args) {
        String strFilePath = "WriteByte.txt";

        try {
            //create FileOutputStream object
            FileOutputStream fos = new FileOutputStream(strFilePath);

            /*
             * To create DataOutputStream object from FileOutputStream use,
             * DataOutputStream(OutputStream os) constructor.
             *
             */

            BufferedOutputStream dos = new BufferedOutputStream(fos);

            String strContent = "This example shows how to flush output stream!";
            dos.write(strContent.getBytes());

            /*
             * To flush output stream, use
             * void flush() method of DataOutputStream class.
             *
             * This method internally calls flush method of underlying OutputStream
             * class which forces any buffered output bytes to be written in the stream.
             */
//                StringBuffer
//            dos.flush();

            //close the stream
            dos.close();

        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }

    }
}
