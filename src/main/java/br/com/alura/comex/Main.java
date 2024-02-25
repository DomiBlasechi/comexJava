package br.com.alura.comex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URISyntaxException;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
<<<<<<< Updated upstream
=======
import java.util.Scanner;
>>>>>>> Stashed changes

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) throws IOException, URISyntaxException {
        Pedido[] pedidos = ProcessadorDeCsv.processaArquivo("pedidos.csv");

        int totalDeProdutosVendidos = 0;
        int totalDePedidosRealizados = 0;
        BigDecimal montanteDeVendas = BigDecimal.ZERO;
        Pedido pedidoMaisBarato = null;
        Pedido pedidoMaisCaro = null;

        String[] categoriasProcessadas = new String[10];
        int totalDeCategorias = 0;

        for (int i = 0; i < pedidos.length; i++) {
            Pedido pedidoAtual = pedidos[i];

            if (pedidoAtual == null) {
                break;
            }

            if (pedidoMaisBarato == null || pedidoAtual.getPreco().multiply(new BigDecimal(pedidoAtual.getQuantidade())).compareTo(pedidoMaisBarato.getPreco().multiply(new BigDecimal(pedidoMaisBarato.getQuantidade()))) < 0) {
                pedidoMaisBarato = pedidoAtual;
            }

            if (pedidoMaisCaro == null || pedidoAtual.getPreco().multiply(new BigDecimal(pedidoAtual.getQuantidade())).compareTo(pedidoMaisCaro.getPreco().multiply(new BigDecimal(pedidoMaisCaro.getQuantidade()))) > 0) {
                pedidoMaisCaro = pedidoAtual;
            }

            montanteDeVendas = montanteDeVendas.add(pedidoAtual.getPreco().multiply(new BigDecimal(pedidoAtual.getQuantidade())));
            totalDeProdutosVendidos += pedidoAtual.getQuantidade();
            totalDePedidosRealizados++;

            boolean jahProcessouCategoria = false;
            for (int j = 0; j < categoriasProcessadas.length; j++) {
                if (pedidoAtual.getCategoria().equalsIgnoreCase(categoriasProcessadas[j])) {
                    jahProcessouCategoria = true;
                }
            }

            if (!jahProcessouCategoria) {
                totalDeCategorias++;

                if (categoriasProcessadas[categoriasProcessadas.length - 1] != null) {
                    categoriasProcessadas = Arrays.copyOf(categoriasProcessadas, categoriasProcessadas.length * 2);
                } else {
                    for (int k = 0; k < categoriasProcessadas.length; k++) {
                        if (categoriasProcessadas[k] == null) {
                            categoriasProcessadas[k] = pedidoAtual.getCategoria();
                            break;
                        }
                    }
                }
            }
        }

        logger.info("##### RELATÓRIO DE VALORES TOTAIS #####");
        logger.info("TOTAL DE PEDIDOS REALIZADOS: {}", totalDePedidosRealizados);
        logger.info("TOTAL DE PRODUTOS VENDIDOS: {}", totalDeProdutosVendidos);
        logger.info("TOTAL DE CATEGORIAS: {}", totalDeCategorias);
        logger.info("MONTANTE DE VENDAS: {}", NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(montanteDeVendas.setScale(2, RoundingMode.HALF_DOWN)));
        logger.info("PEDIDO MAIS BARATO: {} ({})", NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(pedidoMaisBarato.getPreco().multiply(new BigDecimal(pedidoMaisBarato.getQuantidade())).setScale(2, RoundingMode.HALF_DOWN)), pedidoMaisBarato.getProduto());
        logger.info("PEDIDO MAIS CARO: {} ({})\n", NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(pedidoMaisCaro.getPreco().multiply(new BigDecimal(pedidoMaisCaro.getQuantidade())).setScale(2, RoundingMode.HALF_DOWN)), pedidoMaisCaro.getProduto());
        logger.info("### FIM DO RELATÓRIO ###");
<<<<<<< Updated upstream
    }
=======

        int opcao = 0;
        Scanner menu = new Scanner(System.in);
        while (opcao != 4) {
            System.out.print("##------BEM-VINDO A COMEX!!-----##\n\n");
            System.out.print("|----------------------------------|\n");
            System.out.print("| Opção 1 - Clientes          |\n");
            System.out.print("| Opção 2 - Produtos          |\n");
            System.out.print("| Opção 3 - Cadastrar cliente |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.println("Digite uma opção: ");
            try {
                opcao = Integer.parseInt(menu.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("\nExibindo lista de clientes.\n");
                        break;
                    case 2:
                        System.out.print("\nExibindo lista de produtos.\n");
                        break;
                    case 3:
                        System.out.print("\nCadastro de novos clientes.\n");
                        break;
                    case 4:
                        System.out.print("\nVocê escolheu encerrar a aplicação.");
                        break;
                    default:
                        System.out.print("\nOpção inválida! Digite um número de 1 a 4.");
                        break;
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println("Caractere não permitido, digite de 1 a 4");
            }
        }
    }

>>>>>>> Stashed changes
}