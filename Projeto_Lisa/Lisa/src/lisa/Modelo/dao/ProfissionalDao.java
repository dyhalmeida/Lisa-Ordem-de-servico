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
import javax.swing.JTable;
//import javax.swing.JOptionPane;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.Profissional;
import lisa.Telas.JanelaOSprofissional;
import lisa.Telas.TelaPesquisaProfissional;
import net.proteanit.sql.DbUtils;
//import lisa.Telas.TelaPesquisaProfissional;
//import net.proteanit.sql.DbUtils;

/**
 * @Classe ProfissionalDao Esta classe está relacionado a todas as operações de
 * banco de dados do objeto do tipo ProfissionalDao.
 * @author dyhalmeida
 */
public class ProfissionalDao {

    /**
     * @Atributos
     */
    private String sql;
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet rs;

    /**
     * @Construtor ProfissionalDao
     */
    public ProfissionalDao() {
        this.conexao = null;
        this.pstm = null;
        this.rs = null;
    }

    /**
     * @Método @CadastrarProfissional Este método tem como função cadastrar um
     * profissional recebendo por parâmetro um objeto do tipo Profissional.
     * @param profissional É um objeto do tipo Profissional.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado}
     * for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean cadastrarProfissional(Profissional profissional) {

        setSql(
                "insert into tb_profissional (id_profissional, nome_profissional, sobrenome_profissional) values (?,?,?)"
        );

        setConexao(BancoDeDados.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(profissional.getId()));
            getPstm().setString(2, profissional.getNome());
            getPstm().setString(3, profissional.getSobrenome());

            int resultado = getPstm().executeUpdate();

            if (resultado == 1) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Mensagem: " + e.getMessage());
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }

    /**
     * @Método @PesquisarListaProfissional Este método tem a função de pesquisar
     * uma lista de objetos do tipo Profissional no banco de dados e retornar
     * uma lista deste objetos.
     * @return Retorna um arrayList de Objetos do tipo Profissional.
     */
    public List<Profissional> pesquisarListaProfissional() {

        setConexao(BancoDeDados.getConnection());
        setSql("select * from tb_profissional");

        List<Profissional> profissionalList = new ArrayList<>();

        try {

            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());

            while (getRs().next()) {

                Profissional profissional = new Profissional();
                profissional.setId(getRs().getString(1));
                profissional.setNome(getRs().getString(2));
                profissional.setSobrenome(getRs().getString(3));

                profissionalList.add(profissional);

            }

            return profissionalList;

        } catch (SQLException e) {
            throw new RuntimeException("Erro pesquisar lista de profissional: " + e.getMessage());
            //return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }

    }

    /**
     * @Método @PesquisarProfissionalFiltro Este método tem como função
     * pesquisar um profissional através do seu nome passado por parâmetro e
     * armazenar numa tabela para interface com o usuário.
     * @param profissional É uma variável do tipo String que contém o nome do
     * profissional a ser pesquisado.
     */
    public void pesquisarProfissionalFiltro(String profissional, String tipoJanela) {

        setSql("select * from vProfissional where nome like ?");

        try {
            setConexao(BancoDeDados.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));

            getPstm().setString(1, "%" + profissional + "%");
            setRs(getPstm().executeQuery());

            if (tipoJanela.equalsIgnoreCase("TelaPesquisaProfissional")) {
                TelaPesquisaProfissional.jTablePesquisarProfissional.setModel(DbUtils.resultSetToTableModel(getRs()));
            }

            if (tipoJanela.equalsIgnoreCase("JanelaOSprofissional")) {
                JanelaOSprofissional.JT_tabelaPesquisaProfissionalOS.setModel(DbUtils.resultSetToTableModel(getRs()));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
    }

    /**
     * @Método @AtualizarProfissional Este método tem como função fazer um
     * upadte na tabela profissional para a atualização dos dados de um
     * profissional através do parâmetro recebido do tipo Profissional.
     * @param profissional É uma variável do tipo Profissional que contém todas
     * as informações do profissional..
     */
    public boolean atualizarProfissional(Profissional profissional) {

        setSql("update tb_profissional set nome_profissional = ?, sobrenome_profissional = ? where id_profissional = ?");

        try {

            setConexao(BancoDeDados.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, profissional.getNome());
            getPstm().setString(2, profissional.getSobrenome());
            getPstm().setInt(3, Integer.parseInt(profissional.getId()));

            int x = getPstm().executeUpdate();
            return x == 1;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar profissional: " + e.getMessage());
            return false;
        }
    }

    /**
     * @Método @DeletarProfissional Este método tem a função de apagar de uma
     * tabela do banco um profissional recebendo por parâmetro o seu ID.
     * @param id É uma variável do tipo String.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado}
     * for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean deletarProfissional(String id) {

        setSql("delete from tb_profissional where id_profissional = ?");
        try {
            setConexao(BancoDeDados.getConnection());
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(id));
            int x = getPstm().executeUpdate();
            return x == 1;

        } catch (SQLException e) {
            System.out.println("Erro ao deletar profissional: " + e.getMessage());
            return false;
        }
    }

    public Profissional pesquisarProfissional(String nomeProfissional) {

        setSql("select * from tb_profissional where nome_profissional = ?");
        setConexao(BancoDeDados.getConnection());

        Profissional profissional = new Profissional();

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, nomeProfissional);

            setRs(getPstm().executeQuery());

            if (getRs().next()) {
                profissional.setId(String.valueOf(getRs().getInt(1)));
                profissional.setNome(getRs().getString(2));
                profissional.setSobrenome(getRs().getString(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }

        return profissional;

    }

    /**
     * @Métodos Getters e Setters.
     */
    private String getSql() {
        return this.sql;
    }

    private void setSql(String sql) {
        this.sql = sql;
    }

    private Connection getConexao() {
        return this.conexao;
    }

    private void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    private PreparedStatement getPstm() {
        return this.pstm;
    }

    private void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    private ResultSet getRs() {
        return this.rs;
    }

    private void setRs(ResultSet rs) {
        this.rs = rs;
    }
}
