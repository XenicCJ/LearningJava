package _01JavaObjectOriented;

//继承测试
public class InheritTest {
    public static void main(String[] args) {
        Animal mouse=new Mouse("mouse",01);
        Animal cat=new Cat("cat",02);
        mouse.eat();
        cat.eat();
        mouse.sleep();
        cat.sleep();
    }
}
