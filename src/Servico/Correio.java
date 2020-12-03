/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servico;

import Models.Agendamento;

/**
 *
 * @author emanu
 */
public class Correio {

    private String nomeCliente;
    public void NotificarEmail(Agendamento agendamento){
        String emailFormatado=formarEmail(agendamento);
        String destinatario= agendamento.getCliente().getEmail();
        
        //Uso da classe de Email
        Email email= new Email ("Agendamento Barbearia",emailFormatado,destinatario);
        email.enviar();
        
    }

    private String formarEmail(Agendamento agendamento) {
     String nomeCleinte=agendamento.getCliente().getNome();
     String servico=agendamento.getServico().getDescricao();
     String dataAgendamento=agendamento.getDataFormatada();
     String horaAgendamento=agendamento.getHoraFormatada();
     float valor=agendamento.getValor();
     
     return "olá " +nomeCliente+ "Vai arrumar o visual?.......Seu agendamento para " +
             servico+"seu agendamento esta marcado parA o dia "+dataAgendamento+
            "as"+ horaAgendamento + "O preço para você  sai barato  fica R$ "+ valor+ "Obrigado(a) por ultilizar o serviço !!";
     
    }
    
}
