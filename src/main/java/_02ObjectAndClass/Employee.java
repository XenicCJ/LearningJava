package _02ObjectAndClass;

//引入需要使用的类，这样在使用的时候可以忽略包名、精简代码
import java.io.Serializable;

/*
员工类，可序列化
 */
public class Employee implements Serializable {
    //包含四个变量：名字、年龄、职责、薪资
    String name;
    int age;
    String designation;
    double salary;

    //一个构造方法
    public Employee(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo(){
        System.out.println("name: "+this.name);
        System.out.println("age: "+this.age);
        System.out.println("designation: "+this.designation);
        System.out.println("salary: "+this.salary);
    }
}
