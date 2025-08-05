package com.gmail.alinakotova102.corsoRanstad.eccezioni;

import java.io.*;

public class FileRunner {
    public static void main(String[] args) throws FileNotFoundException {
        String pathToRead = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com" +
                "/gmail/alinakotova102/corsoRanstad/file/input.txt";

        // readFile(pathToRead);
        //readNumber(pathToRead);
        // openFile(pathToRead);
        System.out.println(isExistsFile(pathToRead));
    }

    public static boolean isExistsFile(String path) throws FileNotFoundException {
        File file = new File(path);
        if (file.exists()) {
            return true;
        } else {
            throw new FileNotFoundException();
        }
    }

    public static void openFile(String path) {
        FileReader reader;
        BufferedReader bufferedReader = null;
        try {
            reader = new FileReader(path);
            bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void readNumber(String path) {
        String text = readFile(path);

        for (String num : text.trim().split("[^0-9]+")) {
            if (!num.isEmpty()) {
                System.out.println(Integer.parseInt(num));
            }
        }
    }

    public static String readFile(String path) {
        File file = new File(path);
        StringBuilder text = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                text.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Not found!");
        } catch (IOException e) {
            System.out.println("Error!");
        } finally {
            System.out.println("I read file!");
        }
        return String.valueOf(text);
    }
}
