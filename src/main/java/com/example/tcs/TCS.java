package com.example.tcs;

import java.util.*;
import java.util.stream.Collectors;

public class TCS {


    public static void main(String arg []) {
        HashMap<String,Integer> books = new HashMap<>();
        books.put("Java",500);
        books.put("HTML",300);
        books.put("CSS",200);
        books.put("Python",800);
        books.put(".Net",600);

        System.out.println(books);

        //Task is to sort this hashmap based on value

        //Convert map to stream
        HashMap<String,Integer> sortedBook = books.entrySet().stream().compare((e1,e2) -> e1.value().compare(e2.value())).collect(Collectors.toMap());
        
        System.out.println(sortedBook);
        //Apply Intermediate comparator Based on Price
        //terminal Operation to collection new Values
        
        System.out.println(books);
    }
}


