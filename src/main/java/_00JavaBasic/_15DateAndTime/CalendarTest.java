package _00JavaBasic._15DateAndTime;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        int year,month,day,hour,min,sec,dayOfWeek;
        //创建一个抽象类calendar的当前时间的对象
        Calendar cldNow= Calendar.getInstance();
        //创建一个指定日期的Calendar对象,使用set方法
        Calendar cld= Calendar.getInstance();
        cld.set(2022,2,2);
        //简单输出日期对象
        System.out.println("cldNow: "+cldNow.toString());
        //设置某个数据，获取某些数据并输出
        year=cld.get(Calendar.YEAR);
        month=cld.get(Calendar.MONTH);
        day=cld.get(Calendar.DAY_OF_MONTH);
        hour=cld.get(Calendar.HOUR);
        min=cld.get(Calendar.MINUTE);
        sec=cld.get(Calendar.SECOND);
        dayOfWeek=cld.get(Calendar.DAY_OF_WEEK);
        System.out.println("Date: "+year+" "+month+" "+day+" "+hour+" "+min+" "+sec+" "+dayOfWeek);
    }
}
