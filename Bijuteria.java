public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return this.metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ";" +
                "\n Quantidade de funcionários: " + quantidadeFuncionarios + ";" +
                "\n  Base funcionário: " + salarioBaseFuncionario + ";" +
                "\n Endereço: " + endereco + ";" +
                "\n Data de fundação: " + dataFundacao + ";" +
                "\n Estoque de produtos: " + estoqueProdutos +
                "\n Meta de vendas mensais: " + metaVendas;
    }

}
