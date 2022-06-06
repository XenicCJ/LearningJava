package _02JavaAdvanced._03Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    //创建测试集合
    public static void main(String[] args) {
        ArrayList<String> stringArrayList=new ArrayList<String>();
        stringArrayList.add("Google");
        stringArrayList.add("Huawei");
        stringArrayList.add("XiaoMi");
        stringArrayList.add("ZhongXing");
        stringArrayList.add("Microsoft");
        //创建迭代器
        Iterator<String> it=stringArrayList.iterator();
        //输出迭代器的第一个元素
        System.out.println("迭代器输出第一个元素："+it.next());
        //迭代器输出所有元素
        it=stringArrayList.iterator();
        while(it.hasNext()){
            System.out.println("迭代器输出元素："+it.next());
        }
        //删除所有长度大于6的元素并输出
        it=stringArrayList.iterator();
        while(it.hasNext()){
            String str=it.next();
            if(str.length()>6){
                it.remove();
            }
        }
        it=stringArrayList.iterator();
        while(it.hasNext()){
            System.out.println("删除长元素后迭代器输出元素："+it.next());
        }
    }
}
