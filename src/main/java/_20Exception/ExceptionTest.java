package _20Exception;

import java.io.*;
import java.rmi.RemoteException;

//一个自定义异常类，当余额不足时抛出
class OutOfFundException extends Exception{
    //缺少的资金
    private double amount;

    //构造方法
    public OutOfFundException(double amount){
        this.amount=amount;
    }

    public double getAmount() {
        return amount;
    }
}

class BankAccount{
    //账户余额
    private double amount;
    private String accountID;

    public BankAccount(){
        amount=0;
        accountID="";
    }

    public BankAccount(double amount,String id){
        this.amount=amount;
        this.accountID=id;
    }

    //存钱
    public void deposit(double amount){
        this.amount+=amount;
    }

    //取钱
    public void withdraw(double amount) throws OutOfFundException {
        if(amount<=this.amount){
            this.amount-=amount;
        }else {
            double dif=amount-this.amount;
            throw new OutOfFundException(dif);
        }
    }

    //获取余额
    public double getAmount() {
        return amount;
    }

    //获取帐号
    public String getAccountID() {
        return accountID;
    }
}

public class ExceptionTest {
    //主动抛出异常测试函数
    public static void throwException() throws RemoteException{
        throw new RemoteException();
    }

    public static void main(String[] args) {
        //普通的try catch块测试
        try {
            int a[]=new int[2];
            System.out.println("访问第三个元素："+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        }
        //多重捕获块测试
        try {
            File file=new File("src/java/_20Exception/testFile.txt");
            InputStream is=new FileInputStream(file);
            byte x=(byte)is.read();
        }catch (FileNotFoundException e) {
            System.out.println("Exception thrown: "+e);
        }catch (IOException e){
            System.out.println("Exception thrown: "+e);
        }
        //主动抛出异常测试
        try {
            throwException();
        }catch (RemoteException e) {
            System.out.println("Exception thrown: "+e);
        }
        //finally测试
        try {
            int a[]=new int[2];
            System.out.println("访问第三个元素："+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        }finally {
            System.out.println("finally块中的内容总是会被执行");
        }
        //try with resources用于自动管理资源声明和关闭
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>"+line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }

        //银行测试
        BankAccount account=new BankAccount(1000,"1234567890");
        try {
            System.out.println("取钱200...");
            account.withdraw(200);
            System.out.println("取钱300...");
            account.withdraw(300);
            System.out.println("取钱400...");
            account.withdraw(400);
            System.out.println("取钱500...");
            account.withdraw(500);
        }catch (OutOfFundException e){
            System.out.println("余额不足，差额为："+e.getAmount());
        }
    }
}
