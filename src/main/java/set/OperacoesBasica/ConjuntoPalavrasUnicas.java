package main.java.set.OperacoesBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //Atributos
    private Set<PalavrasUnicas> palavrasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasSet = new HashSet<>();
    }

    //Métodos

    public void adicionarPalavra(String palavra){
        palavrasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        palavrasSet.remove(palavra);
    }

    public void verificarPalavra(String palavra){
       // return palavrasSet.size();
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }
}
