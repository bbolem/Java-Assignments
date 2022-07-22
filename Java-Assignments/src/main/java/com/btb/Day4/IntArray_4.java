package com.btb.Day4;
public class IntArray_4 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int evenTotal = 0, oddTotal = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] =  (int)(Math.random() * 20)+1;
            System.out.print(arr[i] + " ");

            if (arr[i] % 2 == 0){
                evenTotal += arr[i];
            }
            else {
                oddTotal += arr[i];
            }
        }
        System.out.println("\nSum of Even numbers: " + evenTotal);
        System.out.println("Sum of Odd numbers: " + oddTotal);
    }
}
