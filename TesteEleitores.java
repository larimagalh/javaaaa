import java.util.Scanner;

public class TesteEleitores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome da primeira pessoa:");
        String nomePessoa1 = scanner.nextLine();

        System.out.println("Digite a idade da primeira pessoa");
        int idadePessoa1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a altura da primeira pessoa:");
        double alturaPessoa1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso da primeira pessoa:");
        double pesoPessoa1 = Double.parseDouble(scanner.nextLine());

        System.out.println("==========Dados segunda Pessoa==========");

        System.out.println("Digite o nome da segunda pessoa:");
        String nomePessoa2 = scanner.nextLine();

        System.out.println("Digite a idade da segunda pessoa");
        int idadePessoa2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a altura da segunda pessoa:");
        double alturaPessoa2 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso da segunda pessoa:");
        double pesoPessoa2 = Double.parseDouble(scanner.nextLine());

        System.out.println("==========Dados terceira Pessoa==========");

        System.out.println("Digite o nome da terceira pessoa:");
        String nomePessoa3 = scanner.nextLine();

        System.out.println("Digite a idade da terceira pessoa");
        int idadePessoa3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a altura da terceira pessoa:");
        double alturaPessoa3 = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o peso da terceira pessoa:");
        double pesoPessoa3 = Double.parseDouble(scanner.nextLine());

        Pessoa pessoa1 = new Pessoa(nomePessoa1,pesoPessoa1, alturaPessoa1, idadePessoa1);
        Pessoa pessoa2 = new Pessoa(nomePessoa2,pesoPessoa2, alturaPessoa2, idadePessoa2);
        Pessoa pessoa3 = new Pessoa(nomePessoa3,pesoPessoa3, alturaPessoa3, idadePessoa3);
    }
}
