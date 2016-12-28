package lisa.Modelo.dao;

/**
 * @Importação bibliotecas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.OrdemServico;
import lisa.Telas.TelaPesquisaOS;
import net.proteanit.sql.DbUtils;

/**
 * @Classe OrdemServicoDao Esta classe está relacionado a todas as operações de
 * banco de dados do objeto do tipo OrdemServicoDao.
 * @author dyhalmeida
 */
public class OrdemServicoDao {

    /**
     * @Atributos
     */
    private String sql;
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet rs;

    /**
     * @Construtor OrdemServicoDao
     */
    public OrdemServicoDao() {
        setSql(null);
        setConexao(null);
        setPstm(null);
        setRs(null);
    }

    /**
     * @Método @CadastroOS Este método tem como função cadastrar uma ordem de
     * serviço recebendo por parâmetro um objeto do tipo OrdemServico.
     * @param Os É um objeto do tipo OrdemServico
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado}
     * for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean cadastrarOs(OrdemServico Os) {

        setConexao(BancoDeDados.getConnection());
        setSql("insert into tb_os (id_os, usuario_os, cliente_os, profissional_os, data_entrada_os, equipamento_os, defeito_os,"
                + "data_saida_os, valor_os, servico_os, situacao_os) values (?,?,?,?,?,?,?,?,?,?,?)");

        try {
            setPstm(getConexao().prepareStatement(getSql()));

            getPstm().setInt(1, Integer.parseInt(Os.getId())); // Pegando o id da ordem de serviço
            getPstm().setString(2, Os.getUsuario()); // Pegando o usuário/atendente da ordem de serviço
            getPstm().setInt(3, Integer.parseInt(Os.getCliente())); // Pegando o cliente da ordem de serviço
            getPstm().setInt(4, Integer.parseInt(Os.getProfissional())); // Pegando o profissional da ordem de Serviço
            getPstm().setString(5, Os.getDataEntrada()); // Peganda a data de entrada do equipamento da ordem de serviço
            getPstm().setString(6, Os.getEquipamento()); // Pegando o nome do equipamento da ordem de serviço
            getPstm().setString(7, Os.getDefeito()); // Pegando o defeito do equipamento da ordem de serviço
            getPstm().setString(8, Os.getDataSaida()); // Pegando a data de entrega do equipamento da ordem de serviço
            getPstm().setDouble(9, Double.parseDouble(Os.getValor().replace(",", ".")));// Pegando o valor da Ordem de serviço
            getPstm().setString(10, Os.getServico()); // Pegando o serviço a ser feito da ordem de serviço
            getPstm().setString(11, Os.getSituacao()); // Pegando a situação da ordem de serviço

            int resultado = getPstm().executeUpdate();

            return resultado == 1;

        } catch (SQLException e) {
            System.out.println("Erro cadastrar OS: " + e.getMessage());
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }

    }
    
    public void pesquisarOrdemDeServicoFiltro(String cpf){
        
        //View
        setSql("select * from vOrdemServico where cpf = ?");
        
        setConexao(BancoDeDados.getConnection());
        
        try {
            
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, cpf);
            
            setRs(getPstm().executeQuery());
            
            TelaPesquisaOS.JT_tabelaPesquisaOS.setModel(DbUtils.resultSetToTableModel(getRs()));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao pesquisar ordem de serviço: " + e.getMessage());
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
    }
    
    public Double pesquisarValorTotalOS(String data){
        
        setSql("select valor from valorTotal where situacao = 'Entregue' and Entrega = ?");
        setConexao(BancoDeDados.getConnection());
        
        Double valorTotal = 0.0;
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, data);
            setRs(getPstm().executeQuery());
            
            if(getRs().next()){
                valorTotal = getRs().getDouble(1);
            }
            return valorTotal;
        } catch (SQLException e) {
            return valorTotal;
        }
    }
    
    public boolean deleteOS(String idOS){
        setSql("delete from tb_os where id_os = ?");
        setConexao(BancoDeDados.getConnection());
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(idOS));
            int resultado = getPstm().executeUpdate();
            return resultado == 1;
        } catch (Exception e) {
            return false;
        }finally{
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    
    }
    
    public boolean updateOS(OrdemServico OS){
        
        setSql(
            "update tb_os set usuario_os = ?, cliente_os = ?,"
            + "profissional_os = ?, data_entrada_os = ?, equipamento_os = ?,"
            + "defeito_os = ?, data_saida_os = ?, valor_os = ?, servico_os = ?,"
            + "situacao_os = ? where id_os = ?"
        );
        
        setConexao(BancoDeDados.getConnection());
        
        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, OS.getUsuario());
            getPstm().setInt(2, Integer.parseInt(OS.getCliente()));
            getPstm().setInt(3, Integer.parseInt(OS.getProfissional()));
            getPstm().setString(4, OS.getDataEntrada());
            getPstm().setString(5, OS.getEquipamento());
            getPstm().setString(6, OS.getDefeito());
            getPstm().setString(7, OS.getDataSaida());
            getPstm().setDouble(8, Double.parseDouble(OS.getValor().replace(",", ".")));
            getPstm().setString(9, OS.getServico());
            getPstm().setString(10, OS.getSituacao());
            getPstm().setInt(11, Integer.parseInt(OS.getId()));
            
            int resultado = getPstm().executeUpdate();
            return resultado == 1;
            
        } catch (Exception e) {
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
