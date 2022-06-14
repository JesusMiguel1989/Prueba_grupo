package pruebagrupojava;

import java.util.Scanner;

public class PruebaGrupoJava {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, repetic;
    
    System.out.print("Escribe un numero entero: ");
    num = sc.nextInt();
    System.out.print("¿Cuantas veces deseas que se imprima?: ");
    repetic = sc.nextInt();
    
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
    
  }
}
