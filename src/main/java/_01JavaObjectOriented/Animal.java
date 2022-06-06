package _01JavaObjectOriented;

//基本类，动物
abstract class Animal{
    private String name;
    private int id;
    public Animal(){
        name="";
        id=0;
    }

    public Animal(String name,int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void eat(){
        System.out.println(name+"正在吃");
    }

    public void eat(String food){
        System.out.println(name+"正在吃"+food);
    }

    public void sleep(){
        System.out.println(name+"正在睡");
    }

    public void sleep(String place){
        System.out.println(name+"正在"+place+"睡");
    }

    public abstract void work();
}

interface creature{
    public void reproduction();
    public void born();
    public void die();
}


//老鼠类，继承动物类，终极的不可被继承的
final class Mouse extends Animal{
    public Mouse(String name,int id){
        super(name,id);
    }

    public void eat(){
        System.out.println("老鼠"+getName()+"正在吃");
    }

    public void eat(String food){
        System.out.println("老鼠"+getName()+"正在吃"+food);
    }

    public void sleep(){
        System.out.println("老鼠"+getName()+"正在睡");
    }

    public void sleep(String place){
        System.out.println("老鼠"+getName()+"正在"+place+"睡");
    }

    @Override
    public void work() {
        System.out.println("老鼠"+getName()+"在挖地道");
    }
}

//猫类，继承动物类，终极的不可被继承的
final class Cat extends Animal{
    public Cat(String name,int id){
        super(name,id);
    }

    public void eat(){
        System.out.println("猫"+getName()+"正在吃");
    }

    public void eat(String food){
        System.out.println("猫"+getName()+"正在吃"+food);
    }

    public void sleep(){
        System.out.println("猫"+getName()+"正在睡");
    }

    public void sleep(String place){
        System.out.println("猫"+getName()+"正在"+place+"睡");
    }

    @Override
    public void work() {
        System.out.println("猫"+getName()+"在找老鼠");
    }
}
