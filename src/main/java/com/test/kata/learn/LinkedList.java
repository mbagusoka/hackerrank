package com.test.kata.learn;

public class LinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public LinkedList setHead(Node head) {
        this.head = head;
        return this;
    }

    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node setData(int data) {
            this.data = data;
            return this;
        }

        public Node getNext() {
            return next;
        }

        public Node setNext(Node next) {
            this.next = next;
            return this;
        }
    }
}
