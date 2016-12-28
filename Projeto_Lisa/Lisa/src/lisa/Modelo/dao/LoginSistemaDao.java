package lisa.Modelo.dao;

/**
 * @Importação bibliotecas
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.UsuarioLogin;

/**
 * @Classe LoginSistemDao
 * Esta classe está relacionado a todas as operações de banco de dados do objeto do tipo LoginSistemDao.
 * @author dyhalmeida
 */
public class LoginSistemaDao {

    /**
     * @Atributo
     */
    private String usuarioLogado;

    /**
     * @Método
     * @getLoginSenha Este método tem como função pesquisar no banco de dados um usuário que seja igual ao objeto do tipo UsuarioLogin passado
     * por parâmetro.
     * @param usuarioLogin é um objeto do tipo UsuarioLogin.
     * @return O retorno do método é true (Verdadeiro) se existir os dados no banco ou false (Falso) se não existir.
     */
    public boolean getLoginSenha(UsuarioLogin usuarioLogin) {

        PreparedStatement pstm = null;
        Connection connection = null;
        ResultSet rs = null;
        
        //Recebendo uma conexão aberta do banco de dados
        connection = BancoDeDados.getConnection();
        
        try {
            
            //Passando instrução SQL p/ o PreparedStatament
            pstm = connection.prepareStatement(
                "SELECT * FROM tb_usuario WHERE login_usuario = ? and senha_usuario = ?"
            );
                    
            pstm.setString(1, usuarioLogin.getLogin());
            pstm.setString(2, usuarioLogin.getSenha());
            rs = pstm.executeQuery();
            
            //Se existir o usuario, set o usuário logado com nome e sobrenome.
            if (rs.next()) {
                this.setUsuarioLogado(rs.getString(2));
                this.setUsuarioLogado(this.getUsuarioLogado() + " " + rs.getString(3));
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Mensagem " + e.getMessage());
            return false;
        } finally {
            BancoDeDados.fecharConnection(connection, pstm, rs);
        }
    }

    /**
     * @Métodos Getters e Setters
     */
    public String getUsuarioLogado() {
        return usuarioLogado;
    }

    private void setUsuarioLogado(String usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }
}
