public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return this.produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ";" +
                "\n Quantidade de funcionários: " + quantidadeFuncionarios + ";" +
                "\n Salário Base funcionário: " + salarioBaseFuncionario + ";" +
                "\n Endereço: " + endereco + ";" +
                "\n Data de fundação: " + dataFundacao + ";" +
                "\n Estoque de produtos: " + estoqueProdutos +
                "\n Vende Produtos Importados: " + produtosImportados;
    }

}