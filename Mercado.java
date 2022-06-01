package ProjetoMercado;

import java.util.ArrayList;

public class Mercado {
    private String nomeMercado;
    private ArrayList<Produto> listadeProdutos = new ArrayList<Produto>();
    private String Cnpj;
    private int idMercado;

    public Mercado(String nomeMercado, ArrayList<Produto> listadeProdutos, String cnpj, int idMercado) {
        this.nomeMercado = nomeMercado;
        Cnpj = cnpj;
        this.idMercado = idMercado;
        this.listadeProdutos = listadeProdutos;
    }

    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public ArrayList<Produto> getListadeProdutos() {
        return listadeProdutos;
    }

    public void setListadeProdutos(ArrayList<Produto> listadeProdutos) {
        this.listadeProdutos = listadeProdutos;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public int getId() {
        return idMercado;
    }

    public void setId(int id) {
        this.idMercado = id;
    }

    public void adicionar(Produto produto){
        listadeProdutos.add(produto);
    }

    public void remover(int idProduto){
        Produto produtoaSerRemovido = null;
        int idPegado = 0;
        for(Produto produtos: listadeProdutos){
            if (produtos.getIdProduto() == idProduto){
                produtoaSerRemovido = produtos;

            }

        }
        listadeProdutos.remove(produtoaSerRemovido);
    }
    public void alterar(int idProduto, Produto Produtoalterar){
        int posicaoEscolhida = 0;
        int posicaoVetor = 0;
        int quantidadeAlterada = 0;
        for (Produto produto: listadeProdutos){
            if (produto.getIdProduto() == idProduto ){
                posicaoEscolhida = posicaoVetor;
                Produtoalterar = produto;

            }
            posicaoVetor++;

        }
        listadeProdutos.set(posicaoEscolhida,Produtoalterar);
    }

    @Override
    public String toString() {
        return "Mercado{" +
                "nomeMercado='" + nomeMercado + '\'' +
                ", listadeProdutos=" + listadeProdutos +
                ", Cnpj='" + Cnpj + '\'' +
                ", idMercado=" + idMercado +
                '}';
    }


}
