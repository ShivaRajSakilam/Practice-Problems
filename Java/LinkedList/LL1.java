public class LL1 {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null) {
            head = newNode;
            return;
            }
        Node currNode = head;
        while(currNode.next!=null) {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    
    public void printList(){
        Node currNode = head;
        while(currNode!=null) {
            System.out.print(currNode.data+"-->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }


    public static void main(String args[]) {
        LL1 list = new LL1();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addLast(1);
        list.addLast(5);
        list.printList();
    }
}
