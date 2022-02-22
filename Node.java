/* Decompiler 29ms, total 113ms, lines 31 */
package activity;

public class Node {
   private Node next = null;
   private Object element;

   public Node() {
      this.element = null;
   }

   public Node(Object element) {
      this.element = element;
   }

   public Node getNext() {
      return this.next;
   }

   public void setNext(Node node) {
      this.next = node;
   }

   public Object getElement() {
      return this.element;
   }

   public void setElement(Object element) {
      this.element = element;
   }
}
