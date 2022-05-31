package _30Annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//自定义的运行时注解，注解内容默认为unknown
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String[] value() default "unknown";
}

//使用MyAnnotation的Person类
class Person{
    /**
     * empty方法被两个注解标注
     * deprecated注解标识方法是不建议使用的
     * MyAnnotation含有默认值unknown
     */
    @MyAnnotation
    @Deprecated
    public void empty(){
        System.out.println("empty");
    }

    /**
     * @MyAnnotation具有值boy和girl
     * @param name
     * @param age
     */
    @MyAnnotation(value = {"boy","girl"})
    public void somebody(String name,int age){
        System.out.println("somebody: "+name+", "+age);
    }
}

public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        //创建person实例
        Person person=new Person();
        //获取Person的Class实例
        Class<Person> personClass=Person.class;
        //获取somebody方法的实例
        Method mSomebody=personClass.getMethod("somebody", new Class[]{String.class, int.class});
        //调用方法
        mSomebody.invoke(person,new Object[]{"Chadwin",26});
        //输出注解
        iteratorAnnotations(mSomebody);

        //获取empty方法的实例
        Method mEmpty=personClass.getMethod("empty",new Class[]{});
        mEmpty.invoke(person,new Object[]{});
        iteratorAnnotations(mEmpty);
    }

    public static void iteratorAnnotations(Method method){
        //若方法含有MyAnnotation注解，则获取其中的值
        if(method.isAnnotationPresent(MyAnnotation.class)){
            //获取MyAnnotation注解
            MyAnnotation myAnnotation=method.getAnnotation(MyAnnotation.class);
            //获取并打印注解的值
            String[] strs= myAnnotation.value();
            for (String str:strs){
                System.out.println("注解包含： "+str);
            }
        }

        //获取方法上的所有注解并打印
        Annotation[] annotations= method.getAnnotations();
        for(Annotation annotation:annotations){
            System.out.println("方法含有注解： "+annotation);
        }
        System.out.println();
    }
}
