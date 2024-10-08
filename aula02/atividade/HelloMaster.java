package atividade;

import modelo.HelloFromThread;

public class HelloMaster {
    public void letsGetSomeHello(int n){
        Thread[] arr = new Thread[n];        
        for (int i = 0; i < arr.length; i++) {
             arr[i] = new Thread(new HelloFromThread(i));
             arr[i].start();
        }
    }
}
