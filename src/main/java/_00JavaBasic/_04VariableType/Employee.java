package _00JavaBasic._04VariableType;

public class Employee {
    //私有静态类变量 记录总员工数
    private static int employeeAmount=0;
    //公有静态类常量 记录员工部门
    public static final String department="Development Department";
    //一些私有对象变量，记录员工名字、年龄、岗位信息
    private String name;
    private int age;
    private String posts;

    public Employee() {
        employeeAmount++;
    }

    public Employee(String name) {
        employeeAmount++;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //函数参数age为局部变量
        this.age = age;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }

    public void printInfo(){
        System.out.println("employeeAmount: "+employeeAmount);
        System.out.println("department: "+department);
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("posts: "+posts);
    }

    public static void main(String[] args) {
        Employee employee1=new Employee("Xiao Ming1");
        Employee employee2=new Employee("Xiao Ming2");
        Employee employee3=new Employee("Xiao Ming3");
        Employee employee4=new Employee("Xiao Ming4");

        employee1.setAge(25);
        employee1.setPosts("Chief");
        employee1.printInfo();

    }
}
