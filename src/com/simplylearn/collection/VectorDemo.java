package com.simplylearn.collection;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<String>();
        vector.add("blue");
        vector.add("green");
        vector.add("yellow");

        System.out.println(vector.get(2));

        System.out.println("Size: "+vector.size());

        System.out.println(vector);
    }


}