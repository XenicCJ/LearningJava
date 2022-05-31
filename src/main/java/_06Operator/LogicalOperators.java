package _06Operator;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        //逻辑运算符的测试
        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = " + (a||b) );
        System.out.println("!(a && b) = " + !(a && b));

        //短路逻辑运算符
        int c=5;
        boolean d=(c<10)||(c++<10);
        System.out.println("短路逻辑判断后结果为："+d);
        System.out.println("运算结束后c的值是："+c);

        c=5;
        d=(c<10)|(c++<10);
        System.out.println("非短路逻辑判断后结果为："+d);
        System.out.println("运算结束后c的值是："+c);
    }
}
