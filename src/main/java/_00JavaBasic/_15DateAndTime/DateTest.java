package _00JavaBasic._15DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //直接创建日期类，获取当前时间
        Date date0=new Date();
        //用毫秒创建日期类
        long ms;
        ms = 10000000000000L;
        Date date1=new Date(ms);
        //输出两个日期的字符串形式
        System.out.println("date0: "+date0.toString());
        System.out.println("date1: "+date1.toString());
        //Date对象的一些方法
        //检查对象是否在参数之前或之后
        System.out.println("date0.after(date1): "+date0.after(date1));
        System.out.println("date1.after(date0): "+date1.after(date0));
        System.out.println("date0.before(date1): "+date0.before(date1));
        System.out.println("date1.before(date0): "+date1.before(date0));
        //比较两个日期
        System.out.println("date0.compareTo(date1): "+date0.compareTo(date1));
        //比较两个日期是否相等
        System.out.println("date0.equals(date1): "+date0.equals(date1));
        //获取对象代表时间对应毫秒数
        System.out.println("date0.getTime(): "+date0.getTime());
        //返回对象的哈希值
        System.out.println("date0.hashCode(): "+date0.hashCode());
        //用毫秒值设置时间
        date1.setTime(1000000000L);
        System.out.println("date1: "+date1.toString());
        //使用SimpleDateFormat格式化日期
        SimpleDateFormat sdf=new SimpleDateFormat("GG yyyy M D H:m:s:S E D F w:W a k K z");
        System.out.println("date0: "+sdf.format(date0));
        //将字符串转化为date对象
        String strDate="2222-02-22";
        sdf=new SimpleDateFormat("yyyy-M-d");
        try{
            date1=sdf.parse(strDate);
            System.out.println("date1: "+date1.toString());
        }catch (Exception exception){
            System.out.println("Error!");
        }
        //测试间隔时间，这里用延迟作为测试内容
        long start=System.currentTimeMillis();
        try{
            Thread.sleep(100);
        }catch (Exception exception){
            System.out.println("Error!");
        }
        long end=System.currentTimeMillis();
        long diff=end-start;
        System.out.println("diff: "+diff);
    }
}
