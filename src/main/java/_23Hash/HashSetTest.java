package _23Hash;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        //创建哈希组并加入元素输出
        HashSet<String> stringHashSet=new HashSet<String>();
        stringHashSet.add("Google");
        stringHashSet.add("Microsoft");
        stringHashSet.add("Apple");
        stringHashSet.add("Bytedance");
        stringHashSet.add("Wangyi");
        System.out.println(stringHashSet);
        //判断元素是否存在
        System.out.println("元素是否存在："+stringHashSet.contains("Apple"));
        //删除一个元素
        stringHashSet.remove("Wangyi");
        System.out.println(stringHashSet);
        //删除所有元素
        stringHashSet.clear();
        System.out.println(stringHashSet);
        //回复
        stringHashSet.add("Google");
        stringHashSet.add("Microsoft");
        stringHashSet.add("Apple");
        stringHashSet.add("Bytedance");
        stringHashSet.add("Wangyi");
        //计算大小
        System.out.println("元素大小："+stringHashSet.size());
        //迭代
        for (String str:stringHashSet){
            System.out.println("元素内容："+str);
        }
    }
}
