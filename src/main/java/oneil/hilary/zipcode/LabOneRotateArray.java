package oneil.hilary.zipcode;

import java.util.Arrays;

/**
 * Created by hilaryoneil on 1/18/17.
 */
public class LabOneRotateArray {


    public static void main(String [] args){
        int[] myArray = new int[]{1,2,3,4,5,6,7};
        int k = 2;
        System.out.println("Input: " + Arrays.toString(myArray));

        for(int i = 0; i < k; i++) {
            for (int j = 0; j < myArray.length - 1; j++) {
                int x = myArray[j];
                myArray[j] = myArray[j + 1];
                myArray[j + 1]= x;
                }
        }
        System.out.println("Output:" + Arrays.toString(myArray));
   }
}

