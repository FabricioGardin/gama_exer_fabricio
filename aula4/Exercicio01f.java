import java.util.Scanner;

public class Exercicio01f {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, resultado;
        System.out.println(" Digite o  numero");
        num = in.nextInt();
        resultado = par(num);
          
        in.close(); 
    
    }

    public static int par(int a) {
               if (a % 2 == 0){
                System.out.println(" o numero " + a  + " é par");
               } else {
                System.out.println(" o numero " + a  + " é impar");
               }
                
        return a;
              
        
    }
    
}
