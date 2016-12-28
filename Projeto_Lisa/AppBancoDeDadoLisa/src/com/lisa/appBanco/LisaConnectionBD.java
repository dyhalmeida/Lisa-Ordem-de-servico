package com.lisa.appBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LisaConnectionBD {
  
    private String driver;
    private String url;
    private String usuario;
    private String senha;
    
    public LisaConnectionBD(String senha){
        setDriver("oracle.jdbc.driver.OracleDriver");
        setUrl("jdbc:oracle:thin:@127.0.0.1:1521");
        setUsuario("system");
        setSenha(senha);
    }
    
    public Connection getConnection(){
        
        try {
            Class.forName(getDriver());
            return DriverManager.getConnection(getUrl(), getUsuario(), getSenha());
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Erro na conexão do banco: " + e.getMessage());
            return null;
        } 
    }
    

    private String getDriver() {
        return driver;
    }

    private void setDriver(String driver) {
        this.driver = driver;
    }

    private String getUrl() {
        return url;
    }

    private void setUrl(String url) {
        this.url = url;
    }

    private String getUsuario() {
        return usuario;
    }

    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private String getSenha() {
        return senha;
    }

    private void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void closeConnection(Connection connection){
        try {
            if(connection != null){
            connection.close();
        }
        } catch (Exception e) {
            System.out.println("Erro ao fechar connection: " + e.getMessage());
        }
    }
    
    public void closeConnection(Connection connection, PreparedStatement preparedStatement){
        closeConnection(connection);
        try {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao fechar PreparedStatement: " + e.getMessage());
        }
    }
    
    public void closeConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        closeConnection(connection, preparedStatement);
        try {
            if(resultSet != null){
                resultSet.close();
            }
        } catch (Exception e) {
            System.out.println("Erro ao fechar ResultSet: " + e.getMessage());
        }
    }
}
