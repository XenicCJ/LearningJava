package _00JavaBasic._16RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正则表达式测试
public class RegularExpressionTest {
    //查找子串
    private static void searchSubString(){
        String content="Im a noob from runoob";
        String pattern=".*noob.*";
        System.out.println("字符串中是否包含匹配串："+ Pattern.matches(pattern,content));
    }
    //查找一个数字串
    private static void searchNumber(){
        //目标串与匹配串
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";
        //创建模式对象
        Pattern r=Pattern.compile(pattern);

        //创建匹配对象并匹配
        Matcher m=r.matcher(line);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }
    }
    public static void main(String[] args) {
        searchSubString();
        searchNumber();
    }

}
