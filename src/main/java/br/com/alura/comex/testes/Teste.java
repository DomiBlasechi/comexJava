package br.com.alura.comex.testes;

import br.com.alura.comex.produto.Produto;

import java.util.ArrayList;

public class Teste {
    public static void TesteProdutos (String[] args) {

        Produto celular1 = new Produto();
        celular1.setNome("iPhone 13");
        celular1.setDescricao("Celular iPhone 13 com 256gb.");
        celular1.setPrecoUnitario(13999.99);
        celular1.setQuantidade(5);

        Produto celular2 = new Produto();
        celular2.setNome("Samsung A54");
        celular2.setDescricao("Celular Samsung A54 com 256gb.");
        celular2.setPrecoUnitario(1979.99);
        celular2.setQuantidade(10);

        System.out.println(celular1.toString());
        System.out.println(celular2.toString());

        //Entrega 3 - Comparando os dois produtos:

        System.out.println("Comparação entre os produtos é " + (celular1 == celular2) + "\n************************");

        // Entrega 8 - Lista de desejos

        ArrayList<String> listaDesejos = new ArrayList<>();
        listaDesejos.add(celular1.getNome());
        listaDesejos.add(celular2.getNome());



    }

}

