package lisa.Modelo.dao;

/**
 * @Importação bibliotecas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.Bairro;
import lisa.Telas.TelaPesquisaBairro;
import net.proteanit.sql.DbUtils;


/**
 * @Classe BairroDao
 * Esta classe esta relacionada a todas a operações envolvendo banco de dados para o objeto do tipo BairroDao.
 * @author dyhalmeida
 */
public class BairroDao {
    
    /**
     * @Atributos
     */
    private String sql;
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet rs;

    /**
     * @Construtor BairroDao
     */
    public BairroDao() {
        setSql(null);
        setConexao(null);
        setPstm(null);
        setRs(null);   
    }
    
    /**
     * @Método
     * @CadastrarBairro Este método tem a função de cadastrar informações de um bairro com passagem de
     * um objeto por parâmetro do tipo Bairro e retorna um valor lógico se cadastrado ou não.
     * @param bairro é um objeto do tipo Bairro
     * @return  O retorno do método é true (Verdadeiro) se a variável {resultado} for igual a 1 ou  (Falso) se igual a 0
     */
    public boolean cadastrarBairro(Bairro bairro){
        
        setSql("insert into tb_bairro values (?,?)");
        setConexao(BancoDeDados.getConnection());
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(bairro.getId()));
            getPstm().setString(2, bairro.getBairro());
            
            int resultado = getPstm().executeUpdate();
            
            return resultado == 1; //Se true cadastrou, se false não cadastrou
            
        } catch (SQLException e) {
            //System.out.println("Mensagem: " + e.getMessage());
            return false;
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    
    }

    /**
     * @Método
     * @PesquisarBairro Este método tem a função de pesquisar uma lista de objetos do tipo bairro no banco de dados e retornar uma lista deste objetos.
     * @return Retorna um arrayList de Objetos do tipo Bairro.
     */
    public List<Bairro> pesquisarBairro(){
        
        setSql("select * from tb_bairro");
        setConexao(BancoDeDados.getConnection());
        
        List<Bairro> bairroList = new ArrayList<>();
        
        
        try {
            
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            
            while(getRs().next()){
                
                Bairro bairro = new Bairro();
                bairro.setId(Integer.toString(getRs().getInt(1)));
                bairro.setBairro(getRs().getString(2));
                bairroList.add(bairro);           
            }
            
            
            
        } catch (Exception e) {
            throw new RuntimeException("Erro pesquisarBairro: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
        
        return bairroList;
        
    }
    
      /**
     * @Método
     * @PesquisarBairro Este método tem a função de pesquisar uma lista de objetos do tipo bairro no banco de dados e retornar uma lista deste objetos.
     * @param nomeBairro é um objeto do tipo String
     * @return Retorna um arrayList de Objetos do tipo Bairro.
     */
    public Bairro pesquisarBairro(String nomeBairro){
        
        setSql("select * from tb_bairro where nome_bairro = ?");
        setConexao(BancoDeDados.getConnection());
        
        Bairro bairro = new Bairro();
         
        try{
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, nomeBairro);
            
            
            setRs(getPstm().executeQuery());
            
            if(getRs().next()){
                bairro.setId(String.valueOf(getRs().getInt(1)));
                bairro.setBairro(getRs().getString(2));
            }
            
              
        } catch (Exception e) {
            throw new RuntimeException("Erro pesquisarBairro: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
        
        return bairro;   
    }
    
    
    /**
     * @Método
     * @PesquisarBairroFiltro Este método tem como função pesquisar um bairro através do seu nome passado por parâmetro
     * e armazenar numa tabela para interface com o usuário.
     * @param bairro É uma variável do tipo String que contém o nome do bairro a ser pesquisado.
     */
    public void pesquisarBairroFiltro(String bairro){
        
        setSql("select * from vBairro where bairro like ?");
        setConexao(BancoDeDados.getConnection());
        
        try {
            
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, "%" + bairro + "%");
            
            setRs(getPstm().executeQuery());
            
            //A linha abaixo preenche a tabela com o resultado da pesquisa através do ResultSet
            TelaPesquisaBairro.jTable_BairroPesquisa.setModel(DbUtils.resultSetToTableModel(getRs()));
            
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao pesquisar bairro: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
            
    
    }
    
    
    /**
     * @Método
     * @DeletarBairro Este método tem a função de deletar um bairro da tabela do banco através do bairro passado por parâmetro.
     * @param bairro É um objeto do tipo Bairro
     * @return O retorno do método é true (Verdadeiro) quando a variável {resultado} for igual a 1 ou false (Falso) quando for 0.
     */
    public boolean deletarBairro(Bairro bairro){
    
        setSql("delete from tb_bairro where id_bairro = ?");
        setConexao(BancoDeDados.getConnection());
        
        try {
            
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(bairro.getId()));
            
            int resultado = getPstm().executeUpdate();
            
            return resultado == 1;
            
        } catch (SQLException e) {
            System.out.println("Erro deletar bairro: " + e.getMessage());
            return false;
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
            
        
    }
    
    public boolean atualizarBairro(Bairro bairro){
        
        setSql("update tb_bairro set nome_bairro = ? where id_bairro = ?");
        setConexao(BancoDeDados.getConnection());
        
        try {
            
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, bairro.getBairro());
            getPstm().setInt(2, Integer.parseInt(bairro.getId()));
            
            int resultado = getPstm().executeUpdate();
            //A linha abaixo retorna um resultado lógico true ou false
            return resultado == 1;
            
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar bairro: " + e.getMessage());
            return false;
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
            
            
    }
    
    /**
     * @Métodos Getters e Setters
     */
    private String getSql() {
        return sql;
    }

    private void setSql(String sql) {
        this.sql = sql;
    }

    private Connection getConexao() {
        return conexao;
    }

    private void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    private PreparedStatement getPstm() {
        return pstm;
    }

    private void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    private ResultSet getRs() {
        return rs;
    }

    private void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}
