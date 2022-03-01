
package com.simplylearn.collection;

        import java.util.HashSet;

public class HashetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<String>();

        set.add("jay");
        set.add("ajaye");
        set.add("vijay");
        set.add("sujay ");
        set.add("jayojay");
        //no oder maintain
        System.out.println(set);
        //no duplicated allowed
        set.add("known");

        System.out.println(set);

        System.out.println("Is Empty"+set.isEmpty());
        set.remove("kusum");

        System.out.println("size"+set.size());
        set.add(null);
        System.out.println(set);

    }

}