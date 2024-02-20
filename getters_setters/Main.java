package getters_setters;

public class Main {

   public static void main(String[] args) {
      CountHolder countHolder = new CountHolder();

      System.out.println(countHolder.getCount());
      countHolder.setCount(5);
      System.out.println(countHolder.getCount());

   }
}
