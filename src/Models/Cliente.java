/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.util.Date;

/**
 *
 * @author emanu
 */
public class Cliente  extends Pessoa{
    protected String endereco;
    protected String cep;

    public Cliente(int id,String nome,char sexo,String dataNascimento,String telefone,String email,String Rg,String endereco,String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, Rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id,String nome,String endereco, String cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String nome) {
        super(id, nome);
    }

    

  

   


   

    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

@Override
public String toString(){
    return getNome();
    
}
    }

  