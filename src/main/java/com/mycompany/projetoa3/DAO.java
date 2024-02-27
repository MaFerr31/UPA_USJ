
package com.mycompany.projetoa3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DAO {
       public boolean login(Funcionario funcionario) throws Exception{
       String sql = "SELECT * FROM Funcionario WHERE nome = ? AND senha = ?";
       try(Connection conn = ConexaoDB.obtemConexao();
       PreparedStatement ps = conn.prepareStatement(sql)){
          ps.setString(1, funcionario.getLogin());
          ps.setString(2, funcionario.getSenha());
          
          try(ResultSet rs = ps.executeQuery()){
              return rs.next();
          }
              
          
       }
   }
            
   
    public void atualizar (Paciente paciente) throws Exception{
    String sql = "UPDATE Paciente SET nome = ?, email = ?, data_nasc = ?, celular = ?, endereco = ?, cidade = ?, cep = ?, nr_SUS = ?, genero = ? WHERE cpf = ?";
     try (Connection conn = ConexaoDB.obtemConexao();
    PreparedStatement ps = conn.prepareStatement(sql)){
    ps.setString(1,paciente.getNome());
    ps.setString(2,paciente.getEmail());
    ps.setString(3, paciente.getData_nasc());
    ps.setInt(4, paciente.getCelular());
    ps.setString(5, paciente.getEndereco());
    ps.setString(6, paciente.getCidade());
    ps.setString(7, paciente.getCep());
    ps.setInt(0x8, paciente.getNr_SUS());
    ps.setString(9, paciente.getGenero());
    ps.setString(10, paciente.getCpf()); 
    ps.execute();
}
    
 }
    
    public void atualizarConsulta(Atendimento atendimento) throws Exception{
       String sql = "UPDATE Atendimento SET Especialidade_idEspecialidade = ?, Paciente_cpf = ?, data_atendimento = ?, tipo = ?, nr_atendimento = ?, pressao_art = ?,  temperatura = ?, sintomas = ?, frequencia_card = ?, status_aten = ? WHERE IdAtendimento = ?";
               

       try (Connection conn = ConexaoDB.obtemConexao();
               PreparedStatement ps = conn.prepareStatement(sql)){
           
           ps.setInt(1, atendimento.getEspecialidade_idEspecialidade());
           ps.setString(2, atendimento.getPaciente_cpf());
           ps.setString(3, atendimento.getData_atendimento());
           ps.setInt(4, atendimento.getTipo());
           ps.setInt(5, atendimento.getNr_atendimento());
           ps.setFloat(6, atendimento.getPressao_art());
           ps.setFloat(7, atendimento.getTemperatura());
           ps.setString(8, atendimento.getSintomas());
           ps.setFloat(9, atendimento.getFrequencia_card());
           ps.setInt(10, atendimento.getStatus_aten());
           ps.setInt(11, atendimento.getIdAtendimento());
           ps.execute();
       }
   }
    
    
    
      
      
      
}
      

       

