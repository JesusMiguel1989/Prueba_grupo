package pruebagrupojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaGrupoJava {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)){
      int num, repetic;
    
      System.out.print("Escribe un numero entero: ");
      num = sc.nextInt();
      //num=Integer.parseInt(JOptionPane.showInputDialog("Escribe un numero entero: "));
      num=(int)Math.pow(num, 2);
      System.out.println("su cuadrado es "+num);
      System.out.print("¿Cuantas veces deseas que se imprima?: ");
      repetic = sc.nextInt();
      //repetic=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas veces deseas que se imprima?: "));

      for(int i=0; i<repetic; i++){
        System.out.printf("%d. %d\n",i+1, num);
        if(i%2==0){
            System.out.println("es la ronda par");
        }
        else{
            System.out.println("es la ronda impar");
        }
      }
      System.out.println("");
    } catch (Exception e) {
    }

  }
}
