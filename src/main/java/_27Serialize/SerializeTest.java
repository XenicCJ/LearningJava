package _27Serialize;

import _02ObjectAndClass.Employee;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args) {
        //对象序列化为文件
        Employee e=new Employee("小明");
        e.setAge(25);
        e.setDesignation("Develop");
        e.setSalary(20000);
        try
        {
            FileOutputStream fileOut =
                    new FileOutputStream("src/main/java/_27Serialize/tmp.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in src/main/java/_27Serialize/tmp.ser");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
        //文件反序列化为对象
        Employee e1 = null;
        try
        {
            FileInputStream fileIn = new FileInputStream("src/main/java/_27Serialize/tmp.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e1 = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return;
        }
        e1.printInfo();
    }
}
