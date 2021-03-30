package lesson04;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) throws Exception {
        try {
            if (args.length==0) {
                throw new IllegalArgumentException("Путь к файлу не задан");
            }
            String content = Files.readString(Paths.get("D:\\KROK\\src\\lesson04\\"+args[0]));
            String newstring = content.replaceAll("\\n","\s");
            String[] words = Pattern.compile("\\s+").split(newstring);
            System.out.println("File has " + words.length + " words");
        }catch ( NoSuchFileException e) {
            System.out.println("Файл не найден");
        }

    }

}
