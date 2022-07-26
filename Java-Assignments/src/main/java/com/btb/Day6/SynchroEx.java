package com.btb.Day6;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
public class SynchroEx {
    public static void main(String[] args) {

        /**
        //Autoboxing
        int a = 10;
        Integer objA = Integer.valueOf(a);

        //Wrapper Class example
        String str = args[0];
        Integer intVal = Integer.parseInt(str);
        int b = intVal;
         */

        ThreadEx1 obj1 = new ThreadEx1();
        Thread t1 = new Thread(obj1);
        t1.start();

        Thread t2 = new Thread(obj1);   //IMPORTANT: Need to pass the same object for synchronization to work
        t2.start();
    }
}

class ThreadEx1 implements Runnable {

    BankService bs = new BankService();

    @Override
    public void run() {
        bs.withdraw(550);
    }
}

class BankService {

    Bank b = new Bank();

    //Synchronize the method so the threads are executed in order and not in parallel
    public synchronized void withdraw(int amount) {
        int bal = b.getBalance();
        int remainBal = bal - amount;
        System.out.println("Balance Deducted..." + amount);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        b.setBalance(remainBal);
        System.out.println("Remaining Balance: " + b.getBalance());
    }
}

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
class Bank {
    private long accNum;
    private int balance = 1000;
}