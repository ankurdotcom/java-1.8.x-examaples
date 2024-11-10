package com.example.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * How to find pairs in an array whose sum is equal to the given number?
 *
 * Example - if the given array is (2,6,3,9,11) and the given number is 9,
 * output would be (6,3)
 */

public class Interview {


    public static void main (String[] arg) {

        List<Integer> numberArray = Arrays.asList(0,2,6,3,9,11,18);

        int input = 9;

        List<Integer> outPutArray = new ArrayList<>();

        for(int i = 0; i < numberArray.size(); i++ ){

            int diff = input - numberArray.get(i);
            if( Math.abs(diff) >= 0  ) {
                if(numberArray.contains(diff) && diff != input){
                    outPutArray.add(diff);
                }
            }
        }



        System.out.println(outPutArray);

       //  System.out.println (numberArray.stream().filter(e -> Math.abs(input - e) >= 0).toList());
    }

}
