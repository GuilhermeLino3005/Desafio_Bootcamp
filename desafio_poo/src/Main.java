import java.time.LocalDate;

import brcomdiodesafio.dominio.Curso;
import brcomdiodesafio.dominio.Mentoria;

public class Main{
     public static void main(String[] args) {
          
          Curso curso = new Curso();
          Mentoria mentoria = new Mentoria();

          curso.setTitulo("Curso Java");
          curso.setDescricao("Descrição curso Java");
          curso.setCargaHoraria(30);

          Curso curso2 = new Curso();

          curso2.setTitulo("Curso JavaScrip");
          curso2.setDescricao("Descrição curso js");
          curso2.setCargaHoraria(4);

          System.out.println(curso);
          System.out.println(curso2); 

          mentoria.setTitulo("Mentoria Java");
          mentoria.setDescricao("Descrição mentoria Java");
          mentoria.setData(LocalDate.now());

          System.out.println(mentoria);



     }
}