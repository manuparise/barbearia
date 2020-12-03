/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;


import Models.Agendamento;
import Models.Cliente;
import Models.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

import javax.swing.table.DefaultTableModel;
import viewbarbearia.Agenda;


/**
 *
 * @author emanu
 */
public class AgendaHelper implements IHelper{
    private final Agenda View;
    private Object viewbarbearia;

    public AgendaHelper(Agenda View) {
        this.View = View;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
       DefaultTableModel  tableModel =(DefaultTableModel) View.getTableAgendamentos().getModel();
       tableModel.setNumRows(0);
       
        //percorrendo a lista preenchendo o table model
        agendamentos.forEach((agendamento) -> {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getData(),
                agendamento.getData(),
                agendamento.getObservacao(),
            } );
        });
        
       
    }  
       

    public void preencherClientes(ArrayList<Cliente> clientes) {
       DefaultComboBoxModel comboBoxModel=(DefaultComboBoxModel)View.getjComboBoxCliente().getModel();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
       
       clientes.forEach((cliente) -> {
           comboBoxModel.addElement(cliente);//aqui esta o truque
        });
            
            }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel=(DefaultComboBoxModel)View.getjComboBoxServico().getModel();  
        
        servicos.forEach((servico) -> {
            comboBoxModel.addElement(servico);
        });
       
        
    }

    public Cliente obterCliente(){
        return (Cliente) View.getjComboBoxCliente().getSelectedItem();
    }
    public Servico obterServico() {
        return(Servico)View.getjComboBoxServico().getSelectedItem();
        
        
    }

    public void setarValor(float valor) {
  View.getjTextFieldvalor().setText(valor+"");
          }

    @Override
 public Agendamento obterModelo(){
String  idString=View.getjTextFieldid().getText();
int id =Integer.parseInt(idString);
Cliente cliente =obterCliente();
Servico servico =obterServico();
String valorString=View.getjTextFieldvalor().getText();
float valor= Float.parseFloat(valorString);
String Data=View.getjTextFielddata().getText();
String Hora=View.getjTextFieldhora().getText();
String DataHora= Data +""+Hora;
String observacao=View.getjTextAreaobservacao().getText();
//new agendamento
Agendamento agendamento=new Agendamento(id,cliente,servico,valor,DataHora,observacao);
return agendamento;

    }

    @Override
    public void limparTela() {
    View.getjTextFieldid().setText("0");
    View.getjTextFielddata().setText("");
    View.getjTextFieldhora().setText("");
    View.getjTextAreaobservacao().setText("");
    
    }
    
}

     
  

      



    

        
    

