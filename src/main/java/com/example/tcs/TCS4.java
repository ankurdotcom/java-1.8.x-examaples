package com.example.tcs;


public class TCS4 {

    public static void main(String[] arg) {

        // Array  [1,5,7,3,4]
        // Search target number and return the index of that number

        final int[] input = {1,5,7,3,4};

        int output = new TCS4().getIndex(4, input);

        System.out.println(output);
    }

    public int getIndex(int search , int[] input){

        int result = -1;

        for (int i = 0 ; i < input.length ; i++) {
        
         //find the number
          if (input [i] == search ) {
            
            result = i;
            break;
          }
         
        }
                return result;
       }
    
}
