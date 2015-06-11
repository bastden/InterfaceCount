package com.my;

import java.util.ArrayList;
import java.util.List;

public class CriteriaTask {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(333);
        list.add(4444);
        list.add(55555);

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            int poradok = 0;
            while (element > 0) {
                poradok++;
                element = element / 10;
            }
            if (poradok > 3) {
                System.out.println(list.get(i));
                count++;
            }
        }
        System.out.println(count);

    }

}
