package by.lepnikau.philosophy.of.java.chapter17.task04;

import java.io.*;

public class CollectionInit {
    private static String[] data;

    public static String[] getTextFileData(String path) {
        try {
            String str;
            BufferedReader reader = new BufferedReader(new FileReader(path));
            StringBuilder sb = new StringBuilder();

            while ((str = reader.readLine()) != null) {
                sb.append(str);
            }
            data = sb.toString().split("\\s|\\.");
        } catch (IOException e) {
            System.out.println("File not found!");
        }
        return data;
    }
}
