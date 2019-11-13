/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import negocio.Ncurso;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Main {
    
    Ncurso ncurso = new Ncurso();
    
    ArrayList<Curso> cursos = new ArrayList<>();
    
    
    public void SalvaCurso(int id, boolean ativo, String descricao, String coordenador) throws SQLException{
        
        System.out.println("do tela chama o curso");
        Curso Ocurso = new Curso(id, ativo, descricao, coordenador);
   
        System.out.println("do curso chama a negocio");
     ncurso.salvar(Ocurso);
   
        
    }

}
