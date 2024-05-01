public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return this.dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ";" +
                "\n Quantidade de funcionários: " + quantidadeFuncionarios + ";" +
                "\n Salário Base funcionário: " + salarioBaseFuncionario + ";" +
                "\n Endereço: " + endereco + ";" +
                "\n Data de fundação: " + dataFundacao + ";" +
                "\n Estoque de produtos: " + estoqueProdutos +
                "\n Data de recebimento do Alvará de funcionamento: " + dataAlvara;
    }

}
