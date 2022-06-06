package _00JavaBasic._03BasicDataType;

//输出各基本类型的包装类中记录的基本类型的大小、所属包以及最大最小值
public class PrimitiveTypeTest {
    public static void main(String[] args) {
        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);

        //boolean
        System.out.println("Primitive type: boolean");
        System.out.println("Package Class: java.lang.Boolean");
        System.out.println("Max value: "+Boolean.TRUE);
        System.out.println("Min value: "+Boolean.FALSE);
        System.out.println();

        //byte
        System.out.println("Primitive type: byte, bits: "+Byte.SIZE);
        System.out.println("Package Class: java.lang.Byte");
        System.out.println("Max value: "+Byte.MAX_VALUE);
        System.out.println("Min value: "+Byte.MIN_VALUE);
        System.out.println();

        //short
        System.out.println("Primitive type: short, bits: "+Short.SIZE);
        System.out.println("Package Class: java.lang.Short");
        System.out.println("Max value: "+Short.MAX_VALUE);
        System.out.println("Min value: "+Short.MIN_VALUE);
        System.out.println();

        //int
        System.out.println("Primitive type: int, bits: "+Integer.SIZE);
        System.out.println("Package Class: java.lang.Integer");
        System.out.println("Max value: "+Integer.MAX_VALUE);
        System.out.println("Min value: "+Integer.MIN_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();
    }
}
