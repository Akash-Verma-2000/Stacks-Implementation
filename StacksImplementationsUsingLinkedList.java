// Node class representing each element in the stack
class Node {

    int data; // Data of the node
    Node next; // Reference to the next node

    // Constructor to initialize the node with data
    Node(int data) {
        this.data = data;
    }
}

// Stack class implementing stack operations using a linked list
class Stack {

    // Reference to the top of the stack
    private Node head;

    // Size of the stack
    private int size = 0;

    // Constructor to initialize an empty stack
    public Stack() {
        head = null;
        size = 0;
    }

    // Method to get the size of the stack
    public int size() {
        return size;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to push/add an element to the top of the stack
    public void push(int element) {

        // Creating a new node with the given element
        Node newNode = new Node(element);

        // If stack is empty, set the new node as head
        if (this.head == null) {
            head = newNode;

        } else {
            newNode.next = head; // Point the new node's next to the current head
            head = newNode; // Update head to the new node
        }

        size++; // Increase the size of the stack
    }

    // Method to pop/remove the element from the top of the stack
    public int pop() {

        // If stack is empty, return -1 indicating underflow
        if (size == 0) {
            return -1;

        } else {
            int temp = head.data;// Store the data of the current head
            head = head.next;// Move head to the next node
            size--; // Decrease the size of the stack
            return temp; // Return the popped element's data
        }
    }

    // Method to get the element at the top of the stack without removing it
    public int top() {

        // If stack is empty, return -1 indicating underflow
        if (size == 0) {
            return -1;

        } else {
            // Return the data of the current head
            return head.data;
        }
    }
}

// Main class
public class StacksImplementationsUsingLinkedList {

    public static void main(String[] args) {
        // The main method is currently empty, you can perform stack operations here
        // Create an object of Stack class and use its methods to perform stack
        // operations
    }

}
