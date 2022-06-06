package _02JavaAdvanced._05Generics;

import java.util.ArrayList;

//一个简单的泛型类
class Box<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

public class GenericsTest {
    //创建一个泛型方法，用来打印各种数组
    public static <E> void printArray(E[] array){
        for (E e:array){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    //比较三个值，返回最大值
    public static <T extends Comparable<T>> T maxOfThree(T x,T y,T z){
        T max=x;
        if(y.compareTo(max)>0)
            max=y;
        if(z.compareTo(max)>0)
            max=z;
        return max;
    }

    //类型通配符方法测试，输出第一个数据
    public static void printFirstData(ArrayList<?> list){
        System.out.println(list.get(0));
    }


    public static void main(String[] args) {
        //测试打印方法
        Integer[] intArray={10,20,30,40,50};
        Double[] doubleArray={2.2,4.4,5.5,6.6,7.7};
        Character[] charArray={'a','b','c','d','e'};

        System.out.println("输出整形数组:");
        printArray(intArray);
        System.out.println("输出浮点型数组:");
        printArray(doubleArray);
        System.out.println("输出字符数组:");
        printArray(charArray);

        //测试最大值方法
        System.out.printf("%d,%d,%d中的最大值为：%d\n",4,10,9,maxOfThree(4,10,9));
        System.out.printf("%.1f,%.1f,%.1f中的最大值为：%.1f\n",1.1,2.2,14.5,maxOfThree(1.1,2.2,14.5));
        System.out.printf("%s,%s,%s中的最大值为：%s\n","pear",
                "apple", "orange",maxOfThree("pear",
                        "apple", "orange"));

        //泛型类测试
        Box<String> stringBox=new Box<String>();
        Box<Integer> integerBox=new Box<Integer>();

        stringBox.setData(new String("一段文字"));
        integerBox.setData(new Integer(22));

        System.out.println("string盒子的内容："+stringBox.getData());
        System.out.println("integer盒子的内容："+integerBox.getData());

        //使用通配符的函数测试
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<Integer>();
        ArrayList<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        printFirstData(name);
        printFirstData(age);
        printFirstData(number);
    }
}
