package main.java.set.Pesquisa;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributos

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Yuri", 123456);
        agendaContatos.adicionarContato("Yuri", 123);
        agendaContatos.adicionarContato("Yuri Sores", 567);
        agendaContatos.adicionarContato("Yuri S S", 0);
        agendaContatos.adicionarContato("Souza Silva", 567);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Souza"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Souza Silva", 777));

        agendaContatos.exibirContatos();



    }

}
