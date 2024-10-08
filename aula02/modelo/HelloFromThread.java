package modelo;

public class HelloFromThread implements Runnable {

    private int tId;

    public HelloFromThread(int tId){
        this.tId = tId;
    }

    @Override
    public void run() {
        System.out.println("Hello from Thread " + tId + "!");
    }

}
