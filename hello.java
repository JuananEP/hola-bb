/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {
    String entradaTeclado = "";
      System.out.print ("Introduce tu puto nombre: ");
    Scanner entradaEscaner = new Scanner (System.in);
      entradaTeclado = entradaEscaner.nextLine ();

      System.out.println ("Hey " + entradaTeclado);
  }
}
