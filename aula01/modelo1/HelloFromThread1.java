package modelo1;

public class HelloFromThread1 implements Runnable {

    private int tId;

    public HelloFromThread1(int tId){
        this.tId = tId;
    }

    @Override
    public void run() {
        System.out.println("Hello from Thread " + tId + "!");
    }

}
