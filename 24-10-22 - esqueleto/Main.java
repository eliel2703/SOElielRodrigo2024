import atividade.AddVetorMaster;

public class Main {

    public static void main(String[] args) {
        final int TAMANHO = 10;  // Defina o tamanho do vetor
        final int numThreads = 4; // Defina o número de threads

        // Criar vetores
        double[] a = new double[TAMANHO];
        double[] b = new double[TAMANHO];

        // Preencher os vetores com números aleatórios do tipo double
        for (int i = 0; i < TAMANHO; i++) {
            a[i] = Math.random() * 10; // Valores aleatórios entre 0 e 10
            b[i] = Math.random() * 10;
        }

        // Instanciar AddVetorMaster
        AddVetorMaster master = new AddVetorMaster(a, b, numThreads);

        // Executar o cálculo
        master.calcVetores();

        // Pegar e imprimir o resultado
        double[] r = master.getVetorR();
        System.out.print("[ " + r[0]);
        for (int i = 1; i < TAMANHO - 1; i++) {
            System.out.print(" | " + r[i]);
        }
        System.out.println(" | " + r[TAMANHO - 1] + " ]");
    }
}
