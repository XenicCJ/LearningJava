package _01BasicGrammar;

/*
本文件测试枚举类的基本用法
 */

/*
枚举类
将一天的主要时间段枚举化
并在类中包含一个变量用于记录枚举变量的值
 */
class DayTime{
    //创建一个枚举
    enum DaytimeInterval{morning,noon,afternoon,evening,night};
    //一个自建的枚举变量
    DaytimeInterval daytimeInterval;
}

/*
测试类
在主方法中创建一个枚举类对象，然后赋值输出
 */
public class Enum {
    public static void main(String[] args) {
        //创建一个DayTime对象
        DayTime dayTime=new DayTime();
        //设置对象中的值
        dayTime.daytimeInterval=DayTime.DaytimeInterval.evening;
        //输出对象的值
        System.out.println(dayTime.daytimeInterval);
    }
}
