import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Shopping: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o endereço do Shopping");
        Endereco enderecoShopping = solicitarEndereco(scanner);
        Shopping shopping = new Shopping(nome, enderecoShopping, 20);

        int opcao = 0;
        boolean continua = true;

        while (continua) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    shopping.insereLoja(criarLoja(scanner));
                    break;
                case 2:
                    System.out.println("Digite o nome da loja: ");
                    String nomeLoja = scanner.nextLine();
                    shopping.removeLoja(nomeLoja);
                    break;
                case 3:
                    System.out.println("Digite o tipo da loja: ");
                    String tipoLoja = scanner.nextLine();
                    System.out.println(shopping.quantidadeLojasPorTipo(tipoLoja));
                    break;
                case 4:
                    System.out.println(shopping.lojaSeguroMaisCaro());
                    break;
                case 5:
                    System.out.println("Digite o nome da loja: ");
                    nomeLoja = scanner.nextLine();
                    Loja loja = shopping.buscarLojaPorNome(nomeLoja);
                    if (loja == null) {
                        System.out.println("Loja nao existe");
                        break;
                    }

                    int quantidadeProdutosCadastrados = loja.quantidadeProdutosCadastrados();
                    int quantidadeProdutosTotal = loja.getEstoqueProdutos().length;
                    if (quantidadeProdutosCadastrados < quantidadeProdutosTotal) {
                        Produto produto = criarProduto(scanner);
                        if (produto != null) {
                            loja.insereProduto(produto);
                        }
                    } else {
                        System.out.println("Ultrapassou a quantidade de produtos");
                    }
                    break;
                case 6:
                    System.out.println("Digite o nome da loja: ");
                    nomeLoja = scanner.nextLine();
                    loja = shopping.buscarLojaPorNome(nomeLoja);
                    if (loja == null) {
                        System.out.println("Loja nao existe");
                        break;
                    }
                    loja.imprimeProdutos();
                    break;
                case 7:
                    System.out.println("Digite o nome da loja: ");
                    nomeLoja = scanner.nextLine();
                    loja = shopping.buscarLojaPorNome(nomeLoja);
                    if (loja == null) {
                        System.out.println("Loja não existe");
                        break;
                    }

                    System.out.println("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    loja.removeProduto(nomeProduto);
                    break;
                case 8:
                    System.out.println("Digite o nome da loja: ");
                    nomeLoja = scanner.nextLine();
                    loja = shopping.buscarLojaPorNome(nomeLoja);
                    if (loja == null) {
                        System.out.println("Loja não existe");
                        break;
                    }
                    System.out.println(loja.gastosComSalario());
                    break;
                case 9:
                    System.out.println("Digite o nome da loja: ");
                    nomeLoja = scanner.nextLine();
                    loja = shopping.buscarLojaPorNome(nomeLoja);
                    if (loja == null) {
                        System.out.println("Loja não existe");
                        break;
                    }
                    System.out.println(loja.tamanhoDaLoja());
                    break;

                case 10:
                    System.out.println("Encerrando o programa...");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Remover uma loja");
        System.out.println("(3) Quantitade de lojas por tipo");
        System.out.println("(4) Seguro mais caro das lojas de Informatica");
        System.out.println("(5) Criar um produto");
        System.out.println("(6) Lista os produtos de uma loja");
        System.out.println("(7) Remove produto de uma loja");
        System.out.println("(8) Gastos da loja com o salário dos funcionários");
        System.out.println("(9) Tamanho da loja");
        System.out.println("(10) Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static Endereco solicitarEndereco(Scanner scanner) {
        System.out.print("Digite o nome da rua: ");
        String nomeRua = scanner.nextLine();

        System.out.print("Digite o nome da cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o nome do estado: ");
        String estado = scanner.nextLine();

        System.out.print("Digite o nome do país: ");
        String pais = scanner.nextLine();

        System.out.print("Digite o número do cep: ");
        String cep = scanner.nextLine();

        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o complemento:(Se não tiver complemento, pressione a tecla \"enter\"). ");
        String complemento = scanner.nextLine();

        return new Endereco(nomeRua, cidade, estado, pais, cep, numero, complemento);
    }

    public static Data solicitarData(Scanner scanner) {
        System.out.print("Digite o dia: ");
        int dia = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o mês: ");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        return new Data(dia, mes, ano);
    }

    public static Loja criarLoja(Scanner scanner) {
        System.out.println("Menu:");
        System.out.println("(1) Alimentação");
        System.out.println("(2) Bijuteria");
        System.out.println("(3) Cosmetico");
        System.out.println("(4) Informatica");
        System.out.println("(5) Vestuario ");
        System.out.print("Escolha uma opção: ");

        int tipoLoja = scanner.nextInt();

        System.out.println("Opção selecionada: Criar uma loja");

        System.out.print("Digite o nome da loja: ");
        scanner.nextLine();
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o salário base dos funcionários: ");
        double salarioBaseFuncionario = Double.parseDouble(scanner.nextLine());

        System.out.print("Agora vamos para o endereço da loja. ");
        Endereco endereco = solicitarEndereco(scanner);

        System.out.print("Agora vamos para a Data de fundação: ");
        Data dataFundacao = solicitarData(scanner);

        System.out.print("Digite a quantidade máxima de produtos: ");
        int quantidadeMaximaProdutos = Integer.parseInt(scanner.nextLine());

        switch (tipoLoja) {
            case 1:
                System.out.print("Agora vamos para a Data do Alvara: ");
                Data dataAlvara = solicitarData(scanner);
                return new Alimentacao(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, dataAlvara, quantidadeMaximaProdutos);
            case 2:
                System.out.print("Digite um valor inteiro que represente a meta de vendas : ");
                int metaDeVendas = Integer.parseInt(scanner.nextLine());
                return new Bijuteria(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, metaDeVendas, quantidadeMaximaProdutos);
            case 3:
                System.out.print("Digite a meta de vendas: ");
                double taxaComercializacao = Double.parseDouble(scanner.nextLine());
                return new Cosmetico(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, taxaComercializacao, quantidadeMaximaProdutos);
            case 4:
                System.out.print("Digite o valor do seguro eletrônico: ");
                double seguroEletronico = Double.parseDouble(scanner.nextLine());
                return new Informatica(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, seguroEletronico, quantidadeMaximaProdutos);
            case 5:
                System.out.print("A loja vende produtos importados? Digite (1) para SIM ou (2) para NÃO: ");
                int opcaoProdutosImportados = Integer.parseInt(scanner.nextLine());
                boolean produtosImportados = false;
                if (opcaoProdutosImportados == 1) {
                    produtosImportados = true;
                }

                return new Vestuario(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, produtosImportados, quantidadeMaximaProdutos);
            default:
                System.out.println("Opção inválida!");
                return null;
        }
    }

    public static Produto criarProduto(Scanner scanner) {
        System.out.println("Opção selecionada: Criar um produto");

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite os dados de validade do produto: ");

        System.out.print("Digite o dia: ");
        int dia = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o mês: ");
        int mes = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o ano: ");
        int ano = Integer.parseInt(scanner.nextLine());

        Data dataValidade = new Data(dia, mes, ano);

        Produto produto = new Produto(nome, preco, dataValidade);
        boolean estaVencido = produto.estaVencido(new Data(
                LocalDate.now().getDayOfMonth(),
                LocalDate.now().getMonthValue(),
                LocalDate.now().getYear()));

        if (estaVencido) {
            System.out.println("PRODUTO VENCIDO");
            return null;
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
            return produto;
        }
    }

}
