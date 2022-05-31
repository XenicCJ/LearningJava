package _14Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {
    //仅输出数组
    public static void printArray(double[] array){
        for (double i:
                array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    //升序排列并输出
    public static void printSortedArray(double[] array){
        double[] sortArray=new double[array.length];
        for(int i=0;i<array.length;i++){
            sortArray[i]=array[i];
        }
        for(int i=sortArray.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(sortArray[j]>sortArray[j+1]){
                    double c=sortArray[j];
                    sortArray[j]=sortArray[j+1];
                    sortArray[j+1]=c;
                }
            }
        }
        printArray(sortArray);
    }

    //升序排列数组，不输出，返回数组
    public static double[] sortArray(double[] array){
        double[] sortArray=new double[array.length];
        for(int i=0;i<array.length;i++){
            sortArray[i]=array[i];
        }
        for(int i=sortArray.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(sortArray[j]>sortArray[j+1]){
                    double c=sortArray[j];
                    sortArray[j]=sortArray[j+1];
                    sortArray[j+1]=c;
                }
            }
        }
        return sortArray;
    }

    public static void main(String[] args) {
        //声明并填写数组内容
        int size = 5;
        double[] doubleArray = new double[size];
        doubleArray[0] = 3.5;
        doubleArray[1] = 3.2;
        doubleArray[2] = 10.9;
        doubleArray[3] = 2.2;
        doubleArray[4] = 190;
        //输出所有元素
        System.out.println("所有元素：");
        for (double i :
                doubleArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        //计算数组内容之和并且输出
        double sum = 0;
        for (double i :
                doubleArray) {
            sum += i;
        }
        System.out.println("数组内容之和为：" + sum);
        //查找最大元素
        double max = doubleArray[0];
        for (double i :
                doubleArray) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("最大元素为：" + max);
        //函数调用数组
        System.out.println("输出排序后数组：");
        ArrayTest.printSortedArray(doubleArray);
        //使用函数返回值来使数组排序，然后输出
        doubleArray = sortArray(doubleArray);
        printArray(doubleArray);
        //一个不整齐的二维数组
        String[][] s = new String[2][];
        s[0] = new String[2];
        s[1] = new String[3];
        s[0][0] = "You";
        s[0][1] = "r";
        s[1][0] = "so";
        s[1][1] = "hot";
        s[1][2] = "!";
        //输出内容
        System.out.println("输出一个二维数组内容：");
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                System.out.print(s[i][j] + " ");
            }
        }
        System.out.println("");
        //Array类测试
        double[] doubleArray1 = new double[size];
        doubleArray1[0] = 3.5;
        doubleArray1[1] = 3.2;
        doubleArray1[2] = 10.9;
        doubleArray1[3] = 2.2;
        doubleArray1[4] = 190;
        //给数组排序
        Arrays.sort(doubleArray1);
        printArray(doubleArray1);
        //给数组每个元素赋指定值
        Arrays.fill(doubleArray1, 6.66);
        printArray(doubleArray1);
        //查找数组中是否包含指定值的对象
        Arrays.binarySearch(doubleArray1, 6.66);
    }
}
