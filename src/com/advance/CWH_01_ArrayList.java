package com.advance;

import java.util.ArrayList;

public class CWH_01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();

        a2.add(12);
        a2.add(14);
        a2.add(16);

        a1.add(30);
        a1.add(32);
        a1.add(34);
        a1.add(36);

        a1.add(0,4);
        a1.add(0,6);

        a1.addAll(0, a2);

        System.out.println(a1.contains(34));
        System.out.println(a1.indexOf(30));
        System.out.println(a1.lastIndexOf(30));

//        a1.clear();

        a1.set(1, 69);
        for (int i = 0; i < a1.size(); i++){
            System.out.println(a1.get(i));
            System.out.println(", ");
        }
    }
}
