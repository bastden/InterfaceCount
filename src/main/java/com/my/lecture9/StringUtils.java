package com.my.lecture9;

import com.my.Person;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class StringUtils {

    public boolean isEmptyString(String toCheck){
        if(toCheck.isEmpty()) {
            return true;
        }
        return false;
    }

    public boolean isThereNumbersInSring(String str){
        if(str.contains("\\d")){
            return true;
        }
        return false;
    }

    public boolean isStringMatchesPattern(String str, String pattern){
        if(str.matches(pattern)){
            return true;
        }
        return false;
    }

    public String removeAllCharacters(String str, String toDelete){
        String result = str.replaceAll(toDelete, "");
        return result;
    }

    public List<String> createListSring(String str, String delimiter){
        List<String> list = Arrays.asList(str.split(delimiter));
        return list;
    }

    public int howManyWordInString(String str){
        String[] array = str.split(" ");
        int result = array.length;
        return result;
    }

    public String addCurrentDate(String str) {
        long start = System.currentTimeMillis();
        System.out.println(start);
        String result = str + new Date();
        long duration = System.currentTimeMillis() - start;
        System.out.println(duration);
        return result;
    }

    public boolean checkStringTheSame(String str1, String str2) {
        boolean result = str1.equalsIgnoreCase(str2);
        return result;
    }

    public boolean checkRepeatable(String str) {
        List<String> list = createListSring(str, " "); // "Hello from the future"
        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                String elementCheck = list.get(j);
                if (i != j && element.equals(elementCheck)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String reverseString(String str) { //'a''b''c' > cba
        char[] array = str.toCharArray();
        String result = "";
        for (int i = 0; i < array.length; i++) {
            result = array[i] + result;
        }
        result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public String convertPersonToString(Person person) {
        String result = person.name + person.age;
        return result;
    }

}
