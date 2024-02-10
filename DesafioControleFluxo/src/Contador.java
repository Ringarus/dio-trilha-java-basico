import java.util.Scanner;

/**
 * Contador
 */
public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int parametroUm, parametroDois;

        try {
            System.out.println("Insira o parametro 1:");
            parametroUm = scanner.nextInt();
            System.out.println("Insira o parametro 1:");
            parametroDois = scanner.nextInt();
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        } finally {
            scanner.close();
        }
    }

    static void contar(int p1, int p2) throws ParametrosInvalidosException {
        if (p1>p2) {
            throw new ParametrosInvalidosException();
        }

        int contagem = p2 - p1;
        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número "+ (i+1));
        }

    }
}