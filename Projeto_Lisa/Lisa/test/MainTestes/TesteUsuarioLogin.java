/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTestes;

import lisa.Modelo.beans.UsuarioLogin;

/**
 *
 * @author dyhalmeida
 */
public class TesteUsuarioLogin {
    
    public static void main(String[] args) {
        
        UsuarioLogin usuarioLogin = new UsuarioLogin();
        
        usuarioLogin.setNome("Diego");
        usuarioLogin.setSobrenome("Almeida");
        usuarioLogin.setLogin("dyh");
        usuarioLogin.setSenha("root");
        
        
        System.out.println(usuarioLogin.getNome());
        
    }
}
