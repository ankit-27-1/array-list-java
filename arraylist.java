import java.util.ArrayList;
import java.util.Scanner;
public class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(10);
        /*
        list.add(10);
        list.add(20);
        System.out.println(list);
        list.set(0,99);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.contains(10));
        */
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
    }
}
