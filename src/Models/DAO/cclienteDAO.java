/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models.DAO;

import Models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author emanu
 */
public class cclienteDAO {
    private final Connection connection;
    
    public cclienteDAO(Connection connection){
        this.connection=connection;
    }
    public void insert (Cliente cliente) throws SQLException{
        String sql ="insert into cliente(nome,rg,email) values ('"+cliente.getNome()+"','"+cliente.getRg()+"','"+cliente.getEmail()+"');";
        
          PreparedStatement statement = connection.prepareStatement(sql);
          statement.execute();
          
          connection.close();
        
        
    }

    public void insert(viewbarbearia.Cliente clientelulu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
