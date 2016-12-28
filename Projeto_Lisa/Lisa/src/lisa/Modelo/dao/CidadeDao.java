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
import lisa.Modelo.beans.Cidade;
import lisa.Telas.TelaPesquisaCidade;
import net.proteanit.sql.DbUtils;

/**
 * @Classe CidadeDao Esta classe está relacionado a todas as operações de banco
 * de dados do objeto do tipo CidadeDao.
 * @author dyhalmeida
 */
public class CidadeDao {

    /**
     * @Atributos
     */
    private String sql;
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet rs;

    /**
     * @Construtor CidadeDao
     */
    public CidadeDao() {
        setSql(null);
        setConexao(null);
        setPstm(null);
        setRs(null);
    }

    /**
     * @Método @CadastrarCidade Este método tem a função de cadastrar uma cidade
     * recebendo por parâmetro um objeto do tipo Cidade.
     * @param cidade Este parâmetro é um objeto do tipo Cidade.
     * @return O retorno do método é true (Verdadeiro) se a a variável
     * {resultado} fo igual a 1 ou false (Falso) se for igual a 0.
     */
    public boolean cadastrarCidade(Cidade cidade) {

        setConexao(BancoDeDados.getConnection());
        setSql("insert into tb_cidade (id_cidade, nome_cidade, estado_cidade) values (?,?,?)");

        try {

            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(cidade.getId()));
            getPstm().setString(2, cidade.getNome());
            getPstm().setString(3, cidade.getEstado());

            int resultado = getPstm().executeUpdate();

            return resultado == 1;

        } catch (SQLException e) {
            //throw new RuntimeException("Erro cadastrar cidade: " + e.getMessage());
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }

    /**
     * @Método @PesquisarCidade Este método tem a função de pesquisar uma lista
     * de objetos do tipo Cidade no banco de dados e retornar uma lista deste
     * objetos.
     * @return Retorna um arrayList de Objetos do tipo Cidade.
     */
    public List<Cidade> pesquisarCidade() {

        setConexao(BancoDeDados.getConnection());
        setSql("select * from tb_cidade");

        List<Cidade> cidadeList = new ArrayList<>();
        try {

            setPstm(getConexao().prepareStatement(getSql()));
            setRs(getPstm().executeQuery());

            while (getRs().next()) {

                Cidade cidade = new Cidade();
                cidade.setId(getRs().getString(1));
                cidade.setNome(getRs().getString(2));
                cidade.setEstado(getRs().getString(3));
                cidadeList.add(cidade);
            }

            return cidadeList;

        } catch (SQLException e) {
            throw new RuntimeException("Erro pesquisar cidade: " + e.getMessage());
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }

    }

    /**
     * @Método @PesquisarCidade Este método tem a função de pesquisar uma lista
     * de objetos do tipo Cidade no banco de dados e retornar uma lista deste
     * objetos.
     * @param nomeCidade É um objeto do tipo String
     * @return Retorna um arrayList de Objetos do tipo Cidade.
     */
    public Cidade pesquisarCidade(String nomeCidade) {

        setConexao(BancoDeDados.getConnection());
        setSql("select * from tb_cidade where nome_cidade = ? ");

        Cidade cidade = new Cidade();
        try {

            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, nomeCidade);

            setRs(getPstm().executeQuery());

            if (getRs().next()) {
                cidade.setId(String.valueOf(getRs().getInt(1)));
                cidade.setNome(getRs().getString(2));
                cidade.setEstado(getRs().getString(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro pesquisar cidade: " + e.getMessage());
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }

        return cidade;
    }

    /**
     * @Método @PesquisarCidadeFiltro Este método tem a função de pesquisar uma
     * cidade pelo seu nome, através do objeto do tipo cidade passado por
     * parâmentro e preencher a tabela de interface com o usuário com os dados
     * pesquisados.
     * @param cidade É um objeto do tipo Cidade.
     */
    public void pesquisarCidadeFiltro(Cidade cidade) {
        
        setSql("select * from vCidade where Cidade like ?");
        setConexao(BancoDeDados.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, "%" + cidade.getNome() + "%");

            setRs(getPstm().executeQuery());
            //A linha abaixo preenche a tabela com o resultado do ResultSet
            TelaPesquisaCidade.jTable_CidadePesquisa.setModel(DbUtils.resultSetToTableModel(getRs()));

        } catch (SQLException e) {
            System.out.println("Erro ao pesquisar cidade: " + e.getMessage());
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }
    }

    /**
     * @Método @AtualizarCidade Este método tem como função fazer um update na
     * tabela cidade para a atualização dos dados de uma cidade através do
     * parâmetro recebido do tipo Cidade.
     * @param cidade É uma variável do tipo Cidade que contém todas as
     * informações da cidade.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado}
     * for igual a 1 ou fale (Falso) se o resultado for igual a 0.
     */
    public boolean atualizarCidade(Cidade cidade) {
        
        setSql("update tb_cidade set nome_cidade = ?, estado_cidade =? where id_cidade = ?");
        setConexao(BancoDeDados.getConnection());

        try {

            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, cidade.getNome());
            getPstm().setString(2, cidade.getEstado());
            getPstm().setInt(3, Integer.parseInt(cidade.getId()));

            int resultado = getPstm().executeUpdate();

            return resultado == 1;

        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cidade:" + e.getMessage());
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }

    /**
     * @Método @DeletarCidade Este método tem a função de apagar de uma tabela
     * do banco uma cidade recebendo por parâmetro o seu ID.
     * @param cidade É um objeto do tipo Cidade.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado}
     * for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean deletarCidade(Cidade cidade) {
        
        setSql("delete from tb_cidade where id_cidade = ?");
        setConexao(BancoDeDados.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(cidade.getId()));

            int resultado = getPstm().executeUpdate();
            return resultado == 1;

        } catch (SQLException e) {
            System.out.println("Erro ao deletar cidade:" + e.getMessage());
            return false;
        } finally {
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
