package _18IO;

import java.io.File;

//文件夹创建、读取、删除的测试
public class DirTest {
    //根据参数创建目录，允许直接创建多层目录
    public static void createDir(String dirPath){
        File dir=new File(dirPath);
        dir.mkdirs();
        System.out.println("创建目录"+dirPath+"完成");
    }

    //读取目录内容，在控制台输出目录中包含的目录名和文件名
    public static void readDir(String dirPath){
        File f=new File(dirPath);
        //判断是否是目录
        if(f.isDirectory()){
            System.out.println("目录："+dirPath);
            String s[]=f.list();
            for(int i=0;i<s.length;i++){
                File f1=new File("dirName:"+s[i]);
                if(f1.isDirectory()){
                    System.out.println(s[i]+"是一个目录");
                }else{
                    System.out.println(s[i]+"是一个文件");
                }
            }
        }else {
            System.out.println(dirPath+"不是目录");
        }
    }

    //删除文件或目录，采用递归结构
    public static void deleteFileOrDir(String path){
        File f0=new File(path);
        if(f0.isDirectory()){
            File[] files=f0.listFiles();
            for (File file:files){
                String filePath=file.getPath();
                if(file.isDirectory()){
                    deleteFileOrDir(filePath);
                    System.out.println("已删除目录："+filePath);
                }else{
                    file.delete();
                    System.out.println("已删除文件："+filePath);
                }
            }
        }else {
            f0.delete();
            System.out.println("已删除文件："+path);
        }
        f0.delete();
        System.out.println("已删除目录："+path);
    }

    //主方法，测试类方法
    public static void main(String[] args) {
        //创建测试文件夹
        String dirPath="src/main/java/_18IO/testDir";
        createDir(dirPath);

        //在测试文件夹内创建测试文件与目录
        createDir(dirPath+"//dir0");
        createDir(dirPath+"//dir1");
        FileIOTest.writeToFile(dirPath+"//File0","Hello File0");
        FileIOTest.writeToFile(dirPath+"//File1","Hello File1");
        FileIOTest.writeToFile(dirPath+"//File2","Hello File2");

        //读取目录内容
        readDir(dirPath);

        //删除测试文件目录
        deleteFileOrDir(dirPath);
    }
}
