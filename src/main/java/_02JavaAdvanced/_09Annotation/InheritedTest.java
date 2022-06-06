package _02JavaAdvanced._09Annotation;

import java.lang.annotation.*;

//自定义一个可被继承的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//当注解被注解成Inherited时，此注解是可以继承的，反之不可以继承
@Inherited
@interface Inheritable{
}

//一个具有Inheritable的父类
@Inheritable
class Father{
    public Father(){
        //检查father类是否有Inheritable注解
        System.out.println("Father类是否有Inheritable注解："+Father.class.isAnnotationPresent(Inheritable.class));
    }
}

//一个没有显式注解的子类
class Son extends Father{
    public Son(){
        //调用父类构造方法
        super();
        //检查son类是否有Inheritable注解
        System.out.println("son类是否有Inheritable注解："+Son.class.isAnnotationPresent(Inheritable.class));
    }
}

public class InheritedTest {
    //创建一个子类
    public static void main(String[] args) {
        //一个消除警告注解，忽略未使用
        @SuppressWarnings(value = {"unused"})
        Son son=new Son();
    }
}
