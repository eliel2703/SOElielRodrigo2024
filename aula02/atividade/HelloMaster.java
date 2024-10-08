package atividade;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetSomeHello(){
        for (int i = 0; i < 4; i++) {
            Thread t = new Thread(new HelloFromThread(i));
            t.start();
        }
    }
}
