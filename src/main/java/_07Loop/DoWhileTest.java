package _07Loop;

public class DoWhileTest {
    public static void main(String[] args) {
        int i=0;
        //dowhile循环至少运行一次，在每次循环结束后判断是否进入下一次循环
        do {
            System.out.println("Value of i is: "+i);
            i++;
        }while(i<10);
    }
}
