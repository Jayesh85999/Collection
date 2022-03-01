
 package com.simplylearn.collection;

 import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();

        list.add("jay");
        list.add("ajay");
        list.add("vijay");
        list.add("sujay");

        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        System.out.println("size"+list.size());

        //print element using for each loop
        for(String s:list)
        {
            System.out.println(s);
        }

    }

}