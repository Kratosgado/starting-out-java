package getters_setters;

/**
 * CountHolder
 */
public class CountHolder {
   private int count = 0;

   public synchronized int getCount() {
      return count;
   }

   public synchronized void setCount(int c) {
      count = c;
   }
}