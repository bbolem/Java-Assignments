package com.btb.Day6;
import lombok.Getter;
import lombok.Setter;
public class Synchronization_3 {
    public static void main(String[] args) {
        Thrd obj = new Thrd();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

    }
}

class Thrd implements Runnable {

    SendMessage message = new SendMessage();

    @Override
    public void run() {
        message.getMessage();
    }
}

class SendMessage {
    Message m = new Message();
    int threadCount = 0;
    public synchronized void getMessage(){
        threadCount++;
        m.setMsg("Hello From Person ");
        System.out.println(m.getMsg() + threadCount);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        m.setMsg("GoodBye From Person ");
        System.out.println(m.getMsg() + threadCount);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

@Getter
@Setter
class Message {
    String msg;
}
