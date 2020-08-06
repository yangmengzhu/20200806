import java.io.*;

public class WriterDemo {
    public static void 字节数据()throws IOException {
        byte[] buf=new byte[8192];
        try(OutputStream os=new FileOutputStream("测试目录\\a.txt")){
            for (int i = 0; i < 8; i++) {
                os.write(buf,i*124,1024);
            }
            os.flush();
        }
    }
    public static void 字符数据()throws IOException {
       char[] buf=new char[8192];
       try(OutputStream os=new FileOutputStream("测试目录\\a.txt")){
           try(Writer writer=new OutputStreamWriter(os)){
               /*for (int i = 0; i <8 ; i++) {
                   writer.write(buf,i*1024,1024);
               }
               writer.flush();*/
               //字符串数据
               try(PrintWriter printWriter=new PrintWriter(writer)){
                   printWriter.println("");
                   printWriter.flush();
               }
           }
       }
    }
}
