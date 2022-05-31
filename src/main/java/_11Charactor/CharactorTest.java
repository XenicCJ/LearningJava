package _11Charactor;

public class CharactorTest {
    public static void main(String[] args) {
        //Character类相关内容和方法的测试
        //转义序列
        System.out.println("\t一个tab");
        System.out.println("\b一个退格");
        System.out.println("\n一个换行");
        System.out.println("\r一个回车");
        System.out.println("\f一个换页符");
        System.out.println("\'\"\\单引号双引号反斜杠");

        //字符类对象的方法
        System.out.println();
        Character c1='8';
        Character c2='g';
        Character c3='C';
        //判断是否属于某一种类型的字符
        System.out.println("Character.isLetter(c1): "+Character.isLetter(c1));
        System.out.println("Character.isLetter(c2): "+Character.isLetter(c2));
        System.out.println("Character.isLetter(c3): "+Character.isLetter(c3));
        System.out.println("Character.isDigit(c1): "+Character.isDigit(c1));
        System.out.println("Character.isDigit(c2): "+Character.isDigit(c2));
        System.out.println("Character.isDigit(c3): "+Character.isDigit(c3));
        System.out.println("Character.isWhitespace(c1): "+Character.isWhitespace(c1));
        System.out.println("Character.isWhitespace(c2): "+Character.isWhitespace(c2));
        System.out.println("Character.isWhitespace(c3): "+Character.isWhitespace(c3));
        System.out.println("Character.isUpperCase(c1): "+Character.isUpperCase(c1));
        System.out.println("Character.isUpperCase(c2): "+Character.isUpperCase(c2));
        System.out.println("Character.isUpperCase(c3): "+Character.isUpperCase(c3));
        System.out.println("Character.isLowerCase(c1): "+Character.isLowerCase(c1));
        System.out.println("Character.isLowerCase(c2): "+Character.isLowerCase(c2));
        System.out.println("Character.isLowerCase(c3): "+Character.isLowerCase(c3));
        //转换一些形式
        System.out.println("Character.toUpperCase(c2): "+Character.toUpperCase(c2));
        System.out.println("Character.toLowerCase(c3): "+Character.toLowerCase(c3));
        System.out.println("Character.toString(c3): "+Character.toString(c3));

    }
}
