package ProjetoMercado;

import java.util.ArrayList;

public class Carrinho {
    private Pessoa comprador;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();


    public Carrinho(Pessoa comprador, ArrayList<Produto> produtos) {
        this.comprador = comprador;
        this.produtos = produtos;


    }

    public Pessoa getComprador() {
        return comprador;
    }

    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "comprador=" + comprador +
                ", produtos=" + produtos +
                '}';
    }
    public void adicionarCarrinho(Produto produto){
        produtos.add(produto);
    }

}
