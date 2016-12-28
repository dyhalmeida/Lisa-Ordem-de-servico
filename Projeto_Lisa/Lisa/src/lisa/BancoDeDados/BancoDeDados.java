package lisa.BancoDeDados;

/**
 * @Importação bibliotecas
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Classe BancoDeDados
 * Esta classe tem a função de fazer a conexão com o banco de dados. É uma classe abstrata e nao precisa de uma instância para acessar os seus métodos.
 * @author dyhalmeida
 */
public abstract class BancoDeDados {
    
    /**
     *  @Atributos
     */
    private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private final static String URL = "jdbc:oracle:thin:@localhost:1521";
    private final static String USUARIO = "system";
    private final static String SENHA = "root";
    
    //Senha do oracle IFBA
    //rivate final static String SENHA = "123456";
    
    //Senha do oracle Trabalho
    //private final static String SENHA = "voidmain180889";
    
    /**
     * @Métodos
     * @GetConnection Este método tem a função de estabeler uma conexão com o banco de dados e retornas uma instância do tipo Connection.
     * @return O retorno do método é um objeto do tipo Connection.
     */
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Erro ao conectar banco\n" + e.getMessage());
        }
    }
    
    /**
     * @Método
     * @FecharConnection Esté método tem a função de fechar a conexão do objeto do tipo Connection, passando o mesmo por parâmetro.
     * @param connection É um objeto do tipo Connection.
     */
    public static void fecharConnection(Connection connection){
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar conexão\n" + e.getMessage());
        }
    }
    
     /**
     * @Método
     * @FecharConnection Esté método tem a função de fechar a conexão do objeto do tipo Connection e do objeto do tipo PreparedStatement, 
     * passando os mesmos por parâmetro.
     * @param connection É um objeto do tipo Connection.
     * @param preparedStatement  É um objeto do tipo PreparedStatement.
     */
    public static void fecharConnection(Connection connection, PreparedStatement preparedStatement){
        
        BancoDeDados.fecharConnection(connection);
        
        try {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao fechar conexão\n" + e.getMessage());
        }
        
    }
    
     /**
     * @Método
     * @FecharConnection Esté método tem a função de fechar a conexão do objeto do tipo Connection, 
     * do objeto do tipo PreparedStatement e do objeto do tipo ResultSet, passando os mesmos por parâmetro.
     * @param connection É um objeto do tipo Connection.
     * @param preparedStatement  É um objeto do tipo PreparedStatement.
     * @param resultSet É um objeto do tipo ResultSet.
     */
    public static void fecharConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        
        BancoDeDados.fecharConnection(connection, preparedStatement);
        
        try {
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao fechar conexão\n" + e.getMessage());
        }
    }
    
}
