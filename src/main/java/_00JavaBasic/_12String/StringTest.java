package _00JavaBasic._12String;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        //String类常用方法的测试
        String str1="Aurger King";
        String str2="Coca Cola";
        String str3="coca Cola Spirit";
        StringBuffer sb1=new StringBuffer(str1);
        char[] charSet={'a','b','c','d','e','f','g'};
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        System.out.println("str3: "+str3);
        System.out.println("sb1: "+sb1);
        System.out.println();

        //返回指定索引处的字符
        System.out.println("str1.charAt(5): "+str1.charAt(5));
        //字符串比较
        System.out.println("str1.compareTo(str2): "+str1.compareTo(str2));
        System.out.println("str2.compareTo(str3): "+str2.compareTo(str3));
        //忽略大小写的字符串比较
        System.out.println("str2.compareToIgnoreCase(str3): "+str2.compareToIgnoreCase(str3));
        //连接字符串
        System.out.println("str2.concat(str3): "+str2.concat(str3));
        //将String和StringBuffer的内容进行比较
        System.out.println("str1.contentEquals(sb1): "+str1.contentEquals(sb1));
        //将字符数组转化为String
        System.out.println("String.copyValueOf(charSet): "+String.copyValueOf(charSet));
        //截取字符串数组并转化为String
        System.out.println("String.copyValueOf(charSet): "+String.copyValueOf(charSet,1,5));
        //检查字符串是否以某个字符串结尾
        System.out.println("str1.endsWith(\"King\"): "+str1.endsWith("King"));
        //检查两个字符串内容是否相等，不一定要对象相同
        System.out.println("str1.equals(sb1.toString()): "+str1.equals(sb1.toString()));
        //忽略大小写的比较
        System.out.println("str1.equalsIgnoreCase(sb1.toString()): "+str1.equalsIgnoreCase(sb1.toString()));
        //将String编码为bytes数组
        System.out.println("str1.getBytes(StandardCharsets.UTF_8): "+str1.getBytes(StandardCharsets.UTF_8));
        byte[] bytes=str1.getBytes(StandardCharsets.UTF_8);
        System.out.println("转换后的内容：");
        for (byte b:bytes){
            System.out.print(b);
        }
        System.out.println();
        //将String编码为char数组
        char[] charSet0=new char[str1.length()];
        try {
            str1.getChars(0,str1.length(),charSet0,0);
            System.out.println("转换后的字符数组内容：");
            for(char c:charSet0){
                System.out.print(c);
            }
            System.out.println();
        }catch( Exception ex) {
            System.out.println("触发异常...");
        }
        //获取哈希码
        System.out.println("str1.hashCode(): "+str1.hashCode());
        //获取字符在字符串中第一次出现的位置
        System.out.println("str1.indexOf('K'): "+str1.indexOf('K'));
        //从指定位置开始搜索字符
        System.out.println("str1.indexOf('r',3): "+str1.indexOf('r',3));
        //获取字符串第一次出现的位置
        System.out.println("str1.indexOf(\"Co\"): "+str2.indexOf("Co"));
        //从指定索引开始搜索字符串第一次出现的位置
        System.out.println("str1.indexOf(\"Co\",2): "+str2.indexOf("Co",2));
        //字符串规范化
        System.out.println("str1.intern(): "+str1.intern());
        //返回参数内容在字符串中最后一次出现的索引
        System.out.println("str2.lastIndexOf(\"Co\"): "+str2.lastIndexOf("Co"));
        //和上面一样，但是从指定位置反向搜索
        System.out.println("str2.lastIndexOf(\"Co\",1): "+str2.lastIndexOf("Co",1));
        //返回字符串长度
        System.out.println("str1.length(): "+str1.length());
        //匹配正则表达式
        System.out.println("str1.matches(\"Aurger King\"): "+str1.matches("Aurger King"));
        //部分匹配
        System.out.println("str3.regionMatches(true,0,str2,0,9): "+str3.regionMatches(true,0,str2,0,9));
        //替换所有指定字符
        System.out.println("str2.replace('o','f'): "+str2.replace('o','f'));
        //用指定字符串替换所有正则匹配
        System.out.println("str2.replaceAll(\"Co\",\"Lala\"): "+str2.replaceAll("Co","Lala"));
        //用指定字符串替换首个正则匹配
        System.out.println("str2.replaceFirst(\"Co\",\"Lala\"): "+str2.replaceFirst("Co","Lala"));
        //根据正则匹配分割字符串,第二个参数可省略
        String[] strs=str3.split("a",2);
        System.out.println("分割测试：");
        for (String str:strs){
            System.out.println(str);
        }
        //测试字符串是否以参数字符串开始，第二个参数指定测试起始位置，可省略
        System.out.println("str1.startsWith(\"ger\",3): "+str1.startsWith("ger",3));
        //取子序列
        System.out.println("str3.subSequence(5,9): "+str3.subSequence(5,9));
        //取子字符串
        System.out.println("str3.substring(5,9): "+str3.substring(5,9));
        //转换为字符数组
        charSet0=str3.toCharArray();
        System.out.println("转换后的字符数组内容：");
        for(char c:charSet0){
            System.out.print(c);
        }
        System.out.println();
        //将字符串转换为大写或小写，参数为语言环境规则，如为英文环境课省略
        System.out.println("str1.toLowerCase(Locale.ROOT): "+str1.toLowerCase(Locale.ROOT));
        System.out.println("str1.toUpperCase(Locale.ROOT): "+str1.toUpperCase(Locale.ROOT));
        //以字符串形式返回对象
        System.out.println("str1.toString(): "+str1.toString());
        //返回去除首尾空格的字符串
        System.out.println("str1.trim(): "+str1.trim());
        //判断字符串是否为空
        System.out.println("str1.isEmpty(): "+str1.isEmpty());
        //判断字符串是否包含字符系列
        System.out.println("str1.contains(\"King\"): "+str1.contains("King"));
    }
}
