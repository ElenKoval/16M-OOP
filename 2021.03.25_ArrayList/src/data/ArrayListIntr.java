package data;

import java.util.ArrayList;

public class ArrayListIntr {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());

        list.add("bbb");
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        list.add(0, "rrr");
        System.out.println(list.size());
        System.out.println(list);

        list.set(0, "New");
        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }
        list.add("New");
        System.out.println(list.indexOf("New"));
        System.out.println(list.lastIndexOf("New"));
        System.out.println(list.contains("New"));

        ArrayList<String> temp = new ArrayList<>();
        temp.add("1");
        temp.add("2");
        temp.add("3");
        list.addAll(temp);
        System.out.println(list);
        list.addAll(1, temp);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        list.removeAll(temp);
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(123);
        list2.add(1);
        list2.add(3);
        System.out.println(list2);


    }
}
