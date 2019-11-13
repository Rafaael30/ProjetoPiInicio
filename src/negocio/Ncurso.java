/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import negocio.Ncurso;
import main.Curso;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;
import persistencia.Pcurso;
/**
 *
 * @author Roberto
 */
public class Ncurso {
    
    public void salvar(Curso obj) throws SQLException{
        System.out.println(obj.getId());
        System.out.println("salvar do negocio chama percistencia");
        if(obj.getId() != 0) new Pcurso().alterar(obj);
          else 
        new Pcurso().inserir(obj);
    }
    
    public Curso consultar(int id) throws SQLException{
        return new Pcurso().visualizarUm(id);
    }
    
    public List<Curso> listar() throws SQLException{
        return new Pcurso().visualizarAll();
    }
    
    public Set<Curso> listarSet() throws SQLException{
        return new Pcurso().visualizarAllSet();
    }
}
