package lisa.Modelo.beans;

/**
 * @author dyhalmeida
 */
public class Cliente extends Pessoa {

    /**
     * @Atributos 
     */
    private String nascimento;
    private String telefone;
    private String email;
    private String rg;
    private String cpf;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;

    /**
     * @Método
     * @VerificarCamposCliente Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposCliente() {
        if (getId().isEmpty() || getNome().isEmpty() || getSobrenome().isEmpty() || getNascimento().isEmpty()
                || getRg().isEmpty() || getCpf().isEmpty() || getLogradouro().isEmpty() || getNumero().isEmpty()
                || getBairro().isEmpty() || getCidade().isEmpty()) {

            return false;

        } else {
            return true;
        }
    }

    
    /**
     * 
     * @Métodos Getters e Setters 
     */
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
