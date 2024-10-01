package atividade;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetSomeHello(){
        Thread t1 = new Thread(new HelloFromThread());
        Thread t2 = new Thread(new HelloFromThread());
        Thread t3 = new Thread(new HelloFromThread());
        Thread t4 = new Thread(new HelloFromThread());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
