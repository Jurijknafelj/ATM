import java.util.Scanner;
public class Geldautomat
{
  public static void main (String [] args)
  {
    int guthaben = 200, x, y , z , PIN = 0;
    Scanner eingabe = new Scanner(System.in);
    System.out.println(" Bitte geben Sie ihren PIN ein");
    PIN = eingabe.nextInt();
    if (PIN == 8008)
    {      
      System.out.println("Guten Tag! Ihr guthaben betraegt " + guthaben + " Euro");
             
        
        
        System.out.println("Was moechten Sie tun?");                                
        System.out.println("Einzahlen 1");
        System.out.println("Auszahlen 2");  
        x = eingabe.nextInt();
        
        if (x==1)        
        {
          System.out.println("Welchen Betrag moechten sie Einzahlen?");
          y = eingabe.nextInt();
          guthaben = guthaben + y;
          System.out.println("Ihr neues Guthaben betr�gt " + guthaben +" Euro");
        }
        if (x==2) 
        {
          System.out.println("Welchen Betrag moechten sie Auszahlen?");
          z = eingabe.nextInt();  
          guthaben = guthaben - z;
          System.out.println("Ihr neues Guthaben betr�gt " + guthaben +" Euro");   
        }
        System.out.println("Moechten sie eine weitere Aktion vornehmen? 1");
        System.out.println("Beenden 2");        

    }
  } 
}                                
