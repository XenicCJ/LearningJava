package _02JavaAdvanced._01List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    //输出列表内容
    public static void printArrayList(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            System.out.println("第个"+(i+1)+"元素是："+list.get(i));
        }
    }

    public static void main(String[] args) {
        //创建一个字符串的arraylist，加入元素，并输出
        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("Google");
        stringArrayList.add("Huawei");
        stringArrayList.add("Xiaomi");
        stringArrayList.add("Microsoft");
        System.out.println("列表内容："+stringArrayList);
        //访问列表的第三个元素
        System.out.println("第三个元素："+stringArrayList.get(2));
        //修改第二个元素并输出
        stringArrayList.set(1,"Baidu");
        System.out.println("列表内容："+stringArrayList);
        //删除第四个元素并输出
        stringArrayList.remove(3);
        System.out.println("列表内容："+stringArrayList);
        //输出列表大小
        System.out.println("列表大小："+stringArrayList.size());
        //遍历列表并输出内容
        printArrayList(stringArrayList);
        for(String str:stringArrayList){
            System.out.println("列表内容："+str);
        }
        //排序并输出
        Collections.sort(stringArrayList);
        printArrayList(stringArrayList);
    }
}
