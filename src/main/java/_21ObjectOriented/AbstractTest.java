package _21ObjectOriented;

public class AbstractTest {
    public static void main(String[] args) {
        Animal mouse=new Mouse("mouse",01);
        Animal cat=new Cat("cat",02);
        mouse.work();
        cat.work();
    }
}
