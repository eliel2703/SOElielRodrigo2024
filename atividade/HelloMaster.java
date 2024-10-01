package atividade;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetSomeHello(){
        Thread t1 = new Thread(new HelloFromThread());
        t1.start();
    }
}
