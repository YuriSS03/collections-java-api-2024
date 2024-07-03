package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    //atributos
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Yuri", 123456789);
        agendaContatos.adicionarContato("Soares Yuri", 123456);
        agendaContatos.adicionarContato("Silva Yuri", 123456);
        agendaContatos.adicionarContato("Yuri", 789456);
        agendaContatos.adicionarContato("Soares Silva", 321654);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Soares Yuri");
        agendaContatos.exibirContatos();

        System.out.println("O número é "+ agendaContatos.pesquisarPorNome("Silva Yuri"));

    }

}
