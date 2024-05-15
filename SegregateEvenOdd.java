Segregate even and odd elements in the list
public class Segregate
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void segregateEvenOdd()
    {
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;
       
        while(currentNode != null) {
            int element = currentNode.data;
           
            if(element % 2 == 0) {
               
                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }
               
            } else {
               
                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode =  currentNode.next;
        }
        if(oddStart == null || evenStart == null) {
            return;
        }
       
        evenEnd.next = oddStart;
        oddEnd.next = null;
        head=evenStart;
    }
    void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
   
    void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Seggregate llist = new Seggregate();
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.push(4);
        llist.push(5);
       
        System.out.println("Original Linked List");
        llist.printList();


        llist.segregateEvenOdd();


        System.out.println("Modified Linked List");
        llist.printList();
    }
}
