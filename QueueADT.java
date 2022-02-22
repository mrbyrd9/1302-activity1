/* Decompiler 1ms, total 77ms, lines 14 */
package activity;

public interface QueueADT {
   void enqueue(Object var1);

   Object dequeue();

   boolean isEmpty();

   boolean isFull();

   int size();
}
