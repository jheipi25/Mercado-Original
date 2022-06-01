package ProjetoMercado;

import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        List<Mercado> mercados = new ArrayList<>();

        int iniciadorPrograma = 1;
        while(iniciadorPrograma == 1 ){
            System.out.println("Bem vindo ao mercado. Para entrar como administrador digite [1]" + "\t" + "Para entrar como Cliente digite [2]");
            Scanner teclado = new Scanner(System.in);
            int opçaoEntrada = Integer.parseInt(teclado.nextLine());
            if (opçaoEntrada == 1){
                System.out.println("BEM VINDO AO MODIFICADOR ADMINISTRATIVO: ");
                System.out.println("DIGITE ALGUMAS DAS OPÇÕES ABAIXO");
                System.out.println("----------------------------------");
                System.out.println("[1] CADASTRAR MERCADO ");
                System.out.println("[2] CADASTRAR PRODUTO MERCADO");
                System.out.println("[3] REMOVER PRODUTO DO MERCADO PELO ID");
                System.out.println("[4] ALTERAR QUANTIDADE DO PRODUTO DO MERCADO PELO ID");
                System.out.println("[5] Listar produtos do mercado");
                System.out.println("[6] LISTAR OS MERCADOS CADASTRADOS ");

                int opçoesAdministrador = Integer.parseInt(teclado.nextLine());
                switch (opçoesAdministrador){

                    case 1:
                        System.out.println("DIGITE O NOME DO MERCADO:");
                        String nomeMercado = teclado.nextLine();
                        System.out.println("DIGITE O CNPJ");
                        String CNPJ = teclado.nextLine();
                        System.out.println("DIGITE O IDMERCADO");
                        int idMercado = teclado.nextInt();
                        Mercado novoMercado = new Mercado(nomeMercado,new ArrayList<Produto>(),CNPJ,idMercado);
                        mercados.add(novoMercado);
                        break;

                    case 2:
                        System.out.println("VAMOS CADASTRAR UM PRODUTO: ");

                        System.out.println("DIGITE O NOME DO PRODUTO:");

                        String nomedoProduto = teclado.nextLine();

                        System.out.println("DIGITE A QUANTIDADE");

                        int quantidade = Integer.parseInt(teclado.nextLine());

                        System.out.println("DIGITE O IDPRODUTO");

                        int idProduto = Integer.parseInt(teclado.nextLine());

                        System.out.println("DIGITE O PRECO DO PRODUTO");

                        int preco = Integer.parseInt(teclado.nextLine());

                        Produto novoProduto = new Produto(nomedoProduto,quantidade,idProduto,preco);
                        System.out.println("PRODUTO CRIADO COM SUCESSO");
                        System.out.println("DIGITE O IDPRODUTO PARA O ADICIONAR:");
                        int identificadorArmazenarMercado = Integer.parseInt(teclado.nextLine());
                        for (Mercado mercado1: mercados){
                            if (mercado1.getId() == identificadorArmazenarMercado){
                                System.out.println("PRODUTO ADICIONADO COM SUCESSO");
                                mercado1.adicionar(novoProduto);
                            }else {
                                System.out.println("NÃO FOI POSSIVEL ACHAR E ADICIONAR O PRODUTO");
                            }

                        }
                            break;

                    case 3:
                        System.out.println("DIGITE O ID DO PRODUTO QUE VOCÊ DESEJA REMOVER: ");
                        int idRemovedor = Integer.parseInt(teclado.nextLine());
                        for (Mercado mercadoaRemover: mercados ){
                            if (mercadoaRemover.getId() == idRemovedor){
                                System.out.println("PRODUTO REMOVIDO COM SUCESSO");
                                mercadoaRemover.remover(idRemovedor);
                            }

                        }
                    break;
                        case 4:
                            System.out.println("VAMOS ALTERAR O PRODUTO A SUA ESCOLHA : ");
                            System.out.println("-------------------------------------------");
                            System.out.println("DIGITE A QUANTIDADE");
                            int quantidadeAlterada = Integer.parseInt(teclado.nextLine());
                            System.out.println("DIGITE O ID DO MERCADO REFERENTE QUE VOCÊ DESEJA ALTERAR: ");
                            int idMercadoAlterar = Integer.parseInt(teclado.nextLine());
                            System.out.println("DIGITE O ID DO PRODUTO REFERENTE QUE VOCÊ DESEJA ALTERAR: ");
                            int idProdutoAlterar = Integer.parseInt(teclado.nextLine());
                        Mercado mercadoAlterar = null;
                            for (Mercado mercado: mercados ){
                            if (mercado.getId() == idMercadoAlterar){
                                System.out.println("ID MERCADO ACHADO COM SUCESSO");
                                mercadoAlterar = mercado;



                            }

                        }
                        Produto produtoAlterar = null;
                            int vetor = 0;
                            int vetorPegado = 0;
                            for (Produto produto: mercadoAlterar.getListadeProdutos()){
                            if (produto.getIdProduto() == idProdutoAlterar){
                                System.out.println("ID PRODUTO ACHADO COM SUCESSO");
                                produtoAlterar = produto;
                                vetorPegado = vetor;
                            }
                            vetor++;
                            mercadoAlterar.alterar(vetorPegado,new Produto(produtoAlterar.getNome(),quantidadeAlterada,produtoAlterar.getIdProduto(),produtoAlterar.getPreco()));

                            }
                            break;


                    case 5:
                        for (Mercado mercado: mercados){
                            System.out.println(mercado.getListadeProdutos());

                        }

                        break;

                    case 6:
                        for(Mercado mercadosCadastrdos: mercados){
                            System.out.println(mercadosCadastrdos);
                        }
                }
            }

            if(opçaoEntrada == 2){
            System.out.println("BEM VINDO AO MODIFICADOR DO USUÁRIO: ");
            System.out.println("DIGITE ALGUMAS DAS OPÇÕES ABAIXO");
            System.out.println("----------------------------------");
            System.out.println("[1] LISTAR PRODUTOS DO MERCADO PELO ID ");
            System.out.println("[2] COLOCAR PRODUTO NO CARRINHO");
            System.out.print("[3] FECHAR A COMPRA");

            int opçoesUsuário = Integer.parseInt(teclado.nextLine());
            switch (opçoesUsuário){

                case 1:
                    System.out.println("VAMOS LISTAR OS PRODUTOS PELO ID DESEJADO");
                    int idMercadoDesejado = Integer.parseInt(teclado.nextLine());
                    for (Mercado mercadoDesejado: mercados ){
                        if (mercadoDesejado.getId() == idMercadoDesejado){
                            System.out.println(mercadoDesejado.getListadeProdutos());
                        }
                    }
                    break;

                    case 2:
                    System.out.println("DIGITE AS INFORMAÇÕES PARA TER ACESSO AO CARRINHO");
                    System.out.println("--------------------------------------------------");
                    System.out.println("DIGITE O NOME : ");
                    String nomePessoa = teclado.nextLine();
                    System.out.println("DIGITE ID PESSOA");
                    int idPessoa = Integer.parseInt(teclado.nextLine());
                    System.out.println("DIGITE O DINHEIRO: ");
                    int dinheiro = Integer.parseInt(teclado.nextLine());
                    Carrinho novoCarrinho = new Carrinho(new Pessoa(nomePessoa,idPessoa,dinheiro), new ArrayList<Produto>());

                    System.out.println("VAMOS À ALTERAÇÃO DA QUANTIDADE DO PRODUTO");
                    System.out.println("DIGITE O ID DO MERCADO :");
                    int idMercado = Integer.parseInt(teclado.nextLine());
                    System.out.println("DIGITE O ID DO PRODUTO :");
                    int idlocalizarIdproduto = Integer.parseInt(teclado.nextLine());
                    System.out.println("DIGITE A QUANTIDADE DESEJADA");
                    int alterarquantidadeProduto = Integer.parseInt(teclado.nextLine());

                    int contador = 0;
                    int contadorPegado = 0;
                    Mercado mercadoPegado =  null;

                    for (Mercado mercado: mercados){
                        if (mercado.getId() == idMercado ){
                            mercadoPegado = mercado;
                            contadorPegado = contador;
                        }
                        contador++;
                    }
                    Produto produtoPegado = null;
                    for(Produto produto:  mercadoPegado.getListadeProdutos()) {
                        if (produto.getIdProduto() == idlocalizarIdproduto){
                            if (produto.getPreco() >= 0){
                                if (produto.getQuantidade() <= alterarquantidadeProduto){
                                    produtoPegado = produto;
                                }else{
                                    System.out.println("QUANTIDADE QUE DESEJA ALTERAR EXCEDEU O A QUANTIDDE DISPONÍVEL");
                                }
                            }


                        }

                    }
                    novoCarrinho.adicionarCarrinho(new Produto(produtoPegado.getNome(),alterarquantidadeProduto,produtoPegado.getIdProduto(),produtoPegado.getPreco()));
                    produtoPegado.setQuantidade(produtoPegado.getQuantidade() - alterarquantidadeProduto);
                    mercadoPegado.alterar(contadorPegado,produtoPegado);
                    break;







            }
        }


        }

    }


}


