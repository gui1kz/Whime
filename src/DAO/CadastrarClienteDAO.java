package DAO;

import DTO.CadastrarClienteDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastrarClienteDAO {

    Connection conn;
    PreparedStatement pstm;

    public void CadastrarCliente(CadastrarClienteDTO CadastrarCliente) {
        String sql = "INSERT INTO clientes "
                + "(nome_completo, CPF, nascimento, telefone, CEP, endereco, numero_casa, estado_civil, genero, UF, bairro) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? );";
        conn = new ConexaoDAO().conectDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, CadastrarCliente.getNomeCompleto());
            pstm.setLong(2, CadastrarCliente.getCPF());
            java.sql.Date dataSql = new java.sql.Date(CadastrarCliente.getDate().getTime());
            pstm.setDate(3, dataSql);
            pstm.setString(4, CadastrarCliente.getTelefone());
            pstm.setLong(5, CadastrarCliente.getCEP());
            pstm.setInt(6, CadastrarCliente.getNumCasa());
            pstm.setString(7, CadastrarCliente.getEstadoCivil());
            pstm.setString(8, CadastrarCliente.getGenero());
            pstm.setString(9, CadastrarCliente.getUF());
            pstm.setString(10, CadastrarCliente.getBairro());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastrarClienteDAO error: " + e);
        }
    }
}
