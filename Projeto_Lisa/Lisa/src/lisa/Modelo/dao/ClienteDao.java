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
import javax.swing.JOptionPane;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.Cliente;
import lisa.Telas.JanelaOScliente;
import lisa.Telas.TelaPesquisaCliente;
import net.proteanit.sql.DbUtils;

/**
 * @Classe ClienteDao Esta classe está relacionado a todas as operações de banco
 * de dados do objeto do tipo ClienteDao.
 * @author dyhalmeida
 */
public class ClienteDao {

    /**
     * @Atributos
     */
    private Connection conexao;
    private PreparedStatement pstm;
    private ResultSet rs;
    private String sql;

    /**
     * @Construtor ClienteDao
     */
    public ClienteDao() {
        setConexao(null);
        setPstm(null);
        setRs(null);
        setSql(null);
    }

    /**
     * @Método @CadastrarCliente Este método tem a função de cadastrar um clinte
     * recebendo por parâmetro um objeto do tipo Cliente.
     * @param cliente Este parâmetro é um objeto do tipo Cliente.
     * @return O retorno do método é true (Verdadeiro) se a a variável
     * {resultado} fo igual a 1 ou false (Falso) se for igual a 0.
     */
    public boolean cadastrarCliente(Cliente cliente) {

        setConexao(BancoDeDados.getConnection());
        setSql("insert into tb_cliente (id_cliente, nome_cliente, sobrenome_cliente, nascimento_cliente, telefone_cliente, email_cliente, rg_cliente, cpf_cliente, logradouro_cliente, numero_endereco_cliente, bairro_cliente, cidade_cliente) values (?,?,?,?,?,?,?,?,?,?,?,?)");

        try {
            setPstm(getConexao().prepareStatement(getSql()));

            getPstm().setInt(1, Integer.parseInt(cliente.getId()));
            getPstm().setString(2, cliente.getNome());
            getPstm().setString(3, cliente.getSobrenome());
            getPstm().setInt(4, Integer.parseInt(cliente.getNascimento()));
            getPstm().setString(5, cliente.getTelefone());
            getPstm().setString(6, cliente.getEmail());
            getPstm().setString(7, cliente.getRg());
            getPstm().setString(8, cliente.getCpf());
            getPstm().setString(9, cliente.getLogradouro());
            getPstm().setInt(10, Integer.parseInt(cliente.getNumero()));
            getPstm().setInt(11, Integer.parseInt(cliente.getBairro()));
            getPstm().setInt(12, Integer.parseInt(cliente.getCidade()));

            int resultado = getPstm().executeUpdate();
            //System.out.println("Resultado cad cliente: " + resultado);

            return resultado == 1;

        } catch (SQLException e) {
            //throw new RuntimeException("Erro cadastrar cliente: " + e.getMessage());
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }

    /**
     * @Método @PesquisarCliente Este método tem a função de pesquisar uma lista
     * de objetos do tipo Cliente no banco de dados e retornar uma lista deste
     * objetos.
     * @return Retorna um arrayList de Objetos do tipo Cliente.
     */
    public List<Cliente> pesquisarCliente(Cliente cliente) {

        setConexao(BancoDeDados.getConnection());
        setSql("select * from tb_cliente where nome_cliente like ?");

        //lista 
        List<Cliente> clienteList = new ArrayList<>();

        try {

            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, "%" + cliente.getNome() + "%");

            setRs(getPstm().executeQuery());

            while (getRs().next()) {

                Cliente cli = new Cliente();
                cli.setId(getRs().getString(1));
                cli.setNome(getRs().getString(2));
                cli.setSobrenome(getRs().getString(3));
                cli.setCpf(getRs().getString(8));
                clienteList.add(cli);
            }

            return clienteList;

        } catch (SQLException e) {
            throw new RuntimeException("Erro pesquisar cliente: " + e.getMessage());
        }

    }

