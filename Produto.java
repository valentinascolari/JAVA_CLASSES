import java.time.LocalDate;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data data) {
        LocalDate _data = LocalDate.of(data.getAno(), data.getMes(), data.getDia());
        LocalDate validade = LocalDate.of(dataValidade.getAno(), dataValidade.getMes(), dataValidade.getDia());

        return _data.isAfter(validade);
    }

    public String toString() {
        return "Nome do produto: " + nome + ";" +
                "\n Preço do produto: " + preco + ";" +
                "\n Data de validade: " + dataValidade;
    }

}

