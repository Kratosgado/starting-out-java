package commandLine;

/**
 * Main
 */
public class Main {
   public static void main(String[] args) {
      if (args.length != 2) {
         System.err.println("usage: myapp");
         System.exit(1);
      }
      // run the application
      System.out.println(("It worked"));
   }
}