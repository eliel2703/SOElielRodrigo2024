package atividade;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetSomeHello(){
        Thread t1 = new Thread(new HelloFromThread(1));
        Thread t2 = new Thread(new HelloFromThread(2));
        Thread t3 = new Thread(new HelloFromThread(3));
        Thread t4 = new Thread(new HelloFromThread(4));

        t1.run();
        t2.run();
        t3.run();
        t4.run();
    }
}