package shild.fileUtil;

import java.io.*;
import java.util.Scanner;
public class FileUtil {
    public static String path = "src/files/util.bit";
    public static String dirPath="src";
    public static Scanner scanner = new Scanner(System.in);
    public static String keyword;
    public static void main(String[] args) throws IOException {
        String text = "Hello World";
        byte[] bytes = text.getBytes();
        try (FileOutputStream fos = new FileOutputStream(path);) {
            for (byte b : bytes) {
                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println("erorr file");
        }
        System.out.println("input keyword ");
        keyword=scanner.nextLine();
        printLineByKeyword(path, keyword);
        if (text.contains(keyword)) {
            System.out.println(": " + keyword + " " + text + " " + true);
        } else {
            System.out.println(": " + keyword + " " + text + " " + false);
        }
    }

    public static void printLineByKeyword(String path, String keyword) throws IOException {
        try (FileInputStream fis = new FileInputStream(path);) {
            int symbols;
            while ((symbols = fis.read()) != -1) {
                System.out.print(((char) symbols)); }
        } catch (IOException e) {
            System.out.println("input error");


        }


    }

    public static void printLineByKeywordOnDir(String dirPath, String keyword) {
        try(FileInputStream fis=new FileInputStream(dirPath)){
        }catch (IOException e){
            System.out.println("file not exist");
            int line;

        }


    }
}
