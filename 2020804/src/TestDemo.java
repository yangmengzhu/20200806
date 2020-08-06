import java.io.File;
import java.io.IOException;
/*
  IO创建删除文件/文件夹
*/

public class TestDemo {
    public static void main1(String[] args) {
        String path="";
        File file=new File(path);
        //创建失败抛出异常，已存在返回false
        try {
            boolean newFile = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //创建目录,已存在或者创建失败返回false
        boolean mkdir = file.mkdir();
        //创建目录，会把中间没有的目录一起创建出来
        System.out.println(file.mkdirs());

    }

    public static void main2(String[] args) {
        //重命名操作

        File file=new File("a.txt");
        //File dest=new File("测试目录\b.txt");
        //file.renameTo(dest);
        //剪切--粘贴操作
        //File file=new File("测试目录\a.txt");
        //File dest=new File("a.txt");
        //file.renameTo(dest);
        file.delete();//立即删除
        file.deleteOnExit();//等JVM退出后删除
        File[] files = file.listFiles();//得到文件类型的
        for (File f:files) {
            System.out.println(f.getAbsolutePath());
        }
        //不是目录返回Null
        String[] list = file.list();//得到文件名类型
        for (String s:list) {
            System.out.println(s);
        }
    }
   //深度优先遍历所有子孙
    public static void main(String[] args) {
        File root=new File("");
        scanDir(0,root);
    }
    private static void scanDir(int level,File node){
        for(int i=0;i<level;i++){
            System.out.println("    ");
        }
        System.out.println(node.getAbsolutePath());
        File[] children = node.listFiles();
        if(children==null){
            return;
        }
        for(File child:children){
            if(child.isDirectory()){
                scanDir(level+1,child);
            }else if(child.isFile()){
                for(int i=0;i<level;i++){
                    System.out.println("    ");
                }
                System.out.println(child.getAbsolutePath());
            }
        }
    }
}
