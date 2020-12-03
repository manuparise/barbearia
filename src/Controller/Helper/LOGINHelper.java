/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Models.Usuario;
import viewbarbearia.LOGIN;

/**
 *
 * @author emanu
 */
public class LOGINHelper implements IHelper {
    private  final LOGIN viewbarbearia;

    public LOGINHelper(LOGIN viewbarbearia) {
        this.viewbarbearia = viewbarbearia;
    }
    public Usuario obterModelo(){
        String nome = viewbarbearia.getTextusuario().getText();
        String senha = viewbarbearia.getTextsenha().getText();
        Usuario modelo= new Usuario(0, nome, senha);
         return modelo;
        
    }
    public void setarModelo(Usuario modelo){
        String nome= modelo.getNome();
        String senha=modelo.getSenha();
        viewbarbearia.getTextusuario().setText(nome);
        viewbarbearia.getTextsenha().setText(senha);
        
    }
    public void limparTela(){
        viewbarbearia.getTextusuario().setText("");
        viewbarbearia.getTextsenha().setText("");
    }
}
