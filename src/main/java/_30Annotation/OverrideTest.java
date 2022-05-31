package _30Annotation;

class Animal{
    public void run(){
        System.out.println("Animal running");
    }
}

class Dog extends Animal{
    //重写方法的注解
    @Override
    public void run(){
        System.out.println("Dog running");
    }

    //若注解了Override的方法没有重写父类方法，那么编译会报错
    //@Override
    public void running(){
        System.out.println("Dog running Again");
    }

}

public class OverrideTest {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.run();
    }
}
