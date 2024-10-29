package atividade;

import modelo.AddVetorThread;

public class AddVetorMaster {
    // definir atributos
    private double[] a, b, r;
    private int numThreads;
    private AddVetorThread[] threads;

    public AddVetorMaster(double[] a, double[] b, int numThreads) {
        this.a = a;
        this.b = b;
        this.numThreads = numThreads;
        this.r = new double[a.length];
        this.threads = new AddVetorThread[numThreads];
        
        // Alocar e iniciar threads
        for (int i = 0; i < numThreads; i++) {
            int inicio = calcInicio(i);
            int fim = calcFim(i);
            threads[i] = new AddVetorThread(a, b, r, inicio, fim);
        }
    }

    public void calcVetores() {
        // Iniciar todas as threads
        for (AddVetorThread thread : threads) {
            thread.start();
        }
        joinThreads(); // Esperar todas as threads terminarem
    }

    public double[] getVetorR() { // este é fácil!!!
        return r;
    }

    private int calcInicio(int i) {
        // Divide o trabalho entre as threads
        return i * (a.length / numThreads);
    }

    private int calcFim(int i) {
        // Define o fim da parte do vetor para a thread atual
        if (i == numThreads - 1) {
            return a.length; // Última thread vai até o final
        } else {
            return (i + 1) * (a.length / numThreads);
        }
    }

    private void joinThreads() {
        // Espera todas as threads terminarem
        for (AddVetorThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
