package _00JavaBasic._03BasicDataType;

//此类创建八种基本类型的变量以及字符串和空类变量并输出其默认值
public class DefaultValue {

    //布尔类型
    static boolean bool;
    //字符类型
    static char ch;
    //比特类型
    static byte by;
    //整型、长整型、短整型
    static int i;
    static long l;
    static short sh;
    //双精度浮点型、单精度浮点型
    static double d;
    static float f;

    //字符串与空不属于基本类型
    //字符串类型
    static String str;
    //空类
    static Void v;

    public static void main(String[] args) {
        System.out.println("Bool :" + bool);
        System.out.println("Byte :" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double :" + d);
        System.out.println("Float :" + f);
        System.out.println("Integer :" + i);
        System.out.println("Long :" + l);
        System.out.println("Short :" + sh);
        System.out.println("String :" + str);
        System.out.println("Void :" + v);
    }
}
