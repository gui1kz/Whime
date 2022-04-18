package DAO;

import DTO.FuncionariosDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastrarFuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public void createUser(FuncionariosDTO objsigndto) {

        String sql = "INSERT INTO funcionarios(nome,sobrenome, CPF, usuario, senha) VALUES (?, ?, ?, ?, ?);";
        conn = new ConexaoDAO().conectDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objsigndto.getFirstName());
            pstm.setString(2, objsigndto.getLastName());
            pstm.setLong(3, objsigndto.getCPF());
            pstm.setString(4, objsigndto.getUser());
            pstm.setString(5, objsigndto.getPassword());
            
                pstm.execute();
                pstm.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "CadastrarUsuarioDAO error: " + e);
        }
    }
}
