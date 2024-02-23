package dataStructures;

public class LinkedList {
   /**
    * Node
    */
   public class Node {
      int value;
      Node next;

      protected Node(int value) {
         this.value = value;
         this.next = null;
      }
   }

   Node last;
   int size;
   public LinkedList() {
      this.size = 0;
      this.last = null;
   }
   
   //
   public void add(int value) {
      Node newNode = new Node(value);
      if (!this.isEmpty()) {
         this.last.next = newNode;
      }
   }

   
   public boolean isEmpty() {
      return (this.size == 0) ? true : false;
   }
}
