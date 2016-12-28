package lisa.Modelo.beans;

/**
 * @Classe  UsuarioLogin
 *  Esta classe é um modelo para amazenar informações do Login do Usuário
 * @author dyhalmeida
 */
public class UsuarioLogin extends Usuario {
    
    /**
     * @Construtor
     */
    public UsuarioLogin(){
        super.setLogin(null);
        super.setSenha(null);
    }
    
    /**
     * @Método
     * @VerificarCamposUsuarioLogin Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposUsuarioLogin(){
        if(super.getLogin().isEmpty() || super.getSenha().isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    
}
