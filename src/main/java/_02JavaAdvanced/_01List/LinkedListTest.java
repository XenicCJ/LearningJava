package _02JavaAdvanced._01List;

import java.util.LinkedList;

public class LinkedListTest {
    public static void printLinkedList(LinkedList<String> list){
        for(int i=0;i<list.size();i++){
            System.out.println("第个"+(i+1)+"元素是："+list.get(i));
        }
    }

    public static void main(String[] args) {
        //创建列表实例
        LinkedList<String> stringLinkedList=new LinkedList<String>();
        stringLinkedList.add("Google");
        stringLinkedList.add("Microsoft");
        stringLinkedList.add("Apple");
        stringLinkedList.add("Bytedance");
        stringLinkedList.add("Wangyi");
        System.out.println("链表内容："+stringLinkedList);
        //在链表头和尾添加元素
        stringLinkedList.addFirst("IBM");
        stringLinkedList.addLast("Huawei");
        System.out.println("链表内容："+stringLinkedList);
        //删除链表头尾元素
        stringLinkedList.removeFirst();
        stringLinkedList.removeLast();
        System.out.println("链表内容："+stringLinkedList);
        //输出链表头尾元素
        System.out.println("链表头部元素："+stringLinkedList.getFirst());
        System.out.println("链表最后元素："+stringLinkedList.getLast());
        //用迭代方式输出元素
        printLinkedList(stringLinkedList);
    }
}
