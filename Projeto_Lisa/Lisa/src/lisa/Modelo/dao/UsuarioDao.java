package lisa.Modelo.dao;

/**
 * @Importação bibliotecas.
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.Usuario;
import lisa.Telas.TelaPesquisarUsuario;
import net.proteanit.sql.DbUtils;

/**
 * @Classe UsuarioDao.
 * Esta classe está relacionado a todas as operações de banco de dados do objeto do tipo UsuarioDao.
 * @author dyhalmeida
 */
public class UsuarioDao {

    /**
     *  @Atributos
     */
    private Connection conexao;
    private String sql;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    /**
     *  @Construtor UsuarioDao
     */
    public UsuarioDao(){
        this.conexao = null;
        this.pstm = null;
        this.rs = null;
    }
    
    
      /**
     * @Método
     * @CadastrarUsuario Este método tem como função cadastrar um usuáriol recebendo por parâmetro um objeto do tipo Usuariol.
     * @param usuario É um objeto do tipo Usuario.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado} for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean cadastrarUsuario(Usuario usuario){
        
        setSql(
                "insert into tb_usuario (id_usuario, nome_usuario, sobrenome_usuario, login_usuario, senha_usuario) values (?,?,?,?,?)"
        );
        
        setConexao(BancoDeDados.getConnection());
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            //this.getPstm().setInt(1, Integer.parseInt(usuario.getId()));
            getPstm().setString(1, usuario.getId());
            getPstm().setString(2, usuario.getNome());
            getPstm().setString(3, usuario.getSobrenome());
            getPstm().setString(4, usuario.getLogin());
            getPstm().setString(5, usuario.getSenha());
            
            int resultado = getPstm().executeUpdate();
            
            if(resultado == 1){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException sqlException) {
            System.out.println("Exception: " + sqlException.getMessage());
            return false;
        } finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }
    
         /**
     * @Método
     * @PesquisarListaUsuario Este método tem a função de pesquisar uma lista de objetos do tipo Usuario no banco de dados
     * e retornar uma lista deste objetos.
     * @return Retorna um arrayList de Objetos do tipo Usuario.
     */
//    public List<Usuario> pesquisarListaUsuario(){
//        
//        setConexao(BancoDeDados.getConnection());
//        setSql("select * from tb_usuario");
//        
//        List<Usuario> usuarioList = new ArrayList<>();
//        
//        try {
//            
//            setPstm(getConexao().prepareStatement(getSql()));
//            
//            setRs(getPstm().executeQuery());
//            
//            while(getRs().next()){
//                
//                Usuario usuario = new Usuario();
//                usuario.setId(getRs().getString(1));
//                usuario.setNome(getRs().getString(2));
//                usuario.setSobrenome(getRs().getString(3));
//                usuario.setLogin(getRs().getString(4));
//                usuario.setSenha(getRs().getString(5));
//                usuarioList.add(usuario);
//            }
//            
//            
//        } catch (SQLException e) {
//            throw new RuntimeException("Erro pesquisar Lista de usuario: " + e.getMessage());
//            //return false;
//        }finally{
//            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
//        }
//        
//        return usuarioList;
//    }
     
     /**
     * @Método
     * @PesquisarUsuarioFiltro Este método tem como função pesquisar um usuario através do seu nome passado por parâmetro
     * e armazenar numa tabela para interface com o usuário.
     * @param usuario É uma variável do tipo String que contém o nome do usuario a ser pesquisado.
     */
    public void pesquisarUsuarioFiltro(String usuario){
        //System.out.println("Banco: " + stringPesquisa);
        setSql("select * from vUsuario where nome like ?");
        
        try {
            
            setConexao(BancoDeDados.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));
            
            getPstm().setString(1, "%" + usuario + "%");
            setRs(getPstm().executeQuery());
            
            
            TelaPesquisarUsuario.jTablePesquisarUsuario.setModel(DbUtils.resultSetToTableModel(getRs()));
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao pesquisar usuario por filtro: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
    }
    
        /**
     * @Método
     * @AtualizarUsuario Este método tem como função fazer um update na tabela usuario para a atualização dos dados de um usuario através
     * do parâmetro recebido do tipo Usuario.
     * @param usuario É uma variável do tipo Usuario que contém todas as informações do usuário.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado} for igual a 1 ou fale (Falso) se o resultado for igual a 0.
     */
    public boolean atualizarUsuario(Usuario usuario){
        
        setSql("update tb_usuario set nome_usuario = ?, sobrenome_usuario = ?, login_usuario = ?, senha_usuario = ? where id_usuario = ?");
        
        try {
             setConexao(BancoDeDados.getConnection());
             setPstm(getConexao().prepareStatement(getSql()));
             
             getPstm().setString(1, usuario.getNome());
             getPstm().setString(2, usuario.getSobrenome());
             getPstm().setString(3, usuario.getLogin());
             getPstm().setString(4, usuario.getSenha());
             getPstm().setInt(5, Integer.parseInt(usuario.getId()));
             
             int n = getPstm().executeUpdate();
             
             return n == 1;
             
        } catch (SQLException e) {
            System.out.println("Erro update Usuario: " + e.getMessage());
            return false;
            
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
      
    }
    
    
      /**
     * @Método
     * @DeletarUsuario Este método tem a função de apagar de uma tabela do banco um usuário recebendo por parâmetro o seu ID.
     * @param usuario  É uma variável do tipo String.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado} for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean deletarUsuario(Usuario usuario){
        
        setSql("delete from tb_usuario where id_usuario = ?");
        
        try {
            
            setConexao(BancoDeDados.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));
            
            getPstm().setInt(1, Integer.parseInt(usuario.getId()));
            
            int x = getPstm().executeUpdate();
            return x == 1;
            
        } catch (SQLException e) {
            System.out.println("Erro ao deletar usuario: " + e.getMessage());
            return false;
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
        
    }

    
    /**
     *  @Métodos Getters e Setters
     */
    private Connection getConexao() {
        return conexao;
    }

    private void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    private String getSql() {
        return sql;
    }

    private void setSql(String sql) {
        this.sql = sql;
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
