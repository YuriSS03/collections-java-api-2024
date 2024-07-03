package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    //Atributos

    private Set<Produto> produtoSet;

    public  CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(int quantidade, double preco, String nome, long codigo ){
        produtoSet.add(new Produto(quantidade,preco,nome,codigo));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(5,15d , "Produto 5", 1L);
        cadastroProdutos.adicionarProduto(10,20d , "Produto 0", 1L);
        cadastroProdutos.adicionarProduto(2,57d , "Produto 1", 2L);
        cadastroProdutos.adicionarProduto(5,1d , "Produto 3", 9L);

        System.out.println(cadastroProdutos.produtoSet);

//        System.out.println(cadastroProdutos.exibirProdutosPorNome());

    }

}
