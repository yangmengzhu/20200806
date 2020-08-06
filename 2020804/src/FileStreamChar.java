import java.io.*;
import java.util.Scanner;

public class FileStreamChar {
    public static void main1(String[] args) throws IOException {
        //每次处理一行
        try (InputStream is = new FileInputStream("测试目录\\a.txt")) {
            try (Reader reader = new InputStreamReader(is, "uft-8")) {
                try (Scanner scan = new Scanner(reader)) {
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        System.out.println(line);
                    }
                }
            }
        }
    }

    public static void main2(String[] args) throws IOException{
        try (InputStream is = new FileInputStream("测试目录\\a.txt")) {
                try (Scanner scan = new Scanner(is,"utf-8")) {
                    while (scan.hasNextLine()) {
                        String line = scan.nextLine();
                        System.out.println(line);
                    }
                }
        }
    }

    public static void main(String[] args) throws IOException{
        try(InputStream is=new FileInputStream("测试目录\\a.txt")){
            try(Scanner scan=new Scanner(is,"utf-8")){
                while(scan.hasNextLine()){
                    String s = scan.nextLine();
                    System.out.println(s);
                }
            }
        }
    }
}
