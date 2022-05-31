package _18IO;

import java.io.*;

//文件创建读取输出测试
public class FileIOTest {
    //将参数字符串内容写入文件
    public static void writeToFile(String filePath, String str){
        try {
            OutputStream os=new FileOutputStream(filePath);
            for(int i=0;i<str.length();i++){
                os.write(str.charAt(i));
            }
            System.out.println("已将内容"+str+"写入"+filePath);
            os.close();
        }catch (Exception e){
            System.out.println("IOException happened.");
        }
    }
    //读取文件所有内容并返回字符串
    public static String readFile(String filePath){
        String retStr="";
        try{
            InputStream is=new FileInputStream(filePath);
            int size=is.available();
            for(int i=0;i<size;i++){
                retStr+=(char)is.read();
            }
            is.close();
        }catch (IOException e){
            System.out.println("IOException happened.");
        }
        return retStr;
    }

    public static void main(String[] args) {
        //写入测试
        String filePath="src/main/java/_18IO/testFile.txt";
        String writeContent="世界你好！Hello World!";
        writeToFile(filePath,writeContent);
        System.out.println("写入文件完成！");

        //读取测试
        System.out.println("读取文件内容："+readFile(filePath));
    }
}
