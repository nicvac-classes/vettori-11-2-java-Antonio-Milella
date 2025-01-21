import java.util.Scanner;

class Esercizio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inserisci la dimensione del vettore:");
        int n = Integer.parseInt(in.nextLine());
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° valore:");
            v[i] = Integer.parseInt(in.nextLine());
        }

        for (int i = 0; i < n - 1; i++) {
            boolean duplicato = false;
            int contatore = 1;

            for (int j = i + 1; j < n; j++) {
                if (v[i] == v[j]) {
                    System.out.println("Il valore " + v[i] + " occorre nelle posizioni " + i + " e " + j);
                    contatore++;
                    duplicato = true;
                }
            }

            if (duplicato) {
                System.out.println("E' stato inserito " + contatore + " volte.");
            }
        }

        in.close();
    }
}
