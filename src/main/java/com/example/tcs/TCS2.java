package com.example.tcs;

import java.util.LinkedHashMap;
import java.util.Map;

public class TCS2 {
    public static void main(String[] args) {
        // Assume that the given array A is A = [1, 2, 2, 0, 1, 0, 0, // 2, 0, 1, 2, 0]
        // and the expected out in aray format is A = [2, 2, 2, 2, 0, 0, 0, // 0, 0, 1, 1, 1]

        // Questions :
        // 1 ,2, 0 digists are only used digits, And We dont need to check it.

         
        // Tracker in HashMap (Number , Count)
        // Array with same size as original One
        // Print the array Based On Tacker Info
    }


    public int[] sortArray(int[] inputArray){
        
        //TODO validation On Input
        if(inputArray.length == 0){
            return new int[] {};
        }
        
        int length = inputArray.length;
        int[] outPutArray = new int[length];
        
        Map<Integer, Integer> tracker = new LinkedHashMap<>();
        tracker.put(2,0);
        tracker.put(0,0);
        tracker.put(1,0);
        
        for (int i = 0; i < length ; i++) {
            
            if(inputArray[i] == 2 ) {
                 int count = tracker.get(2);
                 tracker.put(2, count++);
            } else if (inputArray[i] == 1 ) {
                int count = tracker.get(1);
                tracker.put(1, count++);
            } else if(inputArray[i] == 0 ) {
                int count = tracker.get(0);
                tracker.put(0, count++);
            } else {
                System.out.println("Invalid Input");
            }
           
        }
        
        int outPutCounter = 0;
//        foreach (tracker t) {
//            int value = t.value();
//            int key = t.key();
//            for (int j = 0; j < value ; j ++)
//            {
//                outPutArray[outPutCounter] = key;
//                outPutCounter++
//            }
//        }
        
        
        
        return outPutArray;

    }

    public int[] sortArray_updated(int[] inputArray ){
        
        //TODO validation On Input
        if(inputArray.length == 0){
            return new int[] {};
        }
        
        int length = inputArray.length;
        int[] outPutArray = new int[length];
        
        Map<Integer, Integer> tracker = new LinkedHashMap<>();
        tracker.put(2,0);
        tracker.put(0,0);
        tracker.put(1,0);
        
        // for(int i = 0 , k = length -1 ; i < length; i++) {
            
//            if(i = 0 && inputArray[i] == 2 ) {
//                 int count = tracker.get(2);
//                 tracker.put(2, count ++);
//            }else {
//
//            }
           
        //}
        
        int outPutCounter = 0;

//        foreach (tracker t) {
//            int value = t.value();
//            int key = t.key();
//            for (int j = 0; j < value ; j ++)
//            {
//                outPutArray[outPutCounter] = key;
//                outPutCounter++
//            }
//        }
        
        
        
        return outPutArray;

    }
}
