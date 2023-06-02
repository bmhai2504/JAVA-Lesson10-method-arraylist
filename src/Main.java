import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyList myList=new MyList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        System.out.println(myList.remove(3));
        System.out.println(myList.size());
//        myList.clear();
        for (int i=0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
    }
}