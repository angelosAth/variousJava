package singlelinkedlist;

/**
 *
 * @author angel
 */
public class LinkedList {
    
    private final ListHead listHead;
    private Node newNode;
    private Node traverse;
    
    
    LinkedList(){
   
        listHead = new ListHead(newNode);
    
    }
    
    // insert new node after node
    public void insertAfter (int data, int choiceData){
  
        //the new node with the element 'choiceData'
        newNode = new Node(choiceData);
        //list's head points to the first node
        traverse = listHead.getFirstNode();
        //traverse the list to find the node with the element 'data'
        while (traverse != null){
             if (traverse.getData() == data){
                   newNode.setNext(traverse.getNext());
                   traverse.setNext(newNode);
                   return;
             }
            traverse = traverse.getNext();
        }
        System.out.println("The entry doesn't exist");
    }
    
    // insert node before current first node
    public void insertBeginning (int choiceData){
        //the new node with the element 'choiceData'
        newNode = new Node(choiceData);
        //the new element points to where list's head points
        newNode.setNext(listHead.getFirstNode());
        //now the list's head points to the new element
        listHead.setFirstNode(newNode);   
    }
    
    
    // remove node after the node with the element 'data'
    public void removeAfter (int data){
        traverse = listHead.getFirstNode();
         while (traverse != null){
             if (traverse.getData() == data){
                  if (traverse.getNext() != null)
                      traverse.setNext(traverse.getNext().getNext());
                  return;
             }
            traverse = traverse.getNext();
        }
        System.out.println("The entry doesn't exist");   
    }
    
    // remove first node
    public void removeBeginning (){
    
        if (listHead.getFirstNode() != null)
            //the list's head points to the next element of the first one
            listHead.setFirstNode(listHead.getFirstNode().getNext());
        else
            System.out.println("The list is empty!");
         
    }
    
    public void display (){
    
        if (listHead.getFirstNode() == null){
            System.out.println("The list is empty!");
            return;
        }
        
        traverse = listHead.getFirstNode();
        System.out.println("The elements in the list are : ");
        while (traverse != null){
            System.out.println(traverse.getData());
            traverse = traverse.getNext();
        }
    }
}
