package loja.j;

/**
 *
 * @author a110051
 */
public class Produto implements Comparable {
    private int identificador;
    private int codigoBarras;
    private String nome;
    private String descricao;
    private float preco;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(int codigoBarras) {
        this.codigoBarras = codigoBarras;
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Object produto) {
        Produto p = (Produto) produto;
        if (this.getIdentificador() == p.getIdentificador()) {
            return 0;
        }
        else if (this.getIdentificador() < p.getIdentificador()) {
            return -1;
        } else {
            return 1;
        }
        //return this.getNome().compareTo(p.getNome());
    }
    
    public boolean equals (Object t) { 
        Produto p1 = (Produto) t;
        if(this.getIdentificador() == p1.getIdentificador()) {
            return true;
        } else {
            return false;
        }
    }
}
