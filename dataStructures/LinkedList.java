package dataStructures;

public class LinkedList<T> {
   private Node<T> head;
   private Node<T> currentNode;
      private int size;
   public LinkedList() {
      this.size = 0;
      this.currentNode = null;
      this.head = null;
   }
   
   public void add(T value) {
      Node<T> newNode = new Node<T>(value);
      if (this.isEmpty()) {
         this.head = newNode;
         this.currentNode = this.head;
      } else {
      
         Node<T> tempCurrentNode = this.currentNode;
         while (currentNode.next != null) {
            currentNode = currentNode.next;
         }
         this.currentNode.next = newNode;
         newNode.prev = this.currentNode;
         this.currentNode = tempCurrentNode;
      }
      this.size++;
      return;
   }

   public T next() {
      if (this.currentNode.next != null) {
         this.currentNode = this.currentNode.next;
         return this.currentNode.value;
      }
      throw new IndexOutOfBoundsException("No more elements in the list");
   }

   public T prev() {
      if (this.currentNode.prev != null) {
         this.currentNode = this.currentNode.prev;
         return this.currentNode.value;
      }
      throw new IndexOutOfBoundsException("No more elements in the list");
   }
   
   public String toString() {
      String result = "";
      Node<T> current = this.head;
      while (current != null) {
         result += current.value + " ";
         current = current.next;
      }
      return result;
   }

   public void remove(T value) {
      Node<T> current = this.head;
      while (current != null) {
         if (current.value == value) {
            if (current.prev != null) {
               current.prev.next = current.next;
            }
            if (current.next != null) {
               current.next.prev = current.prev;
            }
            this.size--;
            return;
         }
         current = current.next;
      }
   }
   
   public int size() {
      return this.size;
   }
   
   public boolean isEmpty() {
      return (this.size == 0) ? true : false;
   }
}
