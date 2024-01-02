// Custom exception class for empty stack
class StackEmptyException extends Exception {
}

// Class representing a stack implemented using an array
class StacksUsingArray {

    // Array to store elements of the stack
    private int[] storage;

    // Constructor to initialize the stack with a default size of 5
    StacksUsingArray() {
        storage = new int[5];
    }

    // Variable to keep track of the top element's index in the stack
    private int topIndex = -1;

    // Method to get the current size of the stack
    public int size() {
        return topIndex + 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return topIndex == -1;
    }

    // Method to push an element onto the stack
    public void push(int elem) {

        // Check if the stack is full
        if (topIndex == storage.length - 1) {

            // Double the capacity of the stack if it is full
            doubleCapacity();
        }
        // Increment the topIndex
        topIndex++;

        // Store the new element at the top of the stack
        storage[topIndex] = elem;
    }

    // Method to double the capacity of the stack
    private void doubleCapacity() {

        // Create a temporary array to hold current stack elements
        int[] temp = storage;

        // Create a new array with double the capacity
        storage = new int[temp.length * 2];

        // Copy elements from the temporary array to the new array
        for (int i = 0; i < temp.length; i++) {
            storage[i] = temp[i];
        }
    }

    // Method to return the top element of the stack
    public int top() throws StackEmptyException {

        // Check if the stack is empty
        if (topIndex == -1) {

            // Throw StackEptyException if the stack is empty
            throw new StackEmptyException();
        }

        // Return the top element of the stack
        return storage[topIndex];
    }

    // Method to remove and return the top element of the stack
    public int pop() throws StackEmptyException {

        // Check if the stack is empty
        if (topIndex == -1) {

            // Throw StackEptyException if the stack is empty
            throw new StackEmptyException();
        }

        // Get the top element of the stack
        int lastElement = storage[topIndex];

        // Decrement the topIndex to remove the top element
        topIndex--;

        // Return the removed top element
        return lastElement;
    }
}

// Main class to demonstrate the stack implementation using an array
public class StacksImplementationsUsingArray {
    public static void main(String[] args) {
        StacksUsingArray stack = new StacksUsingArray();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This will cause the stack to double its capacity

        // Remove and print the top element
        try {
            System.out.println("Popped Element: " + stack.pop());
        } catch (StackEmptyException e) {

            // Catch and print StackEptyException if the stack is empty
            System.out.println(e);
        }

        // Get and print the top element
        try {
            System.out.println("Top Most Element: " + stack.top());
        } catch (StackEmptyException e) {

            // Catch and print StackEptyException if the stack is empty
            System.out.println(e);
        }

        // Print the current size of the stack
        System.out.println("Stack Size: " + stack.size());

        // Print whether the stack is empty
        System.out.println("Stack Is Empty: " + stack.isEmpty());
    }
}
