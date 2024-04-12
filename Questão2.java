public class Questão2 {

    public static void main(String[] args) {
        int termo1 = 0, termo2 = 1, proximoTermo = 0;
        int numero = 34; // Exemplo de número para verificação

        System.out.print("Sequência de Fibonacci: " + termo1 + ", " + termo2);

        while (proximoTermo < numero) {
            proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
            if (proximoTermo <= numero) {
                System.out.print(", " + proximoTermo);
            }
        }

        if (termo1 == numero || termo2 == numero) {
            System.out.println("\nO número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("\nO número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }
}