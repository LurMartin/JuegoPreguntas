/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegopalabras;

/**
 *
 * @author Lourdes
 */
public class JuegoPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vista vista=new Vista();
        Controlador controlador=new Controlador(vista);
    }
    
}
