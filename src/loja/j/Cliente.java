package loja.j;

/**
 *
 * @author a110051
 */
public class Cliente {
    private String rg;
    private String nome;
    private String data_nascimento;
    private String cidade_residencia;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCidade_residencia() {
        return cidade_residencia;
    }

    public void setCidade_residencia(String cidade_residencia) {
        this.cidade_residencia = cidade_residencia;
    }
    
}
