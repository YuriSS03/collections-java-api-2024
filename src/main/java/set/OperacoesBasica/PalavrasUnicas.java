package main.java.set.OperacoesBasica;

public class PalavrasUnicas {
    //Atributos
    private String palavra;

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    @Override
    public String toString() {
        return "PalavrasUnicas{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
