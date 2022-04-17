package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticationUser(UsuarioDTO objuserdto) {
        conn = new ConexaoDAO().conectDB();

        try {
            String sql = "SELECT * FROM funcionarios WHERE Usuario = ? AND senha = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,objuserdto.getUsuario());
            pstm.setString(2,objuserdto.getSenha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "UserDAO: " + e);
            return null;
        }
    }
}
