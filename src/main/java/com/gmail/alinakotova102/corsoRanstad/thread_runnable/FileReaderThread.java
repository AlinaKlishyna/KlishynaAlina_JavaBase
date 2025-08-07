package com.gmail.alinakotova102.corsoRanstad.thread_runnable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderThread extends Thread{
    private String filePath;

    public FileReaderThread (String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read : " + line);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String filePath = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com" +
                "/gmail/alinakotova102/corsoRanstad/file/input.txt";

        FileReaderThread fileReaderThread = new FileReaderThread(filePath);
        fileReaderThread.start();
    }
}
