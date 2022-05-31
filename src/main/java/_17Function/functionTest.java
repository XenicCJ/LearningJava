package _17Function;

public class functionTest {
    //使用可变参数的一个函数
    private static void calSum(double... numbers){
        if(numbers.length==0)
            System.out.println("No argument passed");
        double result=0;
        for (double number:
             numbers) {
            result+=number;
        }
        System.out.println("Result is "+ result);
    }

    //终结方法，当对象被回收时运行
    @Override
    protected void finalize() throws Throwable {
        System.out.println("此对象被回收了");
        super.finalize();
    }

    public static void main(String[] args) {
        calSum(10.2,30,44.4);
        //垃圾收集测试
        functionTest ft1=new functionTest();
        functionTest ft2=new functionTest();
        functionTest ft3=new functionTest();
        functionTest ft4=new functionTest();
        ft4=ft3=ft2=ft1;
        System.gc();
    }
}
