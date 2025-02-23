import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args)  {
        // Colocando os atributos 
        int numeroConta = 987654321;
        String agenciaConta = "1234";
        String nomeCliente = "Yasmin Batista";
        double saldo = 324.87;

        // Coloquei o Scanner oara digitar a agência, assim vai imprimir os dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da agência: ");
        String agenciaDigitada = scanner.nextLine();

        //Vou colocar if e else caso digite a agência seja incorreta
        if (agenciaDigitada.equals(agenciaConta)) {
            System.out.println("\nDados da conta:");
            System.out.println("Número da Conta: " + numeroConta);
            System.out.println("Nome do Cliente: " + nomeCliente);
            System.out.printf("Saldo: R$ %.2f\n", saldo);
        } else {
            System.out.println("Agência incorreta! Acesso negado.");
        }
        scanner.close();
    }
}
