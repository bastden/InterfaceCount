package com.my;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainMap {

    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();
        users.put(1234, "Petrov Ivan");
        users.put(1235, "Ivanov Ivan");
        users.put(1236, "Sidorov Ivan");
        users.remove(1235);
        System.out.println(users.get(1234));
        Set<Integer> keys = users.keySet();

    }

    // 1234 = "Petrov Ivan"
    // 1235 = "Ivanov Ivan"
    // 1236 = "Sidorov Ivan"
    // show.window = false
}
