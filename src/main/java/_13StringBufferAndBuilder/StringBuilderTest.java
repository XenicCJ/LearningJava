package _13StringBufferAndBuilder;

public class StringBuilderTest {
    public static void main(String[] args) {
        //StringBuilder类不是线程安全的，与String不同，StringBuilder类的内容是可变的
        StringBuilder sb=new StringBuilder(5);
        sb.append("getthereamazinglyfast");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.insert(3,"noooo");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.delete(3,8);
        System.out.println(sb);
        System.out.println(sb.capacity());
    }
}
