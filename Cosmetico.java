public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return this.taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ";" +
                "\n Quantidade de funcionários: " + quantidadeFuncionarios + ";" +
                "\n Salário Base funcionário: " + salarioBaseFuncionario + ";" +
                "\n Endereço: " + endereco + ";" +
                "\n Data de fundação: " + dataFundacao + ";" +
                "\n Estoque de produtos: " + estoqueProdutos +
                "\n Taxa de Comercializacao: " + taxaComercializacao;
    }

}
