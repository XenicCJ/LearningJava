package _07Loop;

public class BreakContinueTest {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        String[] strings={"Jerry","Mesa","Dickson","Zua"};
        for(int number:numbers){
            if(number==40)
                //break用于跳出循环
                break;
            System.out.println("number: "+number);
        }
        for(String string:strings){
            if(string.compareTo("Dickson")==0)
                //continue用于跳过本次循环，进入下一次循环
                continue;
            System.out.println("string: "+string);
        }
    }
}
