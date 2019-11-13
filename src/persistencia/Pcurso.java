/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import main.Curso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Rafael
 */
public class Pcurso {
    
    public void inserir(Curso curso) throws SQLException{
        
        System.out.println("comando insert no banco");
        Connection con = util.Conexao.getConexao();
        System.out.println("classe conect");
        String sql = "INSERT INTO curso (coordenador, ativo, descricao, id) VALUES (?,?,?,?)";
        System.out.println("sql");
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,curso.getCoordenador());
        ps.setBoolean(2, curso.isAtivo());
        ps.setString(3, curso.getDescricao());
        ps.setInt(4, curso.getId());
        
    }
    
   
    public void alterar(Curso curso) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "UPDATE curso SET coordenador=?, ativa=?, descricao=? , id=?   WHERE id=? ";
        
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, curso.getCoordenador());
        ps.setBoolean(2, curso.isAtivo());
        ps.setString(3, curso.getDescricao());
        ps.setInt(4, curso.getId());
        ps.setInt(5, curso.getId());
        ps.executeUpdate();
    }
    
    public Curso visualizarUm(int id ) throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT coordenador, ativa, descricao, id WHERE id=? ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, id);
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()) {
            return new Curso(rs.getInt(1), rs.getBoolean(2), rs.getString(3), 
                    rs.getString(4));            
        }
        
        return null;
    }
    
    public List<Curso> visualizarAll() throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM curso";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        List<Curso> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Curso(rs.getInt(1), rs.getBoolean(2), rs.getString(3), 
                    rs.getString(4)));
        }
        return lista;
    }
    
    public Set<Curso> visualizarAllSet() throws SQLException{
        Connection con = util.Conexao.getConexao();
        
        String sql = "SELECT * FROM curso";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        
        Set<Curso> lista = new TreeSet<>();
        while (rs.next()) {
            lista.add(new Curso(rs.getInt(1), rs.getBoolean(2), rs.getString(3), 
                    rs.getString(4)));
        }
        return lista;
    }
}
