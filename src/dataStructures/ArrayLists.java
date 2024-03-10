package dataStructures;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Maria");
        arrayList.add("Tawfiq");
        System.out.println(arrayList);
        System.out.println(arrayList.getFirst());
        System.out.println(arrayList.get(1));
        arrayList.clear();
        System.out.println(arrayList);
        arrayList.add("Tim");
        arrayList.add("Chris");
        System.out.println(arrayList.size());
        arrayList.remove("Tim");
        System.out.println(arrayList);
        arrayList.add("Mary");
        arrayList.add("George");
        arrayList.add(2,"Henry");

        for(String c: arrayList){
            System.out.print(c+"\t");
        }

    }
}
