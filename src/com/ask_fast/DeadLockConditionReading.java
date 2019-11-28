package com.ask_fast;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

public class DeadLockConditionReading {

    public static void main(String[] args) {

        File file1 = new File("/home/pankaj/Documents/private/interview/src/com/ask_fast/type.txt");
        File file2 = new File("/home/pankaj/Documents/private/interview/src/com/ask_fast/map.txt");

        Thread t1 = new Thread(() -> {
            synchronized (file1) {
                System.out.println("Thread 1 ::::: Res :: 1");

                List<String> lines;
                try {
                    lines = Files.readAllLines(file1.toPath());
                    for (String line : lines) {
                        System.out.println(line);
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (file2) {
                    System.out.println("Thread 1 ::::: Res :: 2");
                    List<String> lines1;
                    try {
                        lines1 = Files.readAllLines(file2.toPath());
                        for (String line : lines1) {
                            System.out.println(line);
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (file2) {
                System.out.println();
                System.out.println("Thread 2 ::::: Res :: 2");
                System.out.println();

                List<String> lines;
                try {
                    lines = Files.readAllLines(file2.toPath());
                    for (String line : lines) {
                        System.out.println(line);
                        Thread.sleep(100);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                synchronized (file1) {
                    System.out.println();
                    System.out.println("Thread 2 ::::: Res :: 1");
                    System.out.println();
                    List<String> lines1;
                    try {
                        lines1 = Files.readAllLines(file1.toPath());
                        for (String line : lines1) {
                            System.out.println(line);
                            Thread.sleep(100);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        });

        t1.start();
        t2.start();

    }

}
