package com.btb.Day5;
public class UncheckedExceptionEx {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int i = Integer.parseInt(args[0]);
        int j = 0;

        try {
            j = Integer.parseInt(args[1]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            throw new ArrayIndexOutOfBoundsException();
        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("From finally block");
        }


        //int j = Integer.parseInt(args[1]);  //NumberFormatException when wrong input, ArrayIndexOutOfBoundsException when no input.
        System.out.println(i / j);  //ArithmeticException when dividing by 0.

    }
}
