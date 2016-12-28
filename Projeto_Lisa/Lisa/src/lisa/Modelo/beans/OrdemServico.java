package lisa.Modelo.beans;

/**
 * @Classe 
 * @OrdemServico
 * @author dyhalmeida
 */
public class OrdemServico {
    
    /**
     * @Atributos
     */
    private String id;
    private String usuario;
    private String cliente;
    private String profissional;
    private String dataEntrada;
    private String equipamento;
    private String defeito;
    private String dataSaida;
    private String valor;
    private String servico;
    private String situacao;
    
    /**
     * @Construtor
     */
    public OrdemServico(){
        
        setId(null);
        setUsuario(null);
        setCliente(null);
        setProfissional(null);
        setDataEntrada(null);
        setEquipamento(null);
        setDefeito(null);
        setDataSaida(null);
        setValor(null);
        setServico(null);
        setSituacao(null);
    
    }
    
    /**
     * @Método
     * @VerificarCampos Verifica se os campos estao nulos ou não.
     * @return Retorna false (Falso) se os campos estiverem nulos ou true (Verdadeiro) se não estiverem nulos.
     */
    public boolean verificarCamposOs(){
        if(getId().isEmpty() || getProfissional().isEmpty() || getUsuario().isEmpty() || getCliente().isEmpty() || getDataEntrada().isEmpty()
           || getEquipamento().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    /**
     * @Métodos Getters e Setters
     */
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getProfissional() {
        return profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = profissional;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
