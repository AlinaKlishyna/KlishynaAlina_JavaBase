package com.gmail.alinakotova102.corsoRanstad.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        String pathToRead = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/file/input.txt";
        String pathToWrite = "/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/file/output.txt";
        //System.out.println(readFile(pathToRead));

        //writeFile("Benvenuto nel corso Java", pathToWrite);
        //writeFile(":)", pathToWrite);

        //lineByLine(pathToRead);
        //System.out.println("Total number of words: " + sumNumbersByFile(pathToRead));

        //writeByScanner(pathToWrite);

        //System.out.println(countWord("Java", pathToRead));

        //System.out.println(openFileByScanner());

        //removeFile("/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/file/example.txt");

        // createFileUpperCase(pathToRead);

        //displayLineWithNumber(pathToRead);

        createFileUnify(pathToRead, pathToWrite);
    }

    public static void createFileUnify(String pathFirst, String pathSecond) {
        String textByFirst = readFile(pathFirst);
        String textBySecond = readFile(pathSecond);

        try {
            FileWriter writer = new FileWriter("/Users/anonimka/Desktop/Java/Projects" +
                    "/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/file/fileTogether.txt", true);
            writer.write(textByFirst);
            writer.write(textBySecond);
            writer.close(); // always write!
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void displayLineWithNumber(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                for (char symbol : line.toCharArray()) {
                   if (Character.isDigit(symbol)) {
                       System.out.println(line);
                       break;
                   }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createFileUpperCase(String path) {
        String textByFile = readFile(path);

        File file = new File("/Users/anonimka/Desktop/Java/Projects/KlishynaAlina_JavaBase/src/main/java/com/gmail/alinakotova102/corsoRanstad/file/newFile.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File created! " + file.getAbsolutePath());
            } else {
                System.out.println("File exists!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(textByFile.toUpperCase());
            writer.close(); // always write!
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean removeFile(String path) {
        return new File(path).delete();
    }

    public static String openFileByScanner() {
        System.out.println("Enter path to file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        File file = new File(path);
        while (!file.exists()) {
            System.out.println("Oops! File not found!\nEnter path to file:");
            file = new File(scanner.nextLine());
        }
        System.out.println("Success! File found!");

        String line;
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text.toString();
    }

    public static int countWord(String wordFind, String path) {
        int count = 0;
        String line;
        try {
            line = Files.readString(Path.of(path));
            for (String word : line.trim().split("[^A-Za-z]+")) {
                if (word.equalsIgnoreCase(wordFind)) {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return count;
    }

    public static void writeByScanner(String path) {
        Scanner scanner = new Scanner(System.in);

        try {
            FileWriter writer = new FileWriter(path);
            writer.write(scanner.nextLine());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int sumNumbersByFile(String path) {
        String line;
        int sum = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferedReader.readLine()) != null) {
                for (String num : line.trim().split("[^0-9]+")) {
                    if (!num.isEmpty()) {
                        sum += Integer.parseInt(num);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sum;
    }

    public static void lineByLine(String path) {
        String lines = "";
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while ((lines = reader.readLine()) != null) {
                count += lines.trim().split("[^A-Za-z]+").length;
                System.out.println(lines);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Total number of words: " + count);
    }

    static StringBuilder textByArticle = new StringBuilder();

    public static void writeFile(String text, String pathToFile) {
        textByArticle.append(text);
        try {
            File file = new File(pathToFile);
            if (file.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

            FileWriter writer = new FileWriter(file);
            writer.write(String.valueOf(textByArticle));
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFile(String pathToFile) {
        String text;
        try {
            text = Files.readString(Path.of(pathToFile));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
