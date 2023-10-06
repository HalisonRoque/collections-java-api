package main.java.list.OperadoresBasico;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    //construtor

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    //metodo adicionar Tarefa no ArrayList
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    //metodo remover tarefa no ArrayList
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size(); //size retorna todos os indices do array
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O numero total de elementos na listas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");


        System.out.println("O numero total de alementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de alementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    }
}
