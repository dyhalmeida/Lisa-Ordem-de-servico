package lisa.Modelo.beans;

/**
 * @Classe Profissinal
 * Esta classe é um modelo para amazenar informações do profissional
 * @author dyhalmeida
 */
public class Profissional extends Pessoa {
    
    /**
     * @Construtor
     */
    public Profissional(){
        super.setId(null);
        super.setNome(null);
        super.setSobrenome(null);
    }
    
    /**
     * @Método
     * @VerificarCamposProfissional Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposProfissional(){
    
        if((super.getId().isEmpty() || super.getNome().isEmpty() || super.getSobrenome().isEmpty())){
            return false;
        }else{
            return true;
        }
    }

    /**
     * @Polimorfismo
     */
    @Override
    public String toString() {
        return getNome() + " " + getSobrenome();
    }
    
    
}
