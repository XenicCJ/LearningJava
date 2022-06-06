package _02JavaAdvanced._02Hash;

import java.util.HashMap;

//hashmap测试
public class HashMapTest {
    public static void main(String[] args) {
        //创建一个HashMap对象
        HashMap<Integer,String> intStrHashMap=new HashMap<Integer,String>();
        intStrHashMap.put(1,"Google");
        intStrHashMap.put(2,"Alibaba");
        intStrHashMap.put(3,"Microsoft");
        intStrHashMap.put(4,"Tencent");
        intStrHashMap.put(5,"ByteDance");
        //直接输出
        System.out.println(intStrHashMap);
        //输出第三个元素
        System.out.println(intStrHashMap.get(2));
        //删除第二个元素然后输出
        intStrHashMap.remove(1);
        System.out.println(intStrHashMap);
        //清除所有元素
        intStrHashMap.clear();
        System.out.println(intStrHashMap);
        //恢复内容
        intStrHashMap.put(1,"Google");
        intStrHashMap.put(2,"Alibaba");
        intStrHashMap.put(3,"Microsoft");
        intStrHashMap.put(4,"Tencent");
        intStrHashMap.put(5,"ByteDance");
        //迭代输出所有元素
        for(Integer i:intStrHashMap.keySet()){
            System.out.println("Key: "+i+";Value: "+intStrHashMap.get(i));
        }
        //迭代输出所有值
        for(String str:intStrHashMap.values()){
            System.out.println("Value: "+str);
        }
    }
}
