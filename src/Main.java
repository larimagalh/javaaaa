import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Endereco endereco = new Endereco();
       Cliente cliente = new Cliente();
       ContaCorrente contaCorrente = new ContaCorrente();

       System.out.println("Digite o logradouro do endereco:");
       endereco.logradouro = scanner.nextLine();

       System.out.println("Digite o numero do endereco:");
       endereco.numero = scanner.nextShort();
       scanner.nextLine();

       System.out.println("Digite o complemento do endereco:");
       endereco.complemento = scanner.nextLine();

       System.out.println("Digite o cep do endereco:");
       endereco.cep = scanner.nextLine();

       System.out.println("==============Cliente=============");

       System.out.println("Digite o nome do cliente:");
       cliente.nome = scanner.nextLine();

       System.out.println("Digite o cpf do cliente:");
       cliente.cpf = scanner.nextLine();

       cliente.endereco = endereco;

       System.out.println("============Conta Corrente==========");

       System.out.println("Digite um saldo inicial:");
       contaCorrente.saldo = scanner.nextDouble();


    }
}