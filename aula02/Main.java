import atividade.HelloMaster;

public class Main {

    public static void main(String[] args) {
        HelloMaster hm = new HelloMaster();
        int n = Runtime.getRuntime().availableProcessors();
        hm.letsGetSomeHello(n);
    }
}