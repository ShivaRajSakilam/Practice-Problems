package Linkedlist;

class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Apna College
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
        // Apna College
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        // Apna College
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }

    public int getSize() {
        return size;
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
        LL list = new LL();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("2");
        list.addLast("1");
        list.printList();
        // System.out.println(list.getSize());
        // list.removeFirst();
        // Apna College
        // list.printList();
        // list.removeLast();
        list.printList();
        if(list.isPalin())
        System.out.println("the given LL is palindrome");
        else
        System.out.println("the given LL is not a palindrome");
        list.printList();
    }
}