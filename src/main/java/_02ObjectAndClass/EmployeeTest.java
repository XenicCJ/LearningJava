package _02ObjectAndClass;

/*
测试员工类
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建两个员工对象，并用构造函数初试化名字变量
        Employee employee1=new Employee("employee1");
        Employee employee2=new Employee("employee2");

        //设置两个员工对象的变量值
        employee1.setAge(23);
        employee1.setDesignation("大佬");
        employee1.setSalary(10000.1);

        employee2.setAge(26);
        employee2.setDesignation("萌新");
        employee2.setSalary(33333.3);

        //用员工对象自带的方法输出对象变量内容
        employee1.printInfo();
        employee2.printInfo();
    }
}
