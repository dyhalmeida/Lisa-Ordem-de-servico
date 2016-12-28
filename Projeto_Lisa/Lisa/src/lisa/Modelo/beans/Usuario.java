package lisa.Modelo.beans;

/**
 * @Classe Usuario
 *  Esta classe é um modelo para amazenar informações do Usuário
 * @author dyhalmeida
 */
public class Usuario extends Pessoa {

    /**
     * @Atributos
     */
    private String login;
    private String senha;

    /**
     * @Construtor
     */
    public Usuario() {
        super.setId(null);
        super.setNome(null);
        super.setSobrenome(null);
        setLogin(null);
        setSenha(null);
    }

    /**
     * @Método
     * @VerificarCamposUsuario Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposUsuario() {
        
        if (super.getId().isEmpty() || super.getNome().isEmpty()
           || super.getSobrenome().isEmpty() || this.getLogin().isEmpty() || this.getSenha().isEmpty())
        {
            return false;
        } else {
            return true;
        }
    }

    /**
     * @Métodos Getters e Setters
     */
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return getNome() + " " + getSobrenome();
    }

    
}
