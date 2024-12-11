package com.example.tcs;

public class TCS5 {
    ///Array  [1....100]
    // Number is divisible by 3 print ABC
    // If Number is 5 >> XYZ
    // if Number is Divisible by 15

    public static void main(String[] arg) {
        final int[] numbers = new int[100];

    for (int i = 0; i < 100; i++) {
        numbers[i] = i + 1;
    }

    new TCS5().printSomething(numbers);
    
    }


    public void printSomething(int[] input){

        for (int i = 0 ; i < input.length ; i++) {
        
         // 15 is Mutltiple of 3 and 5 so check both condition is be equivalent
          
          if (input [i] % 3 == 0  && input [i] % 5 == 0) {
             System.out.println("Number is Divisible by 15");
          } else if (! (input [i] % 5 == 0) && input [i] % 3 == 0)  {
           System.out.println("ABC");
          } else if (input [i] % 5 == 0 && !(input [i] % 3 == 0 ) )  {
           System.out.println("XYZ");
          }
         
        }
                return;
       }

}
