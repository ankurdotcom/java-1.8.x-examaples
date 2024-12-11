package com.example.tcs;

import java.util.*;
// import java.util.stream.Collectors;

public class TCS {


    public static void main(String[] arg) {
        Map<String,Integer> books = new HashMap<>();
        books.put("Java",500);
        books.put("HTML",300);
        books.put("CSS",200);
        books.put("Python",800);
        books.put(".Net",600);

        System.out.println(books);

        //Task is to Maintain Insert Order in this map based on key

        Map<String,Integer> booksMaintainInsertOrder = new LinkedHashMap<>(books);
        //booksMaintainInsertOrder.put("Java",500);
        //booksMaintainInsertOrder.put("HTML",300);
        //booksMaintainInsertOrder.put("CSS",200);
        //booksMaintainInsertOrder.put("Python",800);
        //booksMaintainInsertOrder.put(".Net",600);

        System.out.println(booksMaintainInsertOrder);

        //Task is to Automatically Sort map based on key
        // In natural Order

        Map<String,Integer> booksMaintainInsertOrder2 = new TreeMap<>(books);
        //booksMaintainInsertOrder2.put("Java",500);
        //booksMaintainInsertOrder2.put("HTML",300);
        //booksMaintainInsertOrder2.put("CSS",200);
        //booksMaintainInsertOrder2.put("Python",800);
        //booksMaintainInsertOrder2.put(".Net",600);

        System.out.println(booksMaintainInsertOrder2);


        //Task is to sort first hashmap based on value

        //Convert map to stream
        //Map<String,Integer> sortedBook = books.entrySet().stream().compare((e1,e2) -> e1.value().compare(e2.value())).collect(Collectors.toMap());
        
        Map<String,Integer> sortedBook = new TreeMap<>(Comparator.comparing(books::get));
        sortedBook.putAll(books);

        System.out.println(sortedBook);
        //Apply Intermediate comparator Based on Price
        //terminal Operation to collection new Values
    }
}


