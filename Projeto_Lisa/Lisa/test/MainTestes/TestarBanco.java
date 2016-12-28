/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTestes;

import java.sql.Connection;
import lisa.BancoDeDados.BancoDeDados;
import lisa.Modelo.beans.Usuario;
import lisa.Modelo.beans.UsuarioLogin;
import lisa.Modelo.dao.LoginSistemaDao;
import lisa.Modelo.dao.UsuarioDao;

/**
 *
 * @author dyhalmeida
 */
public class TestarBanco {
    public static void main(String[] args) {
//        System.out.println(BancoDeDados.getConnection());
//        
//        Connection conexao = BancoDeDados.getConnection();
//        
//        UsuarioDao usuDao = new UsuarioDao();
//        
//        Usuario u = new Usuario();
//        u.setId("22");
//        u.setNome("Diego");
//        u.setSobrenome("Almeida");
//        u.setLogin("dyh");
//        u.setSenha("linux");
//        
//        boolean n = usuDao.cadastrarUsuario(conexao, u);
//        System.out.println(n);
    

    UsuarioLogin ul = new UsuarioLogin();
    ul.setLogin("admin");
    ul.setSenha("admin");
    
    LoginSistemaDao ls = new LoginSistemaDao();
        System.out.println(ls.getLoginSenha(ul));
        
    
    
    

    }
}
