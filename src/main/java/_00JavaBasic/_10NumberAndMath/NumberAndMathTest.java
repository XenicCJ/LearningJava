package _00JavaBasic._10NumberAndMath;

public class NumberAndMathTest {
    public static void main(String[] args) {
        Double d=new Double(-3.5);
        Integer i=new Integer(-3);
        //针对math类和number类的常用方法的测试
        //将 Number 对象转换为xxx数据类型的值并返回
        System.out.println("d.intValue()= "+d.intValue());
        //比较数字对象值
        System.out.println("i.compareTo(d.intValue())= "+i.compareTo(d.intValue()));
        //判断是否相等
        System.out.println("i.equals(d.intValue())= "+i.equals(d.intValue()));
        //返回指定的数据类型
        System.out.println("Double.valueOf(\"7.77\")= "+Double.valueOf("7.77"));
        //以字符串返回值
        System.out.println("d.toString()= "+d.toString());
        //以指定方式解析字符串
        System.out.println("Integer.parseInt(\"100\",13)= "+Integer.parseInt("100",13));
        //返回绝对值
        System.out.println("Math.abs(d)= "+Math.abs(d));
        //向上取整
        System.out.println("Math.ceil(d)= "+Math.ceil(d));
        //向下取整
        System.out.println("Math.floor(d)= "+Math.floor(d));
        //获取最接近的整数，返回double
        System.out.println("Math.rint(d)= "+Math.rint(d));
        //四舍五，返回int
        System.out.println("Math.round(d)= "+Math.round(d));
        //返回两个参数中的较小值
        System.out.println("Math.min(i,d)= "+Math.min(i,d));
        //返回两个参数中的较大值
        System.out.println("Math.max(i,d)= "+Math.max(i,d));
        //返回e的参数次方
        System.out.println("Math.exp(d)= "+Math.exp(d));
        //返回参数的对数值
        System.out.println("Math.log(Math.abs(d))= "+Math.log(Math.abs(d)));
        //返回第一个参数的第二个参数次方
        System.out.println("Math.pow(-i,d)= "+Math.pow(-i,d));
        //返回参数的平方根
        System.out.println("Math.sqrt(-d)= "+Math.sqrt(-d));
        //求一些三角函数值
        System.out.println("Math.sin(Math.PI/3)= "+Math.sin(Math.PI/3));
        System.out.println("Math.cos(Math.PI/3)= "+Math.cos(Math.PI/3));
        System.out.println("Math.tan(Math.PI/3)= "+Math.tan(Math.PI/3));
        //求一些反三角函数值
        System.out.println("Math.asin(0.5)= "+Math.asin(0.5));
        System.out.println("Math.acos(0.5)= "+Math.acos(0.5));
        System.out.println("Math.atan(1)= "+Math.atan(1));
        //将笛卡尔坐标转换为极坐标
        System.out.println("Math.atan2(10,20)= "+Math.atan2(10,20));
        System.out.println("Math.atan2(20,40)= "+Math.atan2(20,40));
        //将参数转换为角度
        System.out.println("Math.toDegrees(Math.Pi/6)= "+Math.toDegrees(Math.PI/6));
        //将角度转换为弧度
        System.out.println("Math.toRadians(30)= "+Math.toRadians(30));
        //返回一个0-1的随机数
        for(int j=0;j<2;j++) {
            System.out.println("Math.random()= "+Math.random());
        }
    }
}
