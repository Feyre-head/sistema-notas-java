import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //add notas
        //remover notas
        //calcular média aluno

        //Matriz para pegar 3 notas de 3 alunos
        double[][] notasAlunos = new double[3][3];
        String[] nomesAlunos = new String[3];


        int opcao = 9;

        while (opcao > 0) {
            System.out.println("""
                    1 - Adicionar Notas
                    2 - Remover Nota
                    3 - Calcular Média de um Aluno
                    4 - Exibir todas as notas
                    0 - Sair
                    :
                    """);
            opcao = sc.nextInt();
            sc.nextLine();

            //Add notas
            if (opcao == 1) {
                for (int c = 0; c < 3; c++) {
                    System.out.print("Informe o nome do Aluno: ");
                    nomesAlunos[c] = sc.nextLine();

                    for (int n = 0; n < 3; n++) {
                        System.out.print("Informe a: " + (n + 1) + " nota:");
                        notasAlunos[c][n] = sc.nextDouble();
                    }
                    sc.nextLine();

                }
            } else if (opcao == 2) {

                System.out.println("Alunos Disponiveis:");
                int indiceAluno = 0;
                for (int i = 0; i < 3; i++) {
                    System.out.println("Índice: " + (i) + " Nome: " + nomesAlunos[i]);
                }
                System.out.println("Digite o Índice do Aluno que deseja remover a nota: ");
                indiceAluno = sc.nextInt();

                //Remover
                for (int r = 0; r < 3; r++) {
                    notasAlunos[indiceAluno][r] = 0.0;
                }

                //Acessar nota
                for (int i = 0; i < 3; i++) {
                    System.out.println("Nome: " + nomesAlunos[i] + "Nota " + (i + 1) + ": " + notasAlunos[indiceAluno][i]);
                }
            }
        }
    }

}
