package _09Switch;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("输入成绩： ");
        char score=input.next().charAt(0);
        //switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支
        switch (score){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("合格");
                break;
            case 'E':
                System.out.println("不合格");
                break;
            default:
                System.out.println("不是正确的成绩代码");
        }
    }
}
