package _00JavaBasic._19Scanner;

import java.util.Scanner;

//Scanner主要用于读取用户输入
public class ScannerTest {
    //吸收回车
    public static void clearEnter(){
        Scanner scanner=new Scanner(System.in);
        if (scanner.hasNext()){
            scanner.nextLine();
        }
        scanner.close();
    }

    //测试next方法，读取控制台输入并输出
    public static void printConsoleInput0(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入内容：");
        //用hasnext判断是否有输入，这次仅接收一次
        if(scanner.hasNext()){
            String str=scanner.next();
            System.out.println("next方法接收的内容："+str);
        }
        //关闭扫描流
        scanner.close();
        clearEnter();
    }

    //测试nextLine方法，读取控制台输入并输出
    public static void printConsoleInput1(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入内容：");
        //用hasnext判断是否有输入，这次仅接收一次
        if(scanner.hasNext()){
            String str=scanner.nextLine();
            System.out.println("nextLine接受的内容："+str);
        }
        //关闭扫描流
        scanner.close();
        clearEnter();
    }

    public static void main(String[] args) {
        //测试方法
        printConsoleInput1();
    }
}
