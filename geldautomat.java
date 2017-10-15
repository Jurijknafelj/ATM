import java.util.Scanner;
public class Geldautomat
{
  static int guthaben = 200;
  static Scanner eingabe = new Scanner(System.in);

  public static void main (String [] args)
  {
    if(checkPin()){
      menuEngine();
    }
  }

  private static boolean checkPin(){
    int pin = 0;
  
    System.out.println(" Bitte geben Sie ihren PIN ein");
    pin = eingabe.nextInt();
    return pin == 8008;
  }

  private static void menuEngine(){
    String x;
    while(true){
      printMenu();
      x = eingabe.next();
      switch(x) {
        case "1":
          einzahlen();
          break;
        case "2":
          auszahlen();
          break;
        case "3":
   
          return;
        default:
      }
    }   
  }
  
  private static void einzahlen(){
    String raw_y;
    int y = 0;
    System.out.println("Welchen Betrag moechten sie Einzahlen?");
    raw_y = eingabe.next();
    if(isInteger(raw_y)){
      y = Integer.parseInt(raw_y);
    }
    else{
      System.out.println("Falsche Ausgabe.");
    }
    guthaben = guthaben + y;
    System.out.println("Ihr neues Guthaben beträgt " + guthaben +" Euro");
  }

  private static void auszahlen(){
    int z;
    System.out.println("Welchen Betrag moechten sie Auszahlen?");
    z = eingabe.nextInt();  
    guthaben = guthaben - z;
    System.out.println("Ihr neues Guthaben beträgt " + guthaben +" Euro");   
  }

  private static void printMenu()
  {
      System.out.println("Guten Tag! Ihr guthaben betraegt " + guthaben + " Euro");
      System.out.println("Was moechten Sie tun?");                                
      System.out.println("Einzahlen 1");
      System.out.println("Auszahlen 2");
      System.out.println("Beenden 3");
  }

  private static boolean isInteger(String s){
    try{
      Integer.parseInt(s);
      // is an integer!
      return true;
    } catch (NumberFormatException e) {
      // not an integer!
      return false;
    }
  }
}                                
