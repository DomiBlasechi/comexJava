package br.com.alura.comex.produto;
import br.com.alura.comex.produto.Produto;
public class ProdutoEletronico extends Produto{
    private int voltagem;
    private int potencia;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public ProdutoEletronico(String nome, String descricao, double precoUnitario, int quantidade,
                             int voltagem, int potencia) {
        this.voltagem = voltagem;
        this.potencia = potencia;
    }
}
