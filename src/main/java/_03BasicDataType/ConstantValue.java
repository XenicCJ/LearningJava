package _03BasicDataType;

public class ConstantValue {
    //创建一个final的变量，此类变量的值不可变，常与static一起使用
    final double PI=3.1415926;

    //用数字来初始化byte和字符型变量
    byte a=68;
    char c=70;

    //分别用十进制、八进制、十六进制数字来初始化整型变量
    int decimal=100;
    int octal=0144;
    int hexa=0xAA;

    //初始化一个包含引号的字符串，用到了转义字符
    String str="\"This is a string\"";

    public static void main(String[] args) {
        ConstantValue constantValue=new ConstantValue();

        System.out.println("PI: "+constantValue.PI);

        System.out.println("a: "+constantValue.a);
        System.out.println("c: "+constantValue.c);

        System.out.println("decimal: "+constantValue.decimal);
        System.out.println("octal: "+constantValue.octal);
        System.out.println("hexa: "+constantValue.hexa);

        System.out.println("str: "+constantValue.str);
    }
}
