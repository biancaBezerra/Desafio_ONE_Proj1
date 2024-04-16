import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Bianca Bezerra";
        String tipoConta = "Corrente";
        double saldo = 299.99;

        int opcao = 0;
        String menu = """
                *******************************
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Tranferir valor
                3 - Receber valor
                4 - Sair
                *******************************
                """;
        Scanner leitura = new Scanner(System.in);

        System.out.println("*******************************");
        System.out.println("Nome do cliente: " +  nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************************");


        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("\nSaldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("\nQual a quantia que você deseja transferir? ");
                double valor = leitura.nextDouble();
                if (valor > saldo ){
                    System.out.println("\nSaldo insuficiente para realizar transferencia");
                } else {
                    saldo -= valor;
                    System.out.println("\nTranferencia realizada com sucesso!");
                    System.out.println("\nSaldo atualizado: "+ saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nQual quantia você irá receber?");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("\nSaldo atualizado: "+ saldo);
            } else if (opcao != 4){
                System.out.println("\nOpção inválida");
            }

        }
    }
}