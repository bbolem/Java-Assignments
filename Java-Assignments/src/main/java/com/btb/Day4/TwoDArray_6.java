package com.btb.Day4;
public class TwoDArray_6 {
    public static void main(String[] args) {
        int intArr[][] = {
                {1,2,3},
                {2,3,4},
                {3,4,5}
        };

        for (int i = 0; i < intArr.length; i++){
            for (int j = 0; j < intArr[i].length; j++){
                System.out.print(intArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
