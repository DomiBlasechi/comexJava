package br.com.alura.comex.produto;

import com.google.gson.annotations.SerializedName;

// Entrega 2 - Classe Produto:
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public Produto(String nome, String descricao, double precoUnitario, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }
    public Produto(){

    }

    // Entrega 7 - Construtor que obriga um nome:
    public Produto(String nome){
        this.nome = nome;
    }

// Entrega 6 - Getters e setters (restrições):


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    // Entrega 4 - Método de impressão:
    @Override
    public String toString(){
        return "DADOS DO PRODUTO" + "\n==========================" +
                "\nNome: " + nome + "\nDescricao: " + descricao + "\npreco: " +
                precoUnitario + "\nquantidade" + quantidade + "\n==========================";
    }
}




