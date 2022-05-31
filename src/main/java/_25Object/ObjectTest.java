package _25Object;

public class ObjectTest {
    public static void main(String[] args) {
        String str1="Hello World";
        String str2= str1;
        System.out.println("两个对象是否相等："+str1.equals(str1));
        System.out.println("str2的类型："+str2.getClass());
    }
}
