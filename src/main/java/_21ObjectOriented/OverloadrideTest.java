package _21ObjectOriented;


//重写与重载测试
public class OverloadrideTest {
    public static void main(String[] args) {
        Animal mouse=new Mouse("mouse",01);
        Animal cat=new Cat("cat",02);
        mouse.eat();
        mouse.sleep();
        cat.eat();
        cat.sleep();
        mouse.eat("奶酪");
        mouse.sleep("杰瑞的小屋");
        cat.eat("鱼");
        cat.sleep("汤姆的小窝");
    }
}
