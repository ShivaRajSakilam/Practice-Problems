package Linkedlist;
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

    public boolean isPalin(){
        //finding mid
        Node slow=this.head;
        Node fast=this.head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // System.out.println(slow.data+" "+fast.data);
        // if(this.size%2==0)
        
        //reversing 2nd half
        Node x=slow;
        Node prev=null;
        slow=slow.next;

        Node curr=slow;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        x.next=prev;
        fast=this.head;
        // printList();
        x=x.next;
        while(x!=null){
            // System.out.println(slow.data+" "+fast.data);
            if(x.data!=fast.data)
            return false;
            x=x.next;
            fast=fast.next;
        }
        return true;
    }


    public static void main(String args[]) {
        LL1 list = new LL1();
        list.addFirst(1);
        list.addLast(3);
        list.addLast(3);
        list.addLast(1);
        // list.addLast(1);
        list.printList();
        System.out.println();
        if(list.isPalin())
        System.out.println("the given LL is palindrome");
        else
        System.out.println("the given LL is not a palindrome");
        list.printList();
    }
}
