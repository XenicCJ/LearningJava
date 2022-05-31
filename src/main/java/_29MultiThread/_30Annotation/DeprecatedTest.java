package _29MultiThread._30Annotation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DeprecatedTest {
    //添加了deprecated注解的输出字符串方法
    @Deprecated
    protected static void printStr(String str){
        System.out.println(str);
    }

    //没有注解的方法
    protected static void printString(String str){
        System.out.println(str);
    }

    //使用了建议不用的Date类的获取时间方法
    protected static void printDateTime(){
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy M d H:m:s:S");
        System.out.println(sdf.format(date));
    }

    //使用推荐使用的Calender类输出时间的方法
    protected static void printCalenderTime(){
        Calendar cld=Calendar.getInstance();
        System.out.println(cld.getTime());
    }

    public static void main(String[] args) {
        printStr("printStr Hello");
        printString("printString Hello");
        printDateTime();
        printCalenderTime();
    }
}