    public void pesquisarClienteFiltro(String cliente, String tipoJanela) {

        //SQL da view
        setSql("select * from vCliente where nome like ?");
        setConexao(BancoDeDados.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, "%" + cliente + "%");

            setRs(getPstm().executeQuery());
            
            //As linha abaixo preenche a tabela com o resultado do ResultSet através do Nome da Janela aberta.
            if (tipoJanela.equalsIgnoreCase("TelaPesquisaCliente")) {
                TelaPesquisaCliente.JT_tabelaCliente.setModel(DbUtils.resultSetToTableModel(getRs()));
            }

            if (tipoJanela.equalsIgnoreCase("JanelaOScliente")) {
                JanelaOScliente.JT_tabelaPesquisaClienteOS.setModel(DbUtils.resultSetToTableModel(getRs()));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisat cliente: " + e.getMessage());
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }

    }

    /**
     * @Método @DeletarCliente Este método tem a função de apagar de uma tabela
     * do banco um cliente recebendo por parâmetro o seu ID.
     * @param cliente É um objeto do tipo Cliente.
     * @return O retorno do método é true (Verdadeiro) se a variável {resultado}
     * for igual a 1 ou false (Falso) se for igua a 0.
     */
    public boolean deleteCliente(Cliente cliente) {

        setSql("delete from tb_cliente where id_cliente = ?");
        setConexao(BancoDeDados.getConnection());

        try {

            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setInt(1, Integer.parseInt(cliente.getId()));

            int resultado = getPstm().executeUpdate();

            return resultado == 1;

        } catch (SQLException e) {
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }

    public boolean atualizarCliente(Cliente cliente) {

        setSql(
                "update  tb_cliente set nome_cliente = ?, sobrenome_cliente = ?, nascimento_cliente = ?, telefone_cliente = ?, "
                + "email_cliente = ?, rg_cliente = ?, cpf_cliente = ?, logradouro_cliente = ?, numero_endereco_cliente = ?, "
                + "bairro_cliente = ?, cidade_cliente = ? where id_cliente = ?"
        );

        setConexao(BancoDeDados.getConnection());

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, cliente.getNome());
            getPstm().setString(2, cliente.getSobrenome());
            getPstm().setString(3, cliente.getNascimento());
            getPstm().setString(4, cliente.getTelefone());
            getPstm().setString(5, cliente.getEmail());
            getPstm().setString(6, cliente.getRg());
            getPstm().setString(7, cliente.getCpf());
            getPstm().setString(8, cliente.getLogradouro());
            getPstm().setInt(9, Integer.parseInt(cliente.getNumero()));
            getPstm().setInt(10, Integer.parseInt(cliente.getBairro()));
            getPstm().setInt(11, Integer.parseInt(cliente.getCidade()));
            getPstm().setInt(12, Integer.parseInt(cliente.getId()));

            int resultado = getPstm().executeUpdate();

            return resultado == 1;

        } catch (SQLException e) {
            return false;
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm());
        }
    }

    public Cliente pesquisarCliente(String cpf) {
        
        setSql("select * from tb_cliente where cpf_cliente = ?");
        setConexao(BancoDeDados.getConnection());

        Cliente cliente = new Cliente();

        try {
            setPstm(getConexao().prepareStatement(getSql()));
            getPstm().setString(1, cpf);

            setRs(getPstm().executeQuery());

            if (getRs().next()) {
                cliente.setId(String.valueOf(getRs().getInt(1)));
                cliente.setNome(getRs().getString(2));
                cliente.setSobrenome(getRs().getString(3));
                cliente.setNascimento(getRs().getString(4));
                cliente.setTelefone(getRs().getString(5));
                cliente.setEmail(getRs().getString(6));
                cliente.setRg(getRs().getString(7));
                cliente.setCpf(getRs().getString(8));
                cliente.setLogradouro(getRs().getString(9));
                cliente.setNumero(String.valueOf(getRs().getInt(10)));
                cliente.setBairro(String.valueOf(getRs().getInt(11)));
                cliente.setCidade(String.valueOf(getRs().getInt(12)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            BancoDeDados.fecharConnection(getConexao(), getPstm(), getRs());
        }

        return cliente;

    }

    /**
     * @Métodos Getters e Setters
     * @return
     */
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
