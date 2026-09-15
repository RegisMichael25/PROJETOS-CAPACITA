package app;

import controller.TaskManagerController;
import exception.TaskNaoEncontradaException;
import model.Tarefa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManagerScreen {

    public TaskManagerScreen() {}

    TaskManagerController controller = new TaskManagerController();

    public void mostrarTela() {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1. Criar nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                opcaoScreen(opcao, sc);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número.");
                sc.nextLine();
            }

        } while (opcao != 5);

        System.out.println("Encerrando o sistema...");
    }

    public void opcaoScreen(int opcao, Scanner sc) {
        switch (opcao) {
            case 1:
                System.out.print("Informe o titulo da tarefa: ");
                sc.nextLine();
                String titulo = sc.nextLine();
                System.out.print("Informe a descrição da tarefa: ");
                String descricao = sc.nextLine();
                Tarefa tarefa = new Tarefa(titulo, descricao, false);
                controller.adicionarTarefa(tarefa);
                System.out.println("Atividade adicionada com sucesso!");
                break;

            case 2:
                System.out.println("\n--- Lista de Tarefas ---");
                controller.listarTarefa();
                break;

            case 3:
                System.out.println("\n--- Concluir Tarefa ---");
                controller.listarTarefa();
                System.out.print("Digite o número da tarefa que deseja marcar como concluída: ");
                try {
                    int indexConcluir = sc.nextInt();
                    controller.concluirTarefa(indexConcluir);
                    System.out.println("Tarefa marcada como concluída com sucesso!");
                } catch (TaskNaoEncontradaException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Você deve digitar um número válido.");
                    sc.nextLine();
                }
                break;

            case 4:
                System.out.println("\n--- Remover Tarefa ---");
                controller.listarTarefa();
                System.out.print("Digite o número da tarefa que deseja remover: ");
                try {
                    int indexRemover = sc.nextInt();
                    controller.removerTarefa(indexRemover);
                    System.out.println("Tarefa removida com sucesso!");
                } catch (TaskNaoEncontradaException e) {
                    System.out.println("Erro: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Erro: Você deve digitar um número válido.");
                    sc.nextLine();
                }
                break;

            case 5:

                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
                break;
        }
    }
}