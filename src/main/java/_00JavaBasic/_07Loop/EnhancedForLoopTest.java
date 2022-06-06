package _00JavaBasic._07Loop;

public class EnhancedForLoopTest {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        String[] strings={"Jerry","Mesa","Dickson","Zua"};
        //增强for循环，主要用于数组，循环读取数组的内容
        for(int number:numbers){
            System.out.println("number: "+number);
        }
        for(String string:strings){
            System.out.println("string: "+string);
        }
    }
}
