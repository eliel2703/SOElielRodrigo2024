package modelo;

public class HelloFromThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello from Thread");
    }
    
}
