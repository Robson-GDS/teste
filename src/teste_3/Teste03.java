package teste_3;

public class Teste03 {
    public static void main(String[] args) {
        // a) 1, 3, 5, 7, ___
        System.out.println("a) 1, 3, 5, 7, ___");
        int numeroA = 9;
        for (int i = 1; i <= numeroA; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();

        //b) 2, 4, 8, 16, 32, 64, ____
        System.out.println("b) 2, 4, 8, 16, 32, 64, ____");
        int numeroB = 128;
        for (int i = 2; i <= numeroB; i = i * 2) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____");
        int numeroC = 49;
        for (int i = 0; i <= numeroC; i++) {
            if (i * i > numeroC) {
                break;
            }
            int result = i * i;
            System.out.println(result);
        }

        System.out.println();

        System.out.println("d) 4, 16, 36, 64, ____");
        for (int i = 2; i <= 10; i = i + 2) {
            int result = i * i;
            System.out.println(result);
        }

        System.out.println();

        System.out.println("e) 1, 1, 2, 3, 5, 8, ____");
        int numero = 13;

        int a = 1;
        int b = 1;
        int proximo = a + b;
        while (proximo < numero) {
            a = b;
            b = proximo;
            proximo = a + b;
            System.out.println(proximo);
        }

    }
}
