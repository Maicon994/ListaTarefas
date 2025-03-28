package br.ulbra.miniprojeto;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Tarefa {

    private ArrayList baseTarefa;

    public Tarefa() {
        baseTarefa = new ArrayList();
    }

    public void adicionar(String nomeTarefa) {
        baseTarefa.add(nomeTarefa);
        String adicionar = " Salvo com sucesso!";
        JOptionPane.showMessageDialog(null, adicionar);

    }

    public String mostrarTarefa() {
        String lista = "==========> Lista de tarefas <==========\n";
        if (!baseTarefa.isEmpty()) {
            for (int i = 0; i < baseTarefa.size(); i++) {
                lista += (i + 1) + ". " + baseTarefa.get(i) + "\n";
            }
        } else {
            lista = "Lista de tarefas Vazia!";
        }
        return lista;
    }

    public boolean verificarVazia() {
        return baseTarefa.isEmpty();
    }

    public int quantidadeTarefas() {
        return baseTarefa.size();
    }

    public void modificar(int indice, String novaTarefa) {
        if (!baseTarefa.isEmpty()) {
            if (indice >= 0 && indice < baseTarefa.size()) {
                baseTarefa.set(indice, novaTarefa);
                JOptionPane.showMessageDialog(null, "Tarefa alterada com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Tarefa inexistente!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia!!");
        }
    }

    public void excluir(int indice) {
        if (!baseTarefa.isEmpty()) {
            if (indice >= 0 && indice < baseTarefa.size()) {
                baseTarefa.remove(indice);
                JOptionPane.showMessageDialog(null, "Tarefa excluída com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Tarefa inexistente!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia!!");
        }
    }

    public void ordenar() {
        if (!baseTarefa.isEmpty()) {
            Collections.sort(baseTarefa);
            JOptionPane.showMessageDialog(null, "Lista ordenada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Lista vazia! Nada para ordenar.");
        }
    }

    public void excluirTudo() {
        int resposta = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja excluir TODAS as tarefas?",
                "Confirmação",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (resposta == JOptionPane.YES_OPTION) {
            if (!baseTarefa.isEmpty()) {
                baseTarefa.clear();
                JOptionPane.showMessageDialog(null, "Todas as tarefas foram excluídas!");
            } else {
                JOptionPane.showMessageDialog(null, "A lista já está vazia!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cancelado!");
        }
    }
}
