package ProjetoMercado;

public class Produto {
    private String nome;
    private int quantidade;
    private int idProduto;

    private int preco;

    public Produto(String nome, int quantidade, int idProduto,int preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int setQuantidade(int quantidade) {
        return this.quantidade = quantidade;

    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", idProduto=" + idProduto +
                '}';
    }
}
