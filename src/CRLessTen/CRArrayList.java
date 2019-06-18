package CRLessTen;

import java.util.*;

public class CRArrayList {
    private static Object Circle;

    public static void main(String[] args) {

        List<String> intOb = new ArrayList<>();

        intOb.add("qw");
        intOb.add("qw");
        intOb.add("qw");
        intOb.add("qw");
        intOb.add("qw");

        for (String q : intOb) {
            System.out.println(q);
        }

        List<Object> objAll = new LinkedList<>();
        objAll.add(1);
        objAll.add("string");
        objAll.add(Circle);

        for (int w = 0; w < objAll.size(); w++) {
            System.out.println(objAll.get(w));
        }

        List<Integer> intAr = new ArrayList<>();
        intAr.add(1);
        intAr.add(3);
        intAr.add(20);
        intAr.add(10);

        CRArrayList stre = new CRArrayList();
        stre.intArM(intAr);


        Set<String> setStr = new TreeSet<String>();

        setStr.add("Apple");
        setStr.add("Apple");
        setStr.add("Apple");
        setStr.add("Dog");

        System.out.println(((TreeSet<String>) setStr).first());

        System.out.println(setStr.size());
        for (String q : setStr) {
            System.out.println(q);
        }
        Map map = new HashMap();
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"one / two");


        //map.clear();
        //map.containsKey(1); //false / true
        //map.containsValue(1); //false / true

        System.out.println(map.containsValue("one"));




    }

    void intArM(List<Integer> qwe) {
        Collections.sort(qwe);
        System.out.println(qwe);
    }
}
