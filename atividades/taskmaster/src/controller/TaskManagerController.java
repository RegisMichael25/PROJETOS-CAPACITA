package controller;

import exception.TaskNaoEncontradaException;
import model.Tarefa;
import java.util.ArrayList;

public class TaskManagerController {

    private ArrayList<Tarefa> tarefas;

    public TaskManagerController() {
        this.tarefas = new ArrayList<>();
    }

    public void listarTarefa() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                Tarefa t = tarefas.get(i);
                String status = t.isConcluida() ? "[X]" : "[ ]";
                System.out.println((i + 1) + ". " + status + " " + t.getTitulo() + " - " + t.getDescricao());
            }
        }
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void concluirTarefa(int index) throws TaskNaoEncontradaException {
        if (index < 1 || index > tarefas.size()) {
            throw new TaskNaoEncontradaException("Tarefa não encontrada no índice informado.");
        }
        tarefas.get(index - 1).setConcluida(true);
    }

    public void removerTarefa(int index) throws TaskNaoEncontradaException {
        if (index < 1 || index > tarefas.size()) {
            throw new TaskNaoEncontradaException("Tarefa não encontrada no índice informado.");
        }
        tarefas.remove(index - 1);
    }
}