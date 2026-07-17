package com.deepthi.interviewprep;


public class LinkedListExample {

        private Node head ;
        public void createList(){
            Node first = new Node(10);
            Node second = new Node(20);
            Node third = new Node(30);

            first.next = second;
            second.next = third;
            head = first;
        }

        public void add(int data){
            //10->20->30->40->null
            Node newNode = new Node(data);
            // Case 1: the list is empty
            if(head == null){
                head = newNode;
                return;
            }
            // Case 2: the list already has nodes
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            // current is now the last node
            current.next = newNode;
        }

        public void printList(){
            Node current = head;
            while(current!=null){
                System.out.print(current.data+"->");
                current = current.next;
            }
            System.out.print("null");
        }




}
