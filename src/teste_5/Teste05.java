package teste_5;

public class Teste05 {
    public static void main(String[] args) {
        String palavra = "testando";
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }
}
