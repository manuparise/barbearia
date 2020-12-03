/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LOGINHelper;
import Models.DAO.UsuarioDAO;
import Models.Usuario;
import viewbarbearia.LOGIN;
import viewbarbearia.MenuPrincipal;





/**
 *
 * @author emanu
 */
public class LOGINController {

    private final LOGIN viewbarbearia;
    private LOGINHelper helper;

    public LOGINController(LOGIN viewbarbearia) {
        this.viewbarbearia = viewbarbearia;
        this.helper= new LOGINHelper(viewbarbearia);
        
    }
      
        //Pegar um usario da view
    public  void entrarNoSistema(){
        Usuario usuario =helper.obterModelo();
        
        
     
        //pesquisar o usuario no banco
        UsuarioDAO usuarioDAO= new UsuarioDAO();
       Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
       // se o usuario da view tiver o mesmo usuario e senha que o usuario vindo do banco direcionar para o meu menu principal
        //senão  vou mostrar uma mensagem ao "usuario  ou senha invalidos"
       if(usuarioAutenticado!=null){
           //navegar para o menu principal
           MenuPrincipal menu = new MenuPrincipal();
           menu.setVisible(true);
           this.viewbarbearia.dispose();
       }else{
           viewbarbearia.exibeMensagem("Usuario ou senha errada!");
       }
        
    }
            
public void fizTarefa(){
    System.out.println("Busquei algo do banco de dados");
    this.viewbarbearia.exibeMensagem("Executei o fiz tarefa");
}

    private LOGINHelper LOGINHelper(LOGIN viewbarbearia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

    /**
     *
     */
   
        
    }
   
    

