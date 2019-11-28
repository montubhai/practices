package com;

public class DoublyLinkedList {
    private Node1 head;
    private Node1 tail;
    int size;

    public void addNode(int data) {
        Node1 node = new Node1();
        if (head == null) {
            node.data = data;
            head = tail = node;
            head.prev = null;
            tail.next = null;
        } else {
            node.data = data;
            tail.next = node;
            //newNode's previous will point to tail
            node.prev = tail;
            //newNode will become new tail
            tail = node;
            //As it is last node, tail's next will point to null
            tail.next = null;
        }
    }

    //display() will print out the nodes of the list
    public void display() {
        //Node current will point to head
        Node1 current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Prints each node by incrementing the pointer.

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList dList = new DoublyLinkedList();
        //Add nodes to the list
        dList.addNode(1);
        dList.addNode(2);
        dList.addNode(3);
        dList.addNode(4);
        dList.addNode(5);

        //Displays the nodes present in the list
        dList.display();
    }


}

class Node1 {
    public int data;
    public Node1 next;
    public Node1 prev;

    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }
}