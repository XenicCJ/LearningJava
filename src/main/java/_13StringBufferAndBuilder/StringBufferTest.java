package _13StringBufferAndBuilder;

public class StringBufferTest {
    public static void main(String[] args) {
        //StringBuffer类是线程安全的，与String不同，StringBuffer类的内容是可变的
        StringBuffer sBuffer=new StringBuffer();
        //插入字符串测试
        sBuffer.append("Chadwin");
        sBuffer.append(" ");
        sBuffer.append("Sean");
        System.out.println(sBuffer);
        //反转测试
        System.out.println(sBuffer.reverse());
        sBuffer.reverse();
        System.out.println(sBuffer);
        //插入数字的字符串形式测试
        sBuffer.insert(8,1234);
        System.out.println(sBuffer);
        //插入字符串测试
        sBuffer.insert(8,"some numbers");
        System.out.println(sBuffer);
        //替换测试
        sBuffer.replace(8,24,"name");
        System.out.println(sBuffer);
        //删除测试
        sBuffer.delete(8,12);
        System.out.println(sBuffer);
        //显示容量
        System.out.println(sBuffer.capacity());
        //确保最小容量，如果指定容量小于原容量两倍+2，则设定为两倍+2
        sBuffer.ensureCapacity(50);
        System.out.println(sBuffer.capacity());
        //设置字符序列长度
        sBuffer.setLength(7);
        System.out.println(sBuffer);
        sBuffer.setLength(12);
        System.out.println(sBuffer);
        //不少方法与string的方法效果类似
    }
}
