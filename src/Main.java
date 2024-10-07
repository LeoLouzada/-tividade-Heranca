import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.print("Digite o nome do aluno: ");
        a1.setNome(scanner.nextLine());

        System.out.print("Digite a idade do aluno: ");
        a1.setIdade(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Digite a matricula do aluno: ");
        a1.setMatricula(scanner.nextLine());

        System.out.print("\n");
        a1.exibirInfo();

        Professor p1 = new Professor();

        System.out.print("\nDigite o nome do professor: ");
        p1.setNome(scanner.nextLine());

        System.out.print("Digite a idade do professor: ");
        p1.setIdade(scanner.nextInt());

        scanner.nextLine();

        System.out.print("Digite o salario do professor: ");
        p1.setSalario(scanner.nextDouble());

        System.out.print("\n");
        p1.exibirInfo();

        scanner.close();
    }
}