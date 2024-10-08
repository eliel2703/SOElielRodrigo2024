package atividade;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetSomeHello(){
        for (int i = 1; i < 5; i++) {
            Thread t = new Thread(new HelloFromThread(i));
            t.start();
        }

    }
}
