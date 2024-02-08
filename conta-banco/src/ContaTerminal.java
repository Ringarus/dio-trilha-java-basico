import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Integer numero;
        String agencia;
        String cliente;
        Double saldo;
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Por favor, digite o número da Agência !");
            agencia = scanner.nextLine();
            System.out.println("Por favor, digite o número da Conta !");
            numero = scanner.nextInt();
            scanner.nextLine(); // vai consumir a linha adicional já que nextInt não faz uma quebra de linha
            System.out.println("Por favor, digite o Nome do Cliente !");
            cliente = scanner.nextLine();
            System.out.println("Por favor, digite o saldo !");
            saldo = scanner.nextDouble();
            //Saida
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",cliente,agencia,numero,saldo);
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        
    }
}
