package lisa.Modelo.beans;

/**
 * @Classe Pessoa
 * Está classe é um modelo para o conceito de herança
 * @author dyhalmeida
 */
public class Pessoa {
    
    /**
     * @Atributos
     */
    private String id;
    private String nome;
    private String sobrenome;

    /**
     * @Métodos Getters e Setters
     */
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public String getId(){
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
