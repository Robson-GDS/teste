package teste_1;

public class Teste01 {
    public static void main(String[] args) {
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA += K;
        }

        System.out.println("A soma dos números de 1 a " + INDICE + " é: " + SOMA);
    }
}
