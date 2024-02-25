package br.com.alura.comex.produto;
import br.com.alura.comex.produto.Produto;
public class Livro extends Produto {
    private String isbn;
    private int totalDePaginas;


    // Construtor que retorna a identificação obrigatória

    public Livro(String nome, String isbn) {
        super(nome);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public Livro(String nome, String descricao, double precoUnitario, int quantidade,
                 String isbn, int totalDePaginas) {
        this.isbn = isbn;
        this.totalDePaginas = totalDePaginas;
    }
}


