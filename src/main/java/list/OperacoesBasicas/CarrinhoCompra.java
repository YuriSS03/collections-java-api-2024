package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompra{
    private List<Carrinho> carrinhoList;

    public CarrinhoCompra() {
        this.carrinhoList = new ArrayList<>();

    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Carrinho(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Carrinho> itensParaRemover = new ArrayList<>();
        for(Carrinho c : carrinhoList){
            if(c.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(c);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
    }


    public void exibirItens(){
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoCompra listaCarrinho = new CarrinhoCompra();
        listaCarrinho.adicionarItem("Arroz",13.35,1);
        listaCarrinho.adicionarItem("Feijão",12.05,2);
        listaCarrinho.removerItem("Feijão");
        listaCarrinho.adicionarItem("Macarrão",3.50,1);
        listaCarrinho.exibirItens();
    }
}

