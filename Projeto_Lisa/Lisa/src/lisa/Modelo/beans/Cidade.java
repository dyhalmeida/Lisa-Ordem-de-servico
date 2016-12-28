package lisa.Modelo.beans;

/**
 * 
 * @author dyhalmeida
 */
public class Cidade {
    
    /**
     * @Atributos da Classe
     */
    private String id;
    private String nome;
    private String estado;
    
    /**
     * @Construtor da Classe
     */
    public Cidade(){
        setId(null);
        setNome(null);
        setEstado(null);
    }
    
    /**
     * 
     * @Metodo
     * @VerificarCamposCidade Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposCidade(){
        if(getId().isEmpty() || getNome().isEmpty() || getEstado().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    
    /**
     * @Métodos Getters e Setters 
     */
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return getNome(); 
    }
}
