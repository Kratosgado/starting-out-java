package dataStructures;

public class Node<T> {
   T value;
   Node<T> next;
   Node<T> prev;

   protected Node(T value) {
      this.value = value;
      this.next = null;
      this.prev = null;
   }
}
