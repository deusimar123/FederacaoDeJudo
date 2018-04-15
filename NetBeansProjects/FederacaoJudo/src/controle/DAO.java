/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.User;

/**
 *
 * @author deusimar
 */
public class DAO {
    public String data(){
        
        java.util.Date agora = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat();
        
        return formata.format(agora);
    }
    public void createUser(User a){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO user (Id_user,usuario,senha,nome)VALUES(?,?,?,?)");
            stmt.setInt(1, 0);
            stmt.setString(2, a.getUsuario());
            stmt.setString(3, a.getSenha());
            stmt.setString(4, a.getNome());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar"+ ex);
        }finally{
            ConnectionFactory.closeConection(con, stmt);
        }
    
    }
}