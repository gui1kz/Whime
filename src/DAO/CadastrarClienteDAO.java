package DAO;

import DTO.ClientesDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadastrarClienteDAO {

    Connection conn;
    PreparedStatement pstm;

    public void CadastrarCliente(ClientesDTO CadastrarCliente) {
        String sql = "INSERT INTO clientes "
                + "(nome_completo, CPF, nascimento, telefone, email, genero, endereco, numero_casa, CEP, bairro, UF, estado_civil) "
                + "VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        conn = new ConexaoDAO().conectDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, CadastrarCliente.getNomeCompleto());
            pstm.setLong(2, CadastrarCliente.getCPF());
            java.sql.Date dataSql = new java.sql.Date(CadastrarCliente.getDate().getTime());
            pstm.setDate(3, dataSql);
            pstm.setString(4, CadastrarCliente.getTelefone());
            pstm.setString(5, CadastrarCliente.getEmail());
            pstm.setString(6, CadastrarCliente.getGenero());
            pstm.setString(7, CadastrarCliente.getEndereco());
            pstm.setInt(8, CadastrarCliente.getNumCasa());
            pstm.setInt(9, CadastrarCliente.getCEP());
            pstm.setString(10, CadastrarCliente.getBairro());
            pstm.setString(11, CadastrarCliente.getUF());
            pstm.setString(12, CadastrarCliente.getEstadoCivil());

            pstm.execute();
            pstm.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CadastrarClienteDAO error: " + e);
        }
    }
}
