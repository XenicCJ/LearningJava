package _00JavaBasic._02ObjectAndClass;

/*
狗类
 */
public class Dog {
    //类包含五个变量，分别是名字、种类、大小、颜色、年龄
    String name;
    String breed;
    int size;
    String color;
    int age;

    //三个独有方法，负责吃、跑、睡
    void eat(){}
    void run(){}
    void sleep(){}

    //名字变量的set和get方法
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name=name;
    }

    //一个构造函数，可用于初始化名字变量
    public Dog(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        //新建一个狗类对象，用构造方法初始化名字，然后输出
        Dog dog1=new Dog("Merry");
        System.out.println("Dog1's name is "+dog1.getName());

        //使用set方法改变名字，然后输出
        dog1.setName("Jerry");
        System.out.println("Dog1's name is "+dog1.getName());

        //直接修改对象的变量来修改名字，然后输出
        dog1.name="Mike";
        System.out.println("Dog1's name is "+dog1.name);
    }
}
