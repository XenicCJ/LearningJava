package _06Operator;

class Vehicle{

}

class Car extends Vehicle{

}

public class InstanceOf {
    public static void main(String[] args) {
        Vehicle v=new Car();
        //类型判断运算符的测试
        boolean b=v instanceof Car;
        System.out.println("b="+b);
    }
}
