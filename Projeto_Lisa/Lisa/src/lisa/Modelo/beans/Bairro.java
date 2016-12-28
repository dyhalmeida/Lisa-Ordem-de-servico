package lisa.Modelo.beans;

/**
 * @author dyhalmeida
 */
public class Bairro {
    
    /**
     * @Atributos
     */
    private String id;
    private String bairro;
    
    /**
     * @Construtor Bairro
     */
    public Bairro(){
        setId(null);
        setId(null);
    }
    
    /**
     * @Método
     * @VerificarCamposBairro Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposBairro(){
        if(this.getId().isEmpty() || this.getBairro().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    
    /**
     * @ Métodos Getters e Setters
     */
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    } 

    
    //Sobreescrita do método toString para pegar descrição do objeto no jcomboBox
    @Override
    public String toString() {
        return getBairro();
    } 
}
