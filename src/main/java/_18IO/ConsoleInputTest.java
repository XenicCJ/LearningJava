package _18IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//控制台输入测试
public class ConsoleInputTest {
    public static void main(String[] args) throws IOException {
        //创建一个控制台输入流
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //循环读取字符
        char c;
        System.out.println("Input something, end with '#'");
        do {
            c=(char)br.read();
            System.out.print(c);
        }while(c!='#');
        System.out.println();
        br.read();
        //读取字符串
        String str;
        System.out.println("Input some lines, end with '###'");
        do {
            str=br.readLine();
            System.out.println(str);
        }while(!str.equals("###"));
        //控制台输出，使用最基本方法
        System.out.write('H');
        System.out.write('e');
        System.out.write('l');
        System.out.write('l');
        System.out.write('o');
        System.out.write('!');
        System.out.write('\n');
    }
}
