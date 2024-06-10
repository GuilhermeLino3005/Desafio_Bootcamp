package brcomdiodesafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
     private LocalDate data;     

     public Mentoria(){

     }

     public double calcularXp(){
          return XP_PADRAO + 20;

     }

     public LocalDate getData() {
          return data;
     }

     public void setData(LocalDate data) {
          this.data = data;
     }

     @Override
     public String toString() {
          return "Curso{" +
          "titulo='" +getTitulo()+ '\'' +
          ", descricao ='" + getDescricao() + '\'' +
          ", data =" + data +
          '}';
     }
     

}
