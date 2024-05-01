public class Informatica extends Loja {
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return this.seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ";" +
                "\n Quantidade de funcionários: " + quantidadeFuncionarios + ";" +
                "\n Salário Base funcionário: " + salarioBaseFuncionario + ";" +
                "\n Endereço: " + endereco + ";" +
                "\n Data de fundação: " + dataFundacao + ";" +
                "\n Estoque de produtos: " + estoqueProdutos + ";" +
                "\n Valor mensal do seguro: " + seguroEletronicos;
    }
    
}