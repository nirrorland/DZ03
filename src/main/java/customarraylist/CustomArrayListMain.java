package customarraylist;

import customarraylist.arraylist.CustomArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class CustomArrayListMain {
    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList();
        arr.add("Sdasd");
        arr.add("Sdasd2");
        System.out.println(arr);

        System.out.println(arr.size());

        System.out.println(arr.isEmpty());

        CustomArrayList arr2 = new CustomArrayList();
        System.out.println(arr2.isEmpty());

        System.out.println(arr);
        arr.remove("Sdasd");
        System.out.println(arr);

        System.out.println(arr.contains("Sdasd"));
        System.out.println(arr.contains("Sdasd2"));
        System.out.println(arr.size());

        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("5");
        arr.add("6");
        arr.add("7");
        System.out.println(arr);

        LinkedList<String> str = new LinkedList<String>();
        str.add("1");
        str.add("2");
        str.add("3");
        System.out.println(arr.containsAll(str));
        str.add("4");
        System.out.println(arr.containsAll(str));

        LinkedList<String> str2 = new LinkedList<String>();
        str2.add("9");
        str2.add("10");

        arr.addAll(str2);
        System.out.println(arr);

        arr.removeAll(str);
        System.out.println(arr);

        arr.retainAll(str2);
        System.out.println(arr);


        System.out.println(arr.get(1));
        System.out.println(arr.get(2));

        arr.clear();
        System.out.println(arr);

        arr.add("1");
        arr.add("2");
        arr.add("3");
        arr.add("5");
        arr.add("6");
        arr.add("7");

        System.out.println(arr);

        arr.set(1,"10");
        arr.set(3,"11");

        System.out.println(arr);

        arr.add(2, "101");
        arr.add(4, "102");
        arr.add(4, "105");

        System.out.println(arr);
        System.out.println(arr.indexOf("102"));

        arr.add("102");
        System.out.println(arr);
        System.out.println(arr.lastIndexOf("102"));


    }

}

