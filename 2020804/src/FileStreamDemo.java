import java.io.*;

public class FileStreamDemo {
    public static void main(String[] args) throws IOException{
        try(InputStream is=new FileInputStream("a.txt")){
            try(Reader reader=new InputStreamReader(is,"uft-8")){
                char[] buf=new char[1024];
                int n;
                while((n=reader.read(buf))!=-1){
                    for (int i = 0; i <n ; i++) {
                        System.out.println(buf[i]);
                    }
                }
            }
        }
    }
    public static void main2(String[] args) throws IOException{
        try(InputStream is=new FileInputStream("a.txt")){
            //利用字节流作为构造方法，构造出字符流
            try(Reader reader=new InputStreamReader(is,"UTF-8")){
                //读取单位变成了char类型
                //int ch=reader.read();
                char[] buf=new char[1024];
                int n;
                while((n=reader.read(buf))!=-1){
                    for (int i = 0; i <n ; i++) {
                        System.out.println(buf[i]);
                    }
                }
            }
        }
    }
   /* public static void main1(String[] args) {
        inputDemo();
    }*/

   /* private static void inputDemo() {
       *//* try( InputStream is=new FileInputStream("a.txt")) {
            //一个字节一个字节读取
            int count=0;
            while(true){
                int b=is.read();
                if(b==-1){
                    break;
                }
                count++;//hello\r\nworld这里的count=12
            }
        } catch (IOException  e) {
            e.printStackTrace();
        }*//*
        //一次读一批
      *//*  try( InputStream is=new FileInputStream("a.txt")){
            byte[] buffer=new byte[8];
            int count=0;//read被调用的次数
            while(true){
                //n是最终读到的字节个数最多读8个
               int n=is.read(buffer,0,8);
                if(n==-1){
                    break;
                }
                for(int i=0;i<n;i++){
                    int b=buffer[i];
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }*//*
        *//*try (OutputStream os = new FileOutputStream("b.txt")) {
           os.write();
           os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*//*
        //读入带有文字类型
        try(InputStream is=new FileInputStream("a.txt")){
            byte[] buf=new byte[1024];
            int n;
            while((n=is.read(buf))!=-1 ){
               *//* for (int i = 0; i <n ; i++) {
                    System.out.printf("|%d|%02x|%n",buf[i],buf[i]);
                }*//*
                String s=new String(buf,0,n,"UTF-8");
                System.out.println(s);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    *//*public static void main2(String[] args) throws IOException{
        try(InputStream is=new FileInputStream("a.txt")){
            //利用字节流作为构造方法，构造出字符流
            try(Reader reader=new InputStreamReader(is,"UTF-8")){
                //读取单位变成了char类型
                //int ch=reader.read();
                char[] buf=new char[1024];
                int n;
                while((n=reader.read(buf))!=-1){
                    for (int i = 0; i <n ; i++) {
                        System.out.println(buf[i]);
                    }
                }
            }
        }
    }
*/

}
