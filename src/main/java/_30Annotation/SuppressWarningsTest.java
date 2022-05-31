package _30Annotation;

public class SuppressWarningsTest {
    //加入注解忽略不建议使用方法、未使用的警告、通过实例引用静态方法警告
    //@SuppressWarnings(value = {"deprecation","unused","static-access"})
    //直接忽略所有警告
    @SuppressWarnings(value = {"all"})
    public static void main(String[] args) {
        DeprecatedTest dt=new DeprecatedTest();
        dt.printStr("SuppressWarningsTest");

        DeprecatedTest dt1=new DeprecatedTest();
    }
}
