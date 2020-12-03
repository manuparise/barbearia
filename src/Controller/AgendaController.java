/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Models.Agendamento;
import Models.Cliente;
import Models.DAO.AgendamentoDAO;
import Models.DAO.ClienteDAO;
import Models.DAO.ServicoDAO;
import Models.Servico;
import Servico.Correio;
import java.util.ArrayList;
import viewbarbearia.Agenda;

/**
 *
 * @author emanu
 */
public class AgendaController {
    private final Agenda viewbarbearia;
    private final AgendaHelper helper;
    

    public AgendaController(Agenda viewbarbearia) {
        this.viewbarbearia = viewbarbearia;
        this.helper=new AgendaHelper(viewbarbearia);
    }
    
    public void atualizarTabela(){
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO= new AgendamentoDAO();
        ArrayList<Agendamento>agendamentos=agendamentoDAO.selectAll();
        
        //Exibir esta lista na viewbarbearia
        helper.preencherTabela(agendamentos);
        
    }
    public void atualizaCliente(){
        //Buscar Clientes do Banco de Dados
        ClienteDAO clienteDAO= new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir Clientes no Combox cliente
    helper. preencherClientes(clientes);
}
    public void atualizaServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
       helper.preencherServicos(servicos);
    }
    public void atualizaValor(){
        Servico servico =helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    public void agenda(){
        //Buscar agendamento da tela
        Agendamento agendamento=helper.obterModelo();
        //salavar objeto no banco de dados
        new AgendamentoDAO().insert(agendamento);
        
        
        Correio correio = new Correio();
        correio.NotificarEmail(agendamento);
        
        // inserir elemento na tabela
        atualizarTabela();
        helper.limparTela();
    }
}

   

    

