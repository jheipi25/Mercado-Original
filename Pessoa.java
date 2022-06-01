package ProjetoMercado;

public class Pessoa {
    private String nome;
    private int idPessoa;
    private int dinheiro;

    public Pessoa(String nome, int idPessoa, int dinheiro) {
        this.nome = nome;
        this.idPessoa = idPessoa;
        this.dinheiro = dinheiro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idPessoa=" + idPessoa +
                ", dinheiro=" + dinheiro +
                '}';
    }
}
