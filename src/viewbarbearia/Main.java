/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewbarbearia;

import Models.Agendamento;
import Models.Cliente;
import Models.Pessoa;
import Models.Servico;
import Models.Usuario;

/**
 *
 * @author emanu
 */
public class Main {
    
    public static void  main(String[] args){
        String nome = "Tiago";
        System.out.println(nome);
        
        Servico servico= new Servico(1,"barba",35);
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
     
      Cliente  cliente = new Cliente ( 1,"Atila","rua teixeira","746373763");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCep());
        
        Usuario usuario =new Usuario(1,"barbeiro","senha");
        System.out.println(usuario.getNome());
        System.out.println(usuario.getSenha());
        
        Agendamento agendamento = new Agendamento (1,cliente,servico,30,"09/11/2020 9:15");
        System.out.println(agendamento.getCliente().getNome());
        
    }
}
