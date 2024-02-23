package dataStructures;

public class Main {
   public static void main(String[] args) {
      LinkedList<Integer> list = new LinkedList<Integer>();
      list.add(1);
      System.out.println(list);
      list.add(2);
      list.add(3);
      System.out.println(list.next());
      System.out.println(list.prev());
      System.out.println(list.next());
      System.out.println(list.next());
      list.add(4);
      list.add(5);
      list.add(6);
      list.add(7);
      list.add(8);
      System.out.println(list.next());
      list.add(9);
      list.add(10);
      System.out.println(list.isEmpty());
      System.out.println(list.size());
      list.remove(5);
      list.remove(10);
      list.remove(1);
      list.remove(7);
      list.remove(3);
      list.remove(8);
      list.remove(4);
      list.remove(6);
      list.remove(2);
      list.remove(9);
   }
}
