package algoritmo;

import java.util.Scanner;

public class taller {
	
	public static void main( String[] args ) {
		  Scanner digitar = new Scanner(System.in);
	      int tiempo = 0;
	      System.out.println("ingrese el año:  ");
	      tiempo = digitar.nextInt();

	      System.out.println( " para determinar si un año es bisiesto" );
	      if ( ( ( tiempo % 4 == 0 ) && ( tiempo % 100 != 0 ) ) || ( tiempo % 400 == 0 ) ) {
	         System.out.println( "El año " + tiempo + " es bisiesto.");
	      }
	      else {
	         System.out.println( "El año " + tiempo + " no es bisiesto.");
	      }      
	   }

}
