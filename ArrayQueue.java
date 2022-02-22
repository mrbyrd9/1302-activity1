/* Decompiler 274ms, total 699ms, lines 59 */
package activity;

public class ArrayQueue implements QueueADT {
   private final int DEFAULT_SIZE = 5;
   private Object[] elements = new Object[5];
   private int numElements = 0;
   private int front = 0;
   private int back = -1;

   public void enqueue(Object item) {
      if (this.isFull()) {
         System.out.println("Queue is full - " + item + " not added");
      } else {
         this.back = (this.back + 1) % 5;
         this.elements[this.back] = item;
         ++this.numElements;
         if (this.numElements == 1) {
            this.front = this.back;
         }
      }

   }

   public Object dequeue() {
      Object val = this.elements[this.front];
      this.front = (this.front + 1) % 5;
      --this.numElements;
      if (this.numElements == 0) {
         this.back = this.front - 1;
      }

      return val;
   }

   public boolean isEmpty() {
      return this.numElements == 0;
   }

   public boolean isFull() {
      return this.numElements == 5;
   }

   public int size() {
      return this.numElements;
   }

   public String toString() {
      String result = "\n";
      int i = this.front;

      for(int count = 0; count < this.numElements; ++count) {
         result = result + this.elements[i] + "\n";
         i = (i + 1) % this.elements.length;
      }

      return result;
   }
}
