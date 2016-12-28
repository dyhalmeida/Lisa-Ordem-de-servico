package ClassesDeletadas;

public class Endereco {
    
    private String id;
    private String logradouro;
    private String numero;
    private String bairro;
    
    public boolean verificarCamposEndereco(){
        
        if(getId().isEmpty() || getLogradouro().isEmpty() || getNumero().isEmpty() || getBairro().isEmpty()){
            return false;
        }else{
            return true;
        }  
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return getLogradouro(); //To change body of generated methods, choose Tools | Templates.
    }
}
