package com.tahauddin.syed;

import java.util.Arrays;

/**
 * first Data Structure Program.
 * created an Integer Array[10]
 * and loop through it to display its value.
 */
public class App {

    /**
     * steps to retrieve the value from index is constant as int occupies 4 bytes
     * so if first value is at 12th address intArray[0] = 12th Address
     * then intArray[6] = 12 + (6 * 4) = 12 + 24 = 36th Address
     * it remains the same if we have hundereds of values in array or million.
     * only 3 steps.
     * @param args
     */
    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        intArray[5] = 60;
        intArray[6] = 70;
        intArray[7] = 80;
        intArray[8] = 90;
        intArray[9] = 100;
        Arrays.stream(intArray).forEach(System.out:: println);

        /**
         * retrieving value from array by value;
         * we consider it as a linear search
         * as the array size increases then the search will increases.
         * we consider that the value might be at the last index, so we take
         * worst case scenario in this case
         */
        int index = -1;
        for(int i = 0; i< intArray.length; i++){
            if(intArray[i] == 50){
                index =  i;
                break;
            }
        }
        System.out.println(index);
    }
}
