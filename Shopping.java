public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i].getNome().equals(nome)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int contador = 0;
        for (Loja loja : lojas) {
            if (loja == null) break;
            if (loja.getClass().getName().equals(tipo)) {
                contador++;
            }
        }
        return contador;
    }

    public Loja buscarLojaPorNome(String nome) {
        for (Loja loja : lojas) {
            if (loja != null) {
                if (loja.getNome().equals(nome)) {
                    return loja;
                }
            }
        }

        return null;
    }

    public double lojaSeguroMaisCaro() {
        double maiorValorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getSeguroEletronicos();
                }
            }
        }
        return maiorValorSeguro;
    }

}