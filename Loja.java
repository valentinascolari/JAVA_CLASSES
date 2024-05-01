public class Loja {
    protected String nome;
    protected int quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    protected Endereco endereco;
    protected Data dataFundacao;
    protected Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return this.quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public double gastosComSalario() {
        return (quantidadeFuncionarios * salarioBaseFuncionario);
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return this.dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios > 30) {
            return 'G';
        } else {
            return 'M';
        }
    }

    public void imprimeProdutos() {
        for (Produto estoqueProduto : estoqueProdutos) {
            if (estoqueProduto != null) {
                System.out.println(estoqueProduto);
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nome) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i].getNome().equals(nome)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeProdutosCadastrados() {
        int quantidade = 0;
        for (Produto produto : estoqueProdutos) {
            if (produto != null) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public String toString() {
        return "Nome: " + nome + ";" +
                "\nQuantidade de funcionários: " + quantidadeFuncionarios + ";" +
                "\nSalário Base funcionário: " + salarioBaseFuncionario + ";" +
                "\nEndereço: " + endereco + ";" +
                "\nData de fundação: " + dataFundacao + ";" +
                "\nEstoque de produtos: " + estoqueProdutos;
    }

}


