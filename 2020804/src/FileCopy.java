import java.io.*;

public class FileCopy {
    //复制内容
     public static void main(String[] args)throws IOException {
        //不关心字符类型，读多少写多少
        String sourcePath="";
        String destPath="";
        try(InputStream is=new FileInputStream(sourcePath)){
           try(OutputStream os=new FileOutputStream(destPath)){
               byte[] buf=new byte[8192];
               int n;
               while((n=is.read(buf))!=-1){
                   os.write(buf,0,n);
               }
               os.flush();
           }
        }
     }

}
