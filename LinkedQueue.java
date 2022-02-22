/* Decompiler 68ms, total 337ms, lines 58 */
package activity;

public class LinkedQueue implements QueueADT {
   private Node front = null;
   private Node back = null;
   private int numElements = 0;

   public void enqueue(Object item) {
      Node tempNode = new Node();
      tempNode.setElement(item);
      if (this.back == null) {
         this.front = tempNode;
      } else {
         this.back.setNext(tempNode);
      }

      this.back = tempNode;
      ++this.numElements;
   }

   public Object dequeue() {
      Object item = null;
      if (!this.isEmpty()) {
         item = this.front.getElement();
         this.front = this.front.getNext();
         if (this.front == null) {
            this.back = null;
         }

         --this.numElements;
      }

      return item;
   }

   public boolean isEmpty() {
      return this.numElements == 0;
   }

   public boolean isFull() {
      return false;
   }

   public int size() {
      return this.numElements;
   }

   public String toString() {
      String result = "\n";

      for(Node temp = this.front; temp != null; temp = temp.getNext()) {
         result = result + temp.getElement() + "\n";
      }

      return result;
   }
}
