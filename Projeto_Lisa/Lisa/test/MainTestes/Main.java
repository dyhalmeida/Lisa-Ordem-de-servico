/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainTestes;


/**
 *
 * @author dyhalmeida
 */
public class Main {
    public static void main(String[] args) {
        
        String n = "2,55";
        String n1 = n.replace(",", ".");
        double x = Double.parseDouble(n1);
        System.out.println(x);
        x = x + x;
        System.out.println(x);
    }
    
}
