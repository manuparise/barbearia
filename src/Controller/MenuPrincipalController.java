/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import viewbarbearia.Agenda;
import viewbarbearia.Cliente;
import viewbarbearia.MenuPrincipal;

/**
 *
 * @author emanu
 */
public class MenuPrincipalController {
    private final MenuPrincipal viewbarbearia;

    public MenuPrincipalController(MenuPrincipal viewbarbearia) {
        this.viewbarbearia = viewbarbearia;
    }
    public  void navegarParaAgenda(){
        Agenda agenda =new Agenda();
        agenda .setVisible(true);
        
    }  
    public void navegarParaCliente(){
        Cliente cliente= new Cliente("lulu", "34567890", "lulus.ty7@gmail.com");
        cliente.setVisible(true);
    }
}
