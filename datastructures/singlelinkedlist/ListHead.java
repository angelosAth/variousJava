
package singlelinkedlist;

/**
 *
 * @author angel
 */
public class ListHead {
    
        private Node FirstNode;  
        
        // points to first node of list
        ListHead(Node FirstNode){
            this.FirstNode = FirstNode;
        }
        // null for empty list
        ListHead(){
            this.FirstNode = null;
        }
        
        public Node getFirstNode(){
            return FirstNode;
        }
        
        public void setFirstNode(Node FirstNode){
            this.FirstNode = FirstNode;
        
        }
    }
    
