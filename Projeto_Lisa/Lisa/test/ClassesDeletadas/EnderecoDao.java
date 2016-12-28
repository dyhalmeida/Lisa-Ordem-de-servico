package ClassesDeletadas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lisa.BancoDeDados.BancoDeDados;


public class EnderecoDao {
    
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;
    
    public EnderecoDao(){
        setConexao(null);
        setPstm(null);
        setRs(null);
        setSql(null);
    }
    
    public boolean cadastrarEndereco(Endereco endereco){
        
        setConexao(BancoDeDados.getConnection());
        setSql("insert into tb_endereco (id_endereco, logradouro_endereco, numero_endereco, bairro_endereco) values (?, ?, ?, ?)");
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            
            getPstm().setInt(1, Integer.parseInt(endereco.getId()));
            getPstm().setString(2, endereco.getLogradouro());
            getPstm().setInt(3, Integer.parseInt(endereco.getNumero())); 
            getPstm().setInt(4, Integer.parseInt(endereco.getBairro()));            
            
            int resultado = getPstm().executeUpdate();
            
            //Se for igual a 1 retorna true se não retorna false
            return resultado == 1; 
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro cadastrar endereço: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    
    }
    
    public List<Endereco> pesquisarEndereco(){
        
        setConexao(BancoDeDados.getConnection());
        setSql("select * from tb_endereco");
        
        List<Endereco> enderecoList = new ArrayList<>();
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());
            
            while(getRs().next()){
            
                Endereco endereco = new Endereco();
                endereco.setId(getRs().getString(1));
                endereco.setLogradouro(getRs().getString(2));
                endereco.setNumero(getRs().getString(3));
                endereco.setBairro(getRs().getString(4));
                enderecoList.add(endereco);
                
            }
            
        } catch (SQLException e) {
            throw new RuntimeException("Erro pesquisar Endereço: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
        
        return enderecoList;
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

    private String getSql() {
        return sql;
    }

    private void setSql(String sql) {
        this.sql = sql;
    }
}
