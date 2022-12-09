// package LinkedList;

public class LL {
    Node head=null;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }else{
        
        newNode.next=head;
        head=newNode;
        }
    }
    public static void main(String args[]){
    LL list = new LL();
    list.addFirst(1);
    list.addFirst(2);
    list.addFirst(3);

    System.out.println(list);

    }
}
