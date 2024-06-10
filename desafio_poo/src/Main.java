import java.time.LocalDate;

import brcomdiodesafio.dominio.Bootcamp;
import brcomdiodesafio.dominio.Curso;
import brcomdiodesafio.dominio.Dev;
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

          
          mentoria.setTitulo("Mentoria Java");
          mentoria.setDescricao("Descrição mentoria Java");
          mentoria.setData(LocalDate.now());

          Bootcamp bootcamp = new Bootcamp();

          bootcamp.setNome("Bootcamp Java Developer");
          bootcamp.setDescricao("Descrição Bootcamp Java Developer");
          bootcamp.getConteudos().add(curso);
          bootcamp.getConteudos().add(curso2);
          bootcamp.getConteudos().add(mentoria);

          Dev devGuilherme = new Dev();

          devGuilherme.setNome("Guilherme");
          devGuilherme.inscreverBootcamp(bootcamp);
          
          System.out.println("Conteudos inscritos Guilherme: "+ devGuilherme.getConteudosInscritos());
          System.out.println();
          devGuilherme.progredir();
          devGuilherme.progredir();
          devGuilherme.progredir();
          System.out.println();
          System.out.println("Conteudos inscritos Guilherme: "+ devGuilherme.getConteudosInscritos());
          System.out.println();
          System.out.println("Conteudos inscritos Guilherme: "+ devGuilherme.getConteudosConcluidos());
          System.out.println();
          System.out.println("XP: " +devGuilherme.calculaTotalXp());
          
          System.out.println("XP: " +devGuilherme.calculaTotalXp());
          

          Dev dev = new Dev();

          dev.setNome("Gaby");
          dev.inscreverBootcamp(bootcamp);

          System.out.println("Conteudos inscritos Gaby: "+ dev.getConteudosInscritos());
          System.out.println();
          dev.progredir();
          System.out.println();
          System.out.println("Conteudos inscritos Gaby: "+ dev.getConteudosConcluidos());
          System.out.println();
          System.out.println("Conteudos inscritos Gaby: "+ dev.getConteudosInscritos());
          System.out.println();
          System.out.println("XP: " +dev.calculaTotalXp());
          System.out.println("XP: " +dev.calculaTotalXp());

     }
}