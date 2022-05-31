package _08ConditionalStatment;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int score;
        Scanner input=new Scanner(System.in);
        System.out.print("输入成绩：");
        score=input.nextInt();

        //if else测试，若if条件判断为true则进入代码块、否则跳出或进入下一个else if的判断
        if (score<0){
            System.out.println("最低分0分，请不要乱填分数");
        }else if (score<60){
            System.out.println("不合格");
        }else if (score<70){
            System.out.println("D");
        }else if (score<80){
            System.out.println("C");
        }else if (score<90){
            System.out.println("B");
        }else if (score<=100){
            System.out.println("A");
            if (score==100){
                System.out.println("满分！太厉害了");
            }
        }else if (score>100){
            System.out.println("满分100，请不要乱填分数");
        }
    }
}
