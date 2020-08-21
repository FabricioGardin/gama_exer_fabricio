package relogio;

public class Relogio {
     // atributos
      private  int hora, minutos, segundos;
 
     // construtor
     Relogio (int hora, int minutos, int segundos) {
         
       this.hora = hora; 
       this.minutos = minutos;
       this.segundos = segundos;
         
     }
 
     // métodos
     public void exibirHora() { 
         System.out.println("Hora: " + hora + " - Minutos: " + minutos
          + " Segundos " + segundos);
     }
 
          
     public void avancaHora(){
        if( hora > 0 && hora < 24){
            hora++;
        }
    }

    public void retrocederHora(){
        if( hora > 0 && hora < 24){
            hora--;
        }
    }

   
}