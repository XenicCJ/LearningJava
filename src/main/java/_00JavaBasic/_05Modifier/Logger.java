package _00JavaBasic._05Modifier;

//默认权限的接口，同一包内可见
interface LoggerInterface{
    //默认权限的接口静态常量，同一包内可见
    String staticLog="This is the public log";
}

//默认权限的抽象类，同一包内可见，并且不可以对象化
abstract class CompanyInfo{
    String companyName;

    //抽象方法，被继承后必须实现
    public abstract String getCompanyName();
}

//常类，不可以被继承
public final class Logger extends CompanyInfo implements LoggerInterface{
    protected static long loggerAmount=0;
    String companyName;
    //默认权限，同一包内可见
    String loggerInfo;
    //私有权限，仅该类内可见
    private String logContent;
    //公共变量，所有其他类可访问
    public String loggerNum;
    //保护权限，对同一包内的类和所有子类可见，不同包的子类不可以直接访问该类对象的protected变量或方法，使用对象：变量、方法
    //静态常量
    protected static final String publicKey="J7dsNJKLi9inmsaqTYXr";
    //私有权限，仅该类内可见
    //静态常量
    private static final String privateKey="Kd6T4as0omk";

    public void LoggerInterface(String loggerInfo){
        this.loggerInfo=loggerInfo;
        loggerAmount++;
    }

    //默认权限，同一包内可见
    void setLogInfo(String logInfo){
        this.loggerInfo=logInfo;
    }

    //私有方法，仅该类可见
    private String buildFullInfo(){
        String fullInfo="#publicKey:"+publicKey+"#privateKey:"+privateKey+"#logInfo:"+loggerInfo;
        return fullInfo;
    }

    //保护权限方法，对同一包内的类和所有子类可见，不同包的子类不可以直接访问该类对象的protected变量或方法
    protected String getPublicKey(){
        return publicKey;
    }

    //公有方法，所有类可见
    public String getFullInfo(String key){
        if(key.compareTo(privateKey)==0){
            return buildFullInfo();
        }else{
            return "#WRONGKEY";
        }
    }

    public String getCompanyName(){
        return companyName;
    }

    public static void main(String[] args) {
        Logger logger=new Logger();
        logger.setLogInfo("HelloWorld");
        String fullInfo=logger.getFullInfo("Kd6T4as0omk");
        System.out.println("logger full info: "+ fullInfo);
    }
}
