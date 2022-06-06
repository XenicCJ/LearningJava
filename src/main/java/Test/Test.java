package Test;

import java.util.Scanner;

//测试类，对一些有趣的或是别人遇到的困惑之处进行测试，并修改得到解决方案
public class Test {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入新员工的姓名: ");
        String name = sc.next( );
        System.out.println("请输入新员工应聘的编程语言: ");
        String language = sc.next( );
        switch (language) {
        case "Java":
        System.out.println(name +"被分配到Java开发部门");
        break;
        case "C#":
        System.out.println(name+"被分配到C#程序开发部门");
        break;
        case"asp.net":
        System.out.println(name+"被分配到asp.net程序测试部门");
        break;
        case"前端":
        System.out.println(name + "被分配到前端程序开发部门" );
default:
        System.out.println("该岗位不需要人了！");
        break;
        }

        }
}

