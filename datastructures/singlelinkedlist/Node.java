package singlelinkedlist;

/**
 *
 * @author angel
 */
public class Node {
    
        // the data in the node
        private int data;  
        // the reference to the next node
        private Node next;  
       
        
        
        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
        
        Node(int data){
            this.data = data;
            //null for the last node
            this.next = null;
        
        }
        
         Node(){
        
            this.next = null;
        
        }
        

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
        
        public void setNext(Node newNode) {
            this.next = newNode;
        }
        
    }
    
