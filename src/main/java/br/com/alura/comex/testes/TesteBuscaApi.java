package br.com.alura.comex.testes;

import br.com.alura.comex.produto.ProdutoFakeStore;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

// Semana 5 - Entrega 5 e 6: fazendo consulta para a API.

public class TesteBuscaApi {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("|----------------------------------|\n" +
                "|  ***** BUSCA DE PRODUTOS *****   |\n" +
                "|----------------------------------|\n" +
                "Digite a id de um produto: \n");
        int busca = Integer.parseInt(leitura.nextLine());
        String endereco = "http://fakestoreapi.com/products/" + busca;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        ProdutoFakeStore novoProdutoFake = gson.fromJson(json, ProdutoFakeStore.class);
        System.out.println(novoProdutoFake);
    }

}
