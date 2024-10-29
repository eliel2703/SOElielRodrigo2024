package modelo;

public class AddVetorThread extends Thread {
    // Atributos para os vetores e intervalos de soma
    private double[] a, b, r;
    private int inicio, fim;

    public AddVetorThread(double[] a, double[] b, double[] r, int inicio, int fim) {
        this.a = a;
        this.b = b;
        this.r = r;
        this.inicio = inicio;
        this.fim = fim;
    }

    @Override
    public void run() {
        // Realiza a soma para o intervalo definido
        for (int i = inicio; i < fim; i++) {
            r[i] = a[i] + b[i]; // Soma os elementos correspondentes dos vetores
        }
    }
}
