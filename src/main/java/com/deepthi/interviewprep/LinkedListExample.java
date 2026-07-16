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

        public void printList(){
            Node current = head;
            while(current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }




}
