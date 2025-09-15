import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //add notas
        //remover notas
        //calcular média aluno

        //Matriz para pegar 3 notas de 3 alunos
        double[][] notasAlunos = new double[3][3];
        String[] nomesAlunos = new String[3];

        boolean menu = true;

        int opcao = 0;

        while (menu) {
            System.out.println("""
                    1 - Adicionar Notas
                    2 - Remover Nota
                    3 - Calcular Média de um Aluno
                    4 - Exibir todas as notas
                    0 - Sair 
                    :
                    """);
            opcao = sc.nextInt();

            //Add notas
            if (opcao == 1) {
                for (int c = 0; c < 3; c++) {
                    sc.nextLine();
                    System.out.println("Informe o nome do Aluno: ");
                    nomesAlunos[c] = sc.nextLine();
                    for (int n = 0; n < 3; n++) {
                        System.out.println("Digite a " + (n + 1) + " nota :");
                        notasAlunos[c][n] = sc.nextDouble();
                    }
                }
            }
        }

    }
}