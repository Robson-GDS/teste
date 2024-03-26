package teste_2;

public class Test02 {
    public static void main(String[] args) {
        int max = 1000;

        int a = 0;
        int b = 1;
        System.out.print("Sequência de Fibonacci até " + max + ": ");
        while (a <= max) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();

//        int numero = 21;
        int numero = 22;

        if (validaNumeroFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

    }

    public static boolean validaNumeroFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (a < num) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a == num;
    }
}
